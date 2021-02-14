package chapter.xii.functionalProgramming.functionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tiger implements Sprint {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sprint(100);

        Sprint s = tmp_s -> System.out.println("Animal's speed: " + tmp_s);
        s.sprint(200);

        Predicate<String> testIt = (final var string) -> true;

        Consumer<String> consumeIt = (final var string) -> {};


    }
    public void sprint(int speed) {
        System.out.println("Animal is sprinting fast! " + speed);
    }
}

@FunctionalInterface
interface Sprint {
    default void intoNothingness(){}
    public void sprint(int speed);
}
@FunctionalInterface
interface Dash extends Sprint {}

//@FunctionalInterface //DNC: Skip is not a functional interface; multiple non-overriding abstract methods found in interface Skip
interface Skip extends Sprint {
    void skip();
}

//@FunctionalInterface //DNC: Sleep is not a functional interface; no abstract method found in interface Sleep
interface Sleep {
    private void snore() {}
    default int getZzz() { return 1; }
}

@FunctionalInterface
interface Climb {
    void reach();
    default void fall() {}
    static int getBackUp() { return 100; }
    private static boolean checkHeight() { return true; }
}

//@FunctionalInterface
interface Soar {
    abstract String toString();
}
