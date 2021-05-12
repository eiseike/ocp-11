package not.canon.testbench;

import javax.lang.model.SourceVersion;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.*;
import java.util.stream.*;

public class Streamstuff {
    public static void main(String[] args) {
        {
            Stream<Long> longStream = LongStream.of(6L, 10L, 8L).mapToObj(x -> x);
            Stream<Long> boxed = LongStream.of(6L, 10L, 8L).boxed();
            //LongStream.of(6L, 10L, 8L).mapToInt(x -> x); //DNC: possible lossy conversion from long to int
            IntStream intStream = LongStream.of(6L, 10L, 8L).mapToInt(x -> (int) x);

            Map<Long, List<Long>> collect = LongStream.of(6L, 10L, 8L, 10L).mapToObj(x -> x)
                    .collect(Collectors.groupingBy(x -> x));

            //collect = {6=[6], 8=[8], 10=[10, 10]}
            System.out.println("collect = " + collect);

            IntStream intStream1 = LongStream.of(6L, 10L, 8L).mapToObj(x -> x)
                    .mapToInt(x -> Integer.valueOf(x.toString()));
            //.collect(Collectors.groupingBy(x -> x));

            Set<Long> longs = LongStream.of(6L, 10L, 8L).mapToObj(x -> x)
                    .collect(Collectors.groupingBy(x -> x)).keySet();

            Stream<Long> stream = LongStream.of(6L, 10L, 8L).mapToObj(x -> x)
                    .collect(Collectors.groupingBy(x -> x)).keySet().stream();


            Double collect1 = LongStream.of(6L, 10L, 8L).mapToObj(x -> x)
                    .collect(Collectors.groupingBy(x -> x)).keySet().stream()
                    .collect(Collectors.averagingLong(x -> x));

            System.out.println("collect1 = " + collect1);

        }
        {
            List<String> collect2 = Stream.of("one", "two", "three", "four")
                    .filter(e -> e.length() > 3)
                    .peek(e -> System.out.println("Filtered value: " + e))
                    .map(String::toUpperCase)
                    .peek(e -> System.out.println("Mapped value: " + e))
                    .collect(Collectors.toList());

            System.out.println("collect2 = " + collect2);
        }
        {

            Double collect = LongStream.of(6L, 8L, 10L)
                    .mapToInt(x -> (int) x)
                    .boxed()
                    .collect(Collectors.groupingBy(x -> x))
                    .keySet()
                    .stream()
                    .collect(Collectors.averagingInt(x -> x));

            System.out.println("collect = " + collect);

        }
        {

//            double result = LongStream.of(6L, 8L, 10L)
//                    .mapToInt(x -> (int) x) // !!!!! priomitive intStream
//                    .collect(Collectors.groupingBy(x -> x, Collectors.toSet())) //DNC
//                    .keySet()
//                    .stream()
//                    .collect(Collectors.averagingInt(x -> x));
        }

        {
            double result = LongStream.of(6L, 8L, 10L)
                    .mapToInt(x -> (int) x)
                    .boxed()
                    .peek(System.out::println)
                    .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                    .keySet()
                    .stream()
                    .collect(Collectors.averagingInt(x -> x));
            System.out.println("result = " + result);
        }

        {
            var s = Stream.generate(() -> "meow");
            var match = s.allMatch(String::isEmpty);
            System.out.println(match);
        }
        {
            var s = Stream.generate(() -> "");
            var match = s.anyMatch(String::isEmpty);
            System.out.println(match);
        }
        {
            List<String> list = List.of("3", "2", "11", "1", "A", "AA", "b", "bb");
            var list2 = list.stream().sorted((a, b) -> a.compareTo(b))
                    .collect(Collectors.toList());
            var list3 = sort(list);
            System.out.println("list = " + list);
            System.out.println("list2 = " + list2);
            System.out.println("list3 = " + list3);
        }

        {

            var stream = LongStream.of(1, 2, 3);
            var opt = stream.map(n -> n * 10)
                    .filter(n -> n < 5).findFirst();

            if (opt.isPresent())
                System.out.println(opt.getAsLong());

        }
        {
            Stream.generate(() -> "1")
                    .filter(x -> x.equals("1"))
                    .limit(10)
                    .forEach(System.out::print);
            System.out.println();
        }
        {
            System.out.println(Stream.iterate(1, x -> x++)
                    .limit(5).map(x -> x.toString())
                    .collect(Collectors.joining()));
        }

        {

            Supplier<String> xx = String::new;
            Function<String, String> m = x -> x;
            Function<String, String> n = x -> x;
            Function<String, String> y = m.andThen(n);
            UnaryOperator<String> z = a -> a + a;

        }
        {
            List<Integer> x1 = List.of(1, 2, 3);
            List<Integer> x2 = List.of(4, 5, 6);
            List<Integer> x3 = List.of();
            Stream.of(x1, x2, x3).flatMap(x -> x.stream()).map(x->x+1)
                    .forEach(System.out::print);
        }
        {
            Stream<Integer> s = Stream.of(1);
            //IntStream is = s.boxed();
            DoubleStream ds = s.mapToDouble(x -> x);
            //Stream<Integer> s2 = ds.mapToInt(x -> (int) x);
            //s2.forEach(System.out::print);
        }
        {
            var ohMy = Stream.of("lions", "tigers", "bears","a");
            Map<Integer, List<String>> collect = ohMy.collect(
                    Collectors.groupingBy(
                            String::length  // classifier
                    ));
            System.out.println(collect);    // {5=Optional[b], 6=Optional[t]}
        }
        {

             Predicate<String> empty = String::isEmpty;
             Predicate<String> notEmpty = empty.negate();

            var result = Stream.generate(() -> "")
                    .limit(10)
                    .filter(notEmpty)
                    .collect(Collectors.groupingBy(k -> k))
                    .entrySet()
                    .stream()
                    .map(Entry::getValue)
                    .flatMap(Collection::stream)
                    .collect(Collectors.groupingBy(n -> n));
            System.out.println("result = " + result);
        }
        {
            List<Integer> x = IntStream.range(1, 6)
                    .mapToObj(i -> i)
                    .collect(Collectors.toList());
            x.forEach(System.out::println);
        }
        {
            IntStream.range(1, 6)
                    .forEach(System.out::println);

        }
        {
            System.out.println("---");
            Stream<String> generate = Stream.generate(() -> "1");
            Stream<String> stringStream = generate.filter(x -> x.length() == 1);
            stringStream.limit(1).peek(System.out::println).forEach(System.out::println);
        }

    }

    private static List<String> sort(List<String> list) {
        var copy = new ArrayList<String>(list);
        Collections.sort(copy, (a, b) -> b.compareTo(a));
        return copy;
    }
}


