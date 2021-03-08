package chapter.o.XV;

import java.util.List;
import java.util.function.*;

public class CatchTheErrors {
    public static void main(String[] args) {
        {
            Predicate<List> ex1 = x -> "".equals(x.get(0));

            Consumer<Long> ex2 = (Long l) -> System.out.println(l);

            BiPredicate<String, String> ex3 = (s1, s2) -> false;
        }
        {
            //Function<List<String>> ex1 = x -> x.get(0); // DOES NOT COMPILE
            Function<List<String>, String> ex1 = x -> x.get(0);
            //UnaryOperator<Long> ex2 = (Long l) -> 3.14; // DOES NOT COMIPLE
            UnaryOperator<Long> ex2 = (Long l) -> Long.valueOf(314);
            //Predicate ex4 = String::isEmpty;            // DOES NOT COMPILE
            Predicate ex4 = (o) -> true;
        }
        {
            Predicate<String> ex = String::isBlank;
            System.out.println(ex.test(""));
            System.out.println(ex.test(String.valueOf(false)));
        }
    }
}