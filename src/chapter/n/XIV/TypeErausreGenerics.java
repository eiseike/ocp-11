package chapter.n.XIV;

public class TypeErausreGenerics {
    public static void main(String[] args) {
        Crate<Stuff> gc = new Crate<>();
        gc.packCrate(new Stuff());
        Stuff st = gc.emptyCrate();

        Crate2 gc2 = new Crate2();
        gc2.packCrate(st);
        Stuff st2 = (Stuff) gc2.emptyCrate();

        System.out.println(st); // Stuff@1234
        System.out.println(st2);// Stuff@1234 (the two Stuff the same)

    }
}

class Stuff {}

class Crate<T> {
    private T contents;
    public T emptyCrate() {
        return contents;
    }
    public void packCrate(T contents) {
        this.contents = contents;
    }
}
class Crate2 {
    private Object contents;
    public Object emptyCrate() {
        return contents;
    }
    public void packCrate(Object contents) {
        this.contents = contents;
    }
}