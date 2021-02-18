package chapter.m.XIII;

import java.util.ArrayList;
import java.util.List;

public class HeapPollution {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("one");

        @SuppressWarnings("unchecked")
        List<Integer> integerList = (List<Integer>)(Object)stringList;
        //var integer = integerList.get(0);
        //System.out.println(integer); //throws ClassCastException: class String cannot be cast to Integer
        System.out.println(integerList.get(0)); // one - OMG :O


        ArrayList aList = new ArrayList();
        aList.add(1);

//      System.out.println(aList.get(0));


    }

    @SafeVarargs
    public static void boom(List<String>... l) {}

    @SuppressWarnings("unchecked")
    public static void boom(List l) {
        l.add("1");
    }

    @SafeVarargs
    @SuppressWarnings("unchecked")
    public static void kaBoom(List<String>... l) {
        List<Integer> l2 = (List<Integer>)(Object)l;
    }



}
