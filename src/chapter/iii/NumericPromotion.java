package chapter.iii;

public class NumericPromotion {
    public static void main(String[] args) {


        int i1 = 1;
        long l1 = 1;
        var l1pi1 = i1 + l1; // int vs long, int wins!
        System.out.println("l1pi1 = " + l1pi1);
        System.out.println("g(l1pi1) = " + g(l1pi1));
        System.out.println();

        float f1 = 1f;
        double d1 = 1;
        var f1pd1 = f1 + d1; // float vs double, double wins!
        System.out.println("f1pd1 = " + f1pd1);
        System.out.println("getClass(f1pd1) = " + g(f1pd1));
        System.out.println();

        var i1pf1 = i1 + f1; // int vs float =>
        // integral number vs floating point number => floating point wins =>
        // float wins!
        System.out.println("i1pf1 = " + i1pf1);
        System.out.println("g(i1pf1) = " + g(i1pf1));
        System.out.println();

        // Smaller data types, namely, byte, short, and char, are first promoted
        // to int any time they’re used with a Java binary arithmetic operator,
        // even if neither of the operands is int.

        short s1 = 1;
        short s2 = 2;
        var s1ps2 = s1 + s2;
        System.out.println("s1ps2 = " + s1ps2);
        System.out.println("g(s1ps2) = " + g(s1ps2));
        System.out.println();

    }

    // get classes of stuff:
    public static Class g(Object o) {
        return o.getClass();
    }
    public static Class g(int i) {
        return int.class;
    }
    public static Class g(long l) {
        return long.class;
    }
    public static Class g(double d) {
        return double.class;
    }
    public static Class g(Character c) {
        return Character.class;
    }
}
