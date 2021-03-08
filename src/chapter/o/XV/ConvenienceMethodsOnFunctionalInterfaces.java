package chapter.o.XV;

import java.util.function.Predicate;

public class ConvenienceMethodsOnFunctionalInterfaces {
    public static void main(String[] args) {
        {
            Predicate<String> egg = s -> s.contains("egg");
            Predicate<String> brown = s -> s.contains("brown");

            Predicate<String> notAnEgg = s -> ! s.contains("egg");
            Predicate<String> brownEggs =
                    s -> s.contains("egg") && s.contains("brown");
            Predicate<String> otherEggs =
                    s -> s.contains("egg") && ! s.contains("brown");
            Predicate<String> brownsOrEggs =
                    s -> s.contains("egg") || s.contains("brown");

            Predicate<String> coolNotAnEgg = egg.negate();
            Predicate<String> coolBrownEggs = egg.and(brown);
            Predicate<String> coolOtherEggs = egg.and(brown.negate());
            Predicate<String> coolBrownsOrEggs = brown.or(egg);


            System.out.println(coolNotAnEgg.test("wine")); //true
        }
    }
}
