package chapter.m.XIII;

public class OverrideAnnotation {
    public static void main(String[] args) {

    }
}

interface Intelligence {
    int cunning();
    static void staticCunning(){};
    public static final int i = 1;
}
class Canine implements Intelligence {
    @Override public int cunning() { return 500; }
    void howl() { System.out.print("Woof!"); }

    public static void main(String[] args) {
        System.out.println(i);
    }

}
class Wolf extends Canine {
    @Override
    public int cunning() { return Integer.MAX_VALUE; }
    @Override void howl() { System.out.print("Howl!"); }
    static void staticCunning(){};
}

class Kaboom extends Canine {
    //@Override //DNC: method does not override or implement a method from a supertype
    public boolean playFetch() { return true; }
    //@Override void howl(int timeOfDay) {}  //DNC: method does not override or implement a method from a supertype
    //@Override  //DNC: static methods cannot be annotated with @Override
    static void staticCunning(){};
    //@Override //annotation type not applicable to this kind of declaration
    static int i = 2;

}