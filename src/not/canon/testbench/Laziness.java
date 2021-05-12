package not.canon.testbench;


import java.util.function.Supplier;
import java.util.stream.Stream;

class Lazy<T> {
    Supplier<T> supplier;
    T instance;
    public Lazy (Supplier<T> supplier) {
        this.supplier=supplier;
    }
    public T get() {
        if (instance == null) {
            instance = supplier.get();
            supplier = null; //gc
        }
        return instance;
    }
}
public class Laziness {

    static int compute(int i) {
        System.out.println("Working...");
        return i;
    }

    public static void main(String[] args) {
        Lazy<Integer> l = new Lazy<>(()->compute(1));
        Stream.iterate(0,i->i<5, i->++i).forEach(i-> System.out.println(l.get()));
    }
}
