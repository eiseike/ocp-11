package chapter.n.XIV;

import java.util.ArrayList;
import java.util.List;

public class UnboundedGenericWildcards {
    public static void printList(List<Object> list) {
        for (Object x : list)
            System.out.println(x);
    }
    public static void printList2(List<?> list) {
        for (Object x : list)
            System.out.println(x);
    }
    public static void printList3(List<? extends Object> list) {
        for (Object x : list)
            System.out.println(x);
    }
    public static void printList4(List<? super String> list) {
        for (Object x : list)
            System.out.println(x);
    }
    public static void printList5(List<? super String> list) {}

    public static void printList(Object e) {
        System.out.println(e);
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");

        //List<String> cannot be assigned to List<Object>.
        //printList(keywords); // DNC: incompatible types: String cannot be converted to Object

        //List<String> can be assigned to List<?> -> List<Any type>
        printList2(keywords); // Java

        //List<String> can be assigned to List<? extends Object> -> List<Object and its descendant types>
        printList3(keywords); // Java

        //List<String> can be assigned to List<? super String> -> List<String and its super types>
        printList4(keywords); // Java

        // String can be assigned to Object.
        printList("java2"); // Java2
    }
}

