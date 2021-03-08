package chapter.o.XV.streams;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
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



    }
}
