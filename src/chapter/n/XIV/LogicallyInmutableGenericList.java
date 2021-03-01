package chapter.n.XIV;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogicallyInmutableGenericList {
    static class Bird {}
    static class Sparrow extends Bird {}
    public static void main(String[] args) {
        List<? extends Bird> birds = new ArrayList<Bird>();
        //birds.add(new Sparrow()); // DNC: Sparrow cannot be converted to capture#1 of ? extends Bird
        //birds.add(new Bird());    // DNC: Bird cannot be converted to capture#2 of ? Bird

        List<String> strings = new ArrayList<>();
        List<Object> objects = new ArrayList<Object>(strings);
        addSound(strings);
        addSound(objects);
        System.out.println(strings);
        System.out.println(objects);

        removeSound(strings);
        removeSound(objects);
        System.out.println(strings);
        System.out.println(objects);

        List<? super IOException> exceptions = new ArrayList<Exception>();
        //exceptions.add(new Exception()); //DNC: Exception cannot be converted to capture#1 of ? super IOException
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());


    }
    static void addSound(List<? super String> l) {
        l.add("quack");
    }
    static void removeSound(List<?> l) {
        l.remove("quack");
    }

}

