package chapter.n.XIV;

public class GenericInterfaces {

    {
        class Crate<T> { // <T> is the generic class type, eg ROBOT in this scenario
            public <T> T tricky(T t) { // <T> is the generic method type, eg String in this scenario
                return t;
            }
        }
        Crate<Robot> crate = new Crate<>();
        System.out.println(crate.tricky("Mikrobi")); // Mikrobi

    }

    public static void main(String[] arrrr) {

        GenericInterfaces box = new GenericInterfaces();

        String[] args = new String[3];

        GenericInterfaces.ship("package");
        GenericInterfaces.<String>ship("package");

        GenericInterfaces.ship(args);
        GenericInterfaces.<String[]>ship(args);


    }
    public static <T> Crate<T> ship(T t) {
        System.out.println("Shipping " + t);
        return new Crate<T>();
    }

}

class Robot{}

interface Shippable<T> {
    void ship(T t);
}

// create a concrete class
class ShippableRobotCrate implements Shippable<Robot> {
    public void ship(Robot t) {}
}

// create a generic class
class ShippableAbstractCrate<U> implements Shippable<U> {
    //static U something; // DNC: non-static type variable U cannot be referenced from a static context
    U something2;
    public void ship(U t) {}
}

// create a raw type class
class ShippableCrate implements Shippable {
    public void ship(Object t) { }
}


