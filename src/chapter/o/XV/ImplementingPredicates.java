package chapter.o.XV;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ImplementingPredicates {
    public static void main(String[] args) {
        {

            Predicate<String> p1 = String::isEmpty;
            Predicate<String> p2 = x -> x.isEmpty();

            System.out.println(p1.test("notempty"));  // false
            System.out.println(p2.test(""));  // true

        }
        {
            BiPredicate<String, String> b1 = String::startsWith;
            BiPredicate<String, String> b2 =
                    (string, prefix) -> string.startsWith(prefix);

            System.out.println(b1.test("rooster", "chick"));  // false
            System.out.println(b2.test("chicken", "chick"));  // true

        }
    }
}
