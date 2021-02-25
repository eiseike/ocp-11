package chapter.n.XIV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InmutableLists {
    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "c"};
        List<String> asList = Arrays.asList(array); // [a, b, c]
        List<String> of = List.of(array);           // [a, b, c]
        List<String> copy = List.copyOf(asList);    // [a, b, c]

        array[0] = "z";

        System.out.println(asList); // [z, b, c]
        System.out.println(of);     // [a, b, c]
        System.out.println(copy);   // [a, b, c]

        asList.set(0, "x");
        //of.set(0,"y"); // throws UnsupportedOperationException
        //copy.set(0,"y"); // throws UnsupportedOperationException
        System.out.println(Arrays.toString(array)); // [x, b, c]

        //asList.add("y");  // throws UnsupportedOperationException
        //of.add("y");  // throws UnsupportedOperationException
        //copy.add("y");  // throws UnsupportedOperationException


        List<String> list = new ArrayList<>();
        //list.add(1,"ADDED"); // IndexOutOfBoundsException
        //list.get(0); // IndexOutOfBoundsException
        //list.remove(0); // IndexOutOfBoundsException
        //list.set(0, "?");                // IndexOutOfBoundsException
        list.add("SD");                  // [SD]
        list.add(0, "NY");               // [NY,SD]
        list.set(1, "FL");               // [NY,FL]
        System.out.println(list.get(0)); // NY
        System.out.println(list);
        list.remove("NY");               // [FL]
        list.remove(0);                  // []
        list.add(0,"REPLACEME"); // [REPLACEME]
        list.replaceAll(s -> "REPLACED"); // [REPLACED]


    }
}

