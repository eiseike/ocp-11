package chapter.m.XIII;

import java.util.*;

public class SafeVarargsAnnoltation {
    public static void main(String[] args) {
        System.out.println(SafeVarargsAnnoltation.class);
    }
}

class NeverDoThis {
    final int thisIsUnsafe(List<Integer>... carrot) {
        Object[] stick = carrot;
        stick[0] = Arrays.asList("nope!");
        return carrot[0].get(0);  // ClassCastException at runtime
    }

    @Deprecated
    public static void main(String[] a) {
        var carrot = new ArrayList<Integer>();
        //new NeverDoThis().thisIsUnsafe(carrot);
    }

    @Deprecated @interface lool {}

    @SafeVarargs
    static final void omg(String... stuff) {}

}
