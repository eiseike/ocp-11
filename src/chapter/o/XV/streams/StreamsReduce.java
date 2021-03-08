package chapter.o.XV.streams;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamsReduce {

    public static void main(String[] args) {
        {
            BinaryOperator<Integer> op = (a, b) -> a * b;
            Stream<Integer> empty = Stream.empty();
            Stream<Integer> oneElement = Stream.of(3);
            Stream<Integer> threeElements = Stream.of(3, 5, 6);

            empty.reduce(op).ifPresent(System.out::println);         // no output
            oneElement.reduce(op).ifPresent(System.out::println);    // 3
            threeElements.reduce(op).ifPresent(System.out::println); // 90
        }
        {
            Stream<String> stream = Stream.of("w", "o", "l", "f1");
            String conc = stream.reduce(
                    "", //identity
                    (String s1, String s2) -> s1+s2 //accumulator
            );
            System.out.println(conc); // wolf1
        }
        {
            Stream<String> stream = Stream.of("w", "o", "l", "f2");
            Optional<String> opt = stream.reduce(
                    (String s1, String s2) -> s1+s2 //accumulator
            );
            System.out.println(opt.orElse("???")); // wolf2
        }
        {
            Stream<String> stream = Stream.of("w", "o", "l", "f3");
            int length = stream.reduce(
                    0, //identity
                    (Integer i, String s) -> i+s.length(), //accumulator
                    (Integer a, Integer b) -> a+b //combiner
            );
            System.out.println(length); // 5
        }
    }
}
