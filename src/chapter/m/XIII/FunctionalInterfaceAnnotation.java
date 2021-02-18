package chapter.m.XIII;

public class FunctionalInterfaceAnnotation {
    public static void main(String[] args) {
    }
}

@FunctionalInterface interface Intelligence2 {
    int cunning();
}

//@FunctionalInterface
abstract class Reptile { //DNC: Unexpected @FunctionalInterface annotation;
    // Reptile is not a functional interface
    abstract String getName();
}

//@FunctionalInterface
interface Slimy {} //DNC: Unexpected @FunctionalInterface annotation;
    //Slimy is not a functional interface
    //no abstract method found in interface Slimy

@FunctionalInterface interface Scaley {
    boolean isSnake();
}

//@FunctionalInterface
interface Rough extends Scaley { //DNC: Unexpected @FunctionalInterface annotation;
    // Rough is not a functional interface
    // multiple non-overriding abstract methods found in interface Rough
    void checkType();
}

@FunctionalInterface interface Smooth extends Scaley {
    boolean equals(Object unused);
}


