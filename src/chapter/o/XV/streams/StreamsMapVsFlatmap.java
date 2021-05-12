package chapter.o.XV.streams;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsMapVsFlatmap {
    public static void main(String[] args) {
        {
            Stream.of(1, 2, 3, 4)
                    .map(s -> s * 2)
                    .forEach(System.out::print); // 2468
        }
        {
            Stream.of(1, 2, 3, 4)
                    .flatMap(s -> Stream.of(s, s*2))
                    .forEach(System.out::print); // 12243648
        }
        {
            //flatMap usecase

            int[] ints1 = {1, 2, 3};
            int[] ints2 = {9, 8, 7};
            Stream.of(ints1, ints2)
                    .forEach(System.out::print);
            //[I@7a79be86I@34ce8af7

            Stream.of(ints1, ints2)
                    .flatMapToInt(IntStream::of) //[I@7a79be86I => Stream.of(1,2,3)
                    .forEach(System.out::print);
            //192837

            Stream.of(ints1, ints2)
                    .flatMapToInt(IntStream::of) //[I@7a79be86I => Stream.of(1,2,3)
                    .min()
                    .ifPresent(System.out::print);
            //1


        }
        {
            Stream<String> s = Stream.of("brown bear-", "grizzly-");
            s.sorted(Comparator.reverseOrder())
                    .forEach(System.out::print); // grizzly-brown bear-

        }

    }
}
