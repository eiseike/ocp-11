package chapter.iv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        {
            final String[] names = new String[3];

            names[0] = "Lisa";
            names[1] = "Kevin";
            names[2] = "Roger";

            for (String name : names) { // Lisa, Kevin, Roger,
                System.out.print(name + ", ");
            }
            System.out.println();
        }
        {
            List<String> values = new ArrayList<String>();
            // Lisa, Kevin, Roger,
            values.add("Lisa");
            values.add("Kevin");
            values.add("Roger");

            for (var value : values) {
                System.out.print(value + ", ");
            }
            System.out.println();
        }
        {
            /*
            String names = "Lisa";
            for (String name : names) {   // DNC: for-each not applicable type of String
                System.out.print(name + " ");
            }
            */
        }
        {
            /*
            String[] names = new String[3];
            for (int name : names) {  // DNC: String cannot be converted to int
                System.out.print(name + " ");
            }
             */
        }
        {
            int[] values = new int[3];
            values[0] = 1;
            values[1] = Integer.valueOf(3);
            values[2] = 6;
            for (int i = 1; i < values.length; i++) { // 2, 3,
                System.out.print((values[i] - values[i - 1]) + ", ");
            }
            System.out.println();
        }
        {
            List<String> values = new ArrayList<String>();
            values.add("Lisa");
            values.add("Kevin");
            values.add("Roger");

            for (Iterator<String> i = values.iterator(); i.hasNext(); ) {
                // Lisa, Kevin, Roger,
                String value = i.next();
                System.out.print(value + ", ");
            }
            System.out.println();
        }
    }
}
