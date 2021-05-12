package not.canon.testbench;

import java.util.HashSet;
import java.util.Iterator;

public class Hello<T> {
    T t;
    public Hello(T t) { this.t = t; }
    public String toString() { return t.toString(); }
    private <T> void println(T message) {
        System.out.print(t + "-" + message);
    }
    public static void main(String[] args) {
        //new IFuckingHateJava<String>("hi").println(1);
        new Hello("hola").println(true);


 var numbers = new HashSet<Number>();
 numbers.add(Integer.valueOf(86));
 numbers.add(75);
 numbers.add(Integer.valueOf(86));
 numbers.add(null);
 numbers.add(309L);
 Iterator iter = numbers.iterator();
 while (iter.hasNext())
    System.out.print(iter.next());
    }
}

class IFuckingHateJava<T> {
    T t;
    public IFuckingHateJava(T t) { this.t = t; }
    public String toString() { return t.toString(); }
    private <T> void println(T message) {
        System.out.print(t + "-" + message);
    }
}