package chapter.ix.creatingInterfaces;

import java.util.List;
import java.util.function.Predicate;

abstract public interface WalksOnTwoLegs {
}

class Biped {
    public static void main(String[] args) {
//		var e = new WalksOnTwoLegs();         // DNC: WalksOnTwoLegs is abstract
    }
}

//final interface WalksOnEightLegs {}  // DNC: final

//interface NoGood extends Object {} //DNC: interface expected here

interface Nocturnal {
    public int hunt();
}

interface CanFly {
    public void flap();
}

interface HasBigEyes extends Nocturnal, CanFly {
}

class Owl implements Nocturnal, CanFly {
    public int hunt() {
        return 5;
    }

    public void flap() {
        System.out.println("flap");
    }
}

///

//every line contains at least one error
//private final interface Crawl {
//	String distance;
//	private int MAXIMUM_DEPTH = 100;
//	protected abstract boolean UNDERWATER = false;
//	private void dig(int depth);
//	protected abstract double depth();
//	public final void surface();
//}

///


abstract class Husky {
    abstract void play();
}

interface Poodle {
    void play();
}

class Webby extends Husky {
    void play() {
    }
}

class Georgette implements Poodle {
    //void play() {} //DNC: play was public in the interface
    public void play() {
    }
}


///./

interface Canine {
}

class Dog implements Canine {
}

class Wolf implements Canine {
}

class BadCasts {
    public static void main(String[] args) {
        Canine canine = new Wolf();
        Canine badDog = (Dog) canine; //throws ClassCastException
    }
}

interface AnyInterfaceEver {
}

final class AnyFinalClass {
}

class foo {
    static void m() {
        Number i = 5;
        System.out.println(i instanceof List); //false
        System.out.println(i instanceof AnyInterfaceEver); //false

        // Integer is a final class:
        Integer i2 = 6;
        //System.out.println(i2 instanceof AnyInterfaceEver);//DNC Integer cannot be converted to AnyInterfaceEver

        // No final class can be inherited
        AnyFinalClass a = null;
        //System.out.println(a instanceof AnyInterfaceEver); //DNC: AnyFinalClass cannot be converted to cAnyInterfaceEver
    }
}

class Ca {
}

class Cb extends Ca {
}

//covariant returns

interface Ia {
    Number foo();
}

interface Ib {
    Comparable<Integer> foo();
}

interface Ic {
    Integer foo();
}

class Cc implements Ia, Ib, Ic {
    public Integer foo() {
        return null;
    } //Integer is covariant of Integer, Comparable<Integer> and Number as `public final class Integer extends Number implements Comparable<Integer>{}`
}

//trap

interface Jump {
    static public int MAX = 3;
}

abstract class Whale implements Jump {
    public abstract void dive();

    public static void main(String[] args) {
        Whale whale = new Orca();
        ((Orca) whale).dive(10);
    }
}

class Orca extends Whale {
    public void dive() {
        System.out.println("Orca diving");
    }

    public void dive(int... depth) {
        System.out.println("Orca diving deeper " + MAX);
    }
}


