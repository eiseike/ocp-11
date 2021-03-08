package chapter.o.XV;

import java.util.function.*;

public class ImplementingFunctions {
    public static void main(String[] args) {
        {
            Function<String, Integer> f1 = String::length;
            Function<String, Integer> f2 = x -> x.length();

            System.out.println(f1.apply("cluck")); // 5
            System.out.println(f2.apply("clucker")); // 7
        }
        {
            BiFunction<String, String, String> b1 = String::concat;
            BiFunction<String, String, String> b2 =
                    (string, toAdd) -> string.concat(toAdd);

            System.out.println(b1.apply("baby ", "chick")); // baby chick
            System.out.println(b2.apply("baby ", "chicken")); // baby chicken
        }
        {
            BiFunction<String, String, Integer> getSub = (a,b) -> a.indexOf(b);
            System.out.println(getSub.apply("faszálítók","fa")); // 0
            System.out.println(getSub.apply("faszén","sz")); // 2

        }
    }
}

