package chapter.c.III;

import java.io.File;

public class EqualityOperators {
    public static void main(String[] args) {

        System.out.println("(1 == 1) = " + (1 == 1));
        // (1 == 1) = true

        System.out.println("(1 != 1) = " + (1 != 1));
        // (1 != 1) = false

        System.out.println("(5 == 5L) = " + (5 == 5L)); //int 5 promoted to long 5

        System.out.println("(5L == 5.) = " + (5L == 5.)); //long 5 promoted to double

        System.out.println("(true == false) = " + (true == false));
        // (true == false) = false

        System.out.println("(new Integer(1) == new Integer(1)) = " +
                (new Integer(1) == new Integer(1)));
        // (new Integer(1) == new Integer(1)) = false

        System.out.println("(new Boolean(true) == new Boolean(true)) = " +
                (new Boolean(true) == new Boolean(true)));
        // (new Boolean(true) == new Boolean(true)) = false

        // boolean monkey = true == 3;       // DOES NOT COMPILE
        // boolean ape = false != "Grape";   // DOES NOT COMPILE
        // boolean gorilla = 10.2 == "Koko"; // DOES NOT COMPILE

        File monday = new File("schedule.txt");
        File tuesday = new File("schedule.txt");
        File wednesday = tuesday;
        System.out.println("(monday == tuesday) = " + (monday == tuesday));    // false
        System.out.println("(tuesday == wednesday) = " + (tuesday == wednesday)); // true

        System.out.println("(null == null) = " + (null == null)); //true

        /*
        (1 == 1) = true
        (1 != 1) = false
        (5 == 5L) = true
        (5L == 5.) = true
        (true == false) = false
        (new Integer(1) == new Integer(1)) = false
        (new Boolean(true) == new Boolean(true)) = false
        (monday == tuesday) = false
        (tuesday == wednesday) = true
        (null == null) = true
         */
    }
}
