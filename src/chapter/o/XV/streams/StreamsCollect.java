package chapter.o.XV.streams;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCollect {
    public static void main(String[] args) {
        {
            Stream<String> stream = Stream.of("w", "o", "l", "f", "4");

            StringBuilder word = stream.collect(
                    StringBuilder::new,
                    StringBuilder::append,
                    StringBuilder::append);

            System.out.println(word); // wolf4

        }
        {
            Stream<String> stream = Stream.of("w", "o", "l", "f");

            TreeSet<String> set = stream.collect(
                    TreeSet::new,
                    TreeSet::add,
                    TreeSet::addAll);

            System.out.println(set); // [f, l, o, w]
        }
        {
            Stream<String> stream = Stream.of("w", "o", "l", "f");

            TreeSet<String> set =
                    stream.collect(Collectors.toCollection(TreeSet::new));

            System.out.println(set); // [f, l, o, w]
        }
        {
            Stream<String> stream = Stream.of("w", "o", "l", "f");

            Set<String> set = stream.collect(Collectors.toSet());

            System.out.println(set); // [f, w, l, o] (probably)

        }
    }
}
