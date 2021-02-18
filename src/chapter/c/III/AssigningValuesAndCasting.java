package chapter.c.III;

import java.util.HashMap;
import java.util.Map;

import static chapter.c.III.NumericPromotion.g;

public class AssigningValuesAndCasting {
    public static void main(String[] args) {

        {
            // the compiler automatically casts smaller data type to a larger one:
            int i1 = 1;
            long l1 = i1;
            long explicitl1 = (long) i1; //this long is redundant

            // the compiler not casts larger data type to a smaller one:
            long l2 = 2L;
            //int i2 = l2; //DOES NOT COMPILE
            int expliciti2 = (int) l2;

            int fur = (int) 5;
            int hair = (short) 2;
            String type = (String) "Bird";
            short tail = (short) (4 + 10);
            //long feathers = 10(long);  // DOES NOT COMPILE


            //float egg = 2.0 / 9;        // DOES NOT COMPILE 2.0 is a double
            float egg = (float) 2.0 / 9;

            //int tadpole = (int)5 * 2L;  // DOES NOT COMPILE 2L is a Long
            int tadpole = 5 * (int) 2L;

            //short frog = 3 - 2.0;       // DOES NOT COMPILE, 2.0 is a double
            short frog = 3 - (short) 2.0;

            long explicitL10 = 10L;
            long implicitL10 = 10;

            System.out.println("explicitL10 = " + explicitL10);
            System.out.println("explicitL10 = " + g(explicitL10));
            System.out.println("implicitL10 = " + implicitL10);
            System.out.println("implicitL10 = " + g(implicitL10));
        }

        //compound operator:
        {
            int i1= 1;
            long l1 = 1L;

            //i1 = i1 + l1; // ERROR: 
            // incompatible types: possible lossy conversion from long to int

            //compound plus
            // implicit cast i1 to long =>
            // add 1L + 1L == 2L =>
            // cast 2L to int =>
            // add (int)2L to l1

            i1 += l1;

            System.out.println("i1 = " + i1);
            System.out.println("g(i1) = " + g(i1));

            System.out.println("tricky() = " + tricky());
            System.out.println("g(tricky()) = " + g(tricky()));


            short height = 1, weight = 3;
            //short zebra = (byte) weight * (byte) height; // Error: incompatible types: possible lossy conversion from int to short
            //short zebra = byte * byte => short zebra = int :(
            double ox = 1 + height * 2 + weight;
            long giraffe = 1 + 9 % height + 1;
            //System.out.println(zebra);
            System.out.println(ox);
            System.out.println(giraffe);

            //int note = 1 * 2 + (long)3; // Error: incompatible types: possible lossy conversion from long to int
            //short melody = (byte)(double)(note *= 2);
            //double song = melody;
            //float symphony = (float)((song == 1_000f) ? song * 2L : song);

            i1 = 1;
            System.out.println("(i1 = i1++) = " + (i1 = i1++));
            System.out.println("(i1 = ++i1) = " + (i1 = ++i1));


            int i = ~1;
            System.out.println("i = " + i);

            Map<String, String> nameMap = new HashMap<>();
            String value = nameMap.computeIfAbsent("John", s -> s);
            System.out.println("value = " + value);
        }
    }

    static long tricky() {
        return (int)1L;
    }

}
