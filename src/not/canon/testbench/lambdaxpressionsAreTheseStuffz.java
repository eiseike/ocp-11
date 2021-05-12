package not.canon.testbench;

import java.util.function.Consumer;

class Camel{}



public class lambdaxpressionsAreTheseStuffz {
    public static void main(String[] args) {


        Consumer<Camel> camelConsumer = (final Camel c) -> {};

        Exceptionthrower e = (x,y) -> new RuntimeException();



    }
}

@FunctionalInterface
interface Exceptionthrower {
    public abstract Exception throwThat(int a, int b);
}