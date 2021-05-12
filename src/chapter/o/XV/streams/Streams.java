package chapter.o.XV.streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        {

            Stream<String> empty = Stream.empty();          // count = 0
            Stream<Integer> singleElement = Stream.of(1);   // count = 1
            Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 3
        }
        {
            var list = List.of("a", "b", "c");
            Stream<String> fromList = list.stream();
        }
        {
            Stream<String> s = Stream.of("brown bear-", "grizzly-");
            s.sorted(Comparator.reverseOrder())
                    .forEach(System.out::print); // grizzly-brown bear-
        }
        {
            //Stream<String> s = Stream.of("brown bear-", "grizzly-");
            //s.sorted(Comparator::reverseOrder) //DNC: incompatible types: incompatible parameter types in method reference
            //    .forEach(System.out::print); // grizzly-brown bear-
        }
        {
            System.out.println();
            Predicate<String> p = s -> s.length() > 3;
            Stream<String> stream = Stream.iterate("-", s -> !s.isEmpty(), (s) -> s + s);
            //stream.limit(3).forEach(System.out::println);
            // -
            // --
            // ---

            var b1 = stream.noneMatch(p); // it will return false when the stream reaches ---
            System.out.println(b1); //false
            //var b2 = stream.anyMatch(p); // java.lang.IllegalStateException: stream has already been operated upon or closed
        }
    }
}
