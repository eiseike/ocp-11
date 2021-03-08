package chapter.o.XV;

import java.util.*;
import java.util.function.*;

public class ImplementingConsumers {
    public static void main(String[] args) {
        {
            Consumer<String> c1 = System.out::println;
            Consumer<String> c2 = x -> System.out.println(x);

            c1.accept("Annie");
            c2.accept("Annie");
        }
        {
            var map = new HashMap<String, Integer>();

            BiConsumer<String, Integer> b1 = map::put;
            BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

            b1.accept("chicken", 7);
            b2.accept("chick", 1);

            System.out.println(map);

        }
    }
}
