package chapter.o.XV.streams;

import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStreams {
    public static void main(String[] args) {
        {
            var ohMy = Stream.of("lions", "tigers", "bears");
            Map<String, Integer> map = ohMy.collect(Collectors.toMap(
                    s -> s,          // keyMapper
                    String::length   // valueMapper
            ));
            System.out.println(map); // {lions=5, bears=5, tigers=6}
        }
        {
//            var ohMy = Stream.of("lions", "tigers", "bears");
//            Map<Integer, String> map = ohMy.collect(
//                    Collectors.toMap(String::length, s -> s)); //throws java.lang.IllegalStateException
        }
        {
            var ohMy = Stream.of("lions", "tigers", "bears");
            Map<Integer, String> map = ohMy.collect(Collectors.toMap(
                    String::length,             // keyMapper
                    s -> s,                     // valueMapper
                    (s1, s2) -> s1 + "," + s2   // mergeFunction
            ));
            System.out.println(map);            // {5=lions,bears, 6=tigers}
            System.out.println(map.getClass()); // class java.util.HashMap
        }
        {
//            var ohMy = Stream.of("lions", "tigers", "bears");
//            TreeMap<Integer, String> map = ohMy.collect(
//                    Collectors.toMap(String::length, s->s, (s1, s2) -> s1 + "," + s2)); //DNC:  incompatible types:
//            System.out.println(map); // {5=lions,bears, 6=tigers}
//            System.out.println(map.getClass()); // class java.util.TreeMap
        }
        {
            var ohMy = Stream.of("lions", "tigers", "bears");
            TreeMap<Integer, String> map = ohMy.collect(Collectors.toMap(
                    String::length,             // keyMapper
                    s -> s,                     // valueMapper
                    (s1, s2) -> s1 + "," + s2,  // mergeFunction
                    TreeMap::new));             // mapSullpier
            System.out.println(map);            // {5=lions,bears, 6=tigers}
            System.out.println(map.getClass()); // class java.util.TreeMap


        }

        {
            var ohMy = Stream.of("lions", "tigers", "bears");
            Map<Integer, List<String>> map = ohMy.collect(
                    Collectors.groupingBy(
                            String::length // classifier
                    ));
            System.out.println(map);       // {5=[lions, bears], 6=[tigers]}

        }
        {
            var ohMy = Stream.of("lions", "tigers", "bears");
            Map<Integer, Set<String>> map = ohMy.collect(
                    Collectors.groupingBy(
                            String::length,    //classifier
                            Collectors.toSet() //downstream collector
                    ));
            System.out.println(map);    // {5=[lions, bears], 6=[tigers]}

        }

        {
            var ohMy = Stream.of("lions", "tigers", "bears");
            TreeMap<Integer, Set<String>> map = ohMy.collect(
                    Collectors.groupingBy(
                            String::length,    //classifier
                            TreeMap::new,      // mapFactory
                            Collectors.toSet() //downstream collector
                    ));
            System.out.println(map); // {5=[lions, bears], 6=[tigers]}

        }
        {
            var ohMy = Stream.of("lions", "tigers", "bears");
            TreeMap<Integer, List<String>> map = ohMy.collect(
                    Collectors.groupingBy(
                            String::length,    //classifier
                            TreeMap::new,      // mapFactory
                            Collectors.toList() //downstream collector
                    ));
            System.out.println(map); // {5=[lions, bears], 6=[tigers]}

        }
        {
            var ohMy = Stream.of("lions", "tigers", "bears");
            Map<Integer, Long> map = ohMy.collect(
                    Collectors.groupingBy(
                            String::length,       //classifier
                            Collectors.counting() //downstream collector
                    ));
            System.out.println(map);    // {5=2, 6=1}

        }
        {
            var ohMy = Stream.of("lions", "tigers", "bears");
            Map<Boolean, List<String>> map = ohMy.collect(
                    Collectors.partitioningBy(
                            s -> s.length() <= 5 //predicate
                    ));
            System.out.println(map);    // {false=[tigers], true=[lions, bears]}
        }
        {
            var ohMy = Stream.of("lions", "tigers", "bears");
            Map<Boolean, Set<String>> map = ohMy.collect(
                    Collectors.partitioningBy(
                            s -> s.length() <= 5, //predicate
                            Collectors.toSet()
                    ));
            System.out.println(map);    // {false=[tigers], true=[lions, bears]}
        }

        {
            var ohMy = Stream.of("lions", "tigers", "bears");
            Map<Integer, Optional<Character>> map = ohMy.collect(
                    Collectors.groupingBy(
                            String::length,  // classifier
                            Collectors.mapping(
                                    s -> s.charAt(0),
                                    Collectors.minBy((a, b) -> a - b))));
            System.out.println(map);    // {5=Optional[b], 6=Optional[t]}
        }
    }
}
