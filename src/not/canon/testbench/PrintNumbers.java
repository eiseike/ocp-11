package not.canon.testbench;

import java.awt.color.ProfileDataException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class PrintNumbers {
    private int length = 5;

    public void calculate() {
        final int width = 20;
        int effectiveFinalWidth = 21;
        class MyLocalClass {
            public void multiply() {
                System.out.print(length * width * effectiveFinalWidth);
            }
        }
        MyLocalClass local = new MyLocalClass();
        local.multiply();

        Consumer<String> c = s -> {System.out.print(s);};
        Supplier<String> s = () -> {return "a";};
        Supplier<String> s2 = () -> "a"; //expression lambda
        System.out.println(s2.get());
    }

    public PrintNumbers() {
        length = 1;
    }

    public static void main(String[] args) {
        PrintNumbers outer = new PrintNumbers();
        outer.calculate();
    }
}
