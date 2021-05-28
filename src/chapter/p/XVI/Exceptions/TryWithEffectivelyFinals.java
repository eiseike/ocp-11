package chapter.p.XVI.Exceptions;

public class TryWithEffectivelyFinals {
    public static void main(String[] args) throws Exception {

        // Starting with Java 9, it is possible to use resources declared prior to the try‐with‐resources statement,
        // provided they are marked final or effectively final. The syntax is just to use the resource name in place
        // of the resource declaration, separated by a semicolon ( ;).


        final var stringOne = new MyString("4");
        MyString stringTwo = new MyString("5");
        MyString stringBroken = new MyString("()-*");
        try (stringOne;
             var StringThree = new MyString("6");
             stringTwo;
             //stringBroken //DNC: variable stringBroken used as a try-with-resources resource neither final nor effectively final
        ) {
            System.out.println("Try Block");
        } finally {
            System.out.println("Finally Block");
        }
        stringBroken = new MyString("Goes BOOM!");
        // OPENING: 4
        // OPENING: 5
        // OPENING: ()-*
        // OPENING: 6
        // Try Block
        // CLOSING: 5
        // CLOSING: 6
        // CLOSING: 4
        // Finally Block
        // OPENING: Goes BOOM!
    }
}


