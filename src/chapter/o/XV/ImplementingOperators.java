package chapter.o.XV;

import java.util.function.*;

public class ImplementingOperators {
    public static void main(String[] args) {
        /*
        @FunctionalInterface
        public interface UnaryOperator<T> extends Function<T, T> {}

        @FunctionalInterface
        public interface BinaryOperator<T> extends BiFunction<T, T, T> {}
        // the method signatures look like this:
        T apply(T t);         // UnaryOperator
        T apply(T t1, T t2);  // BinaryOperator
        */
        {
            UnaryOperator<String> u1 = String::toUpperCase;
            UnaryOperator<String> u2 = x -> x.toUpperCase();

            System.out.println(u1.apply("chirp"));  // CHIRP
            System.out.println(u2.apply("chirp!!!"));  // CHIRP!!!
        }
        {
            BinaryOperator<String> b1 = String::concat;
            BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);

            System.out.println(b1.apply("baby ", "chick")); // baby chick
            System.out.println(b2.apply("baby ", "chicken")); // baby chicken
        }
    }
}
