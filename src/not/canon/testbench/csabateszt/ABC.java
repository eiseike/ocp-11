package not.canon.testbench.csabateszt;

public class ABC {
    public static void main(String[] args) {
        new A().callC();
        new B().callC();
    }
}

class A {
    void callC() {
        new C().c(this);
    }
}

class B extends A {}

class C {
    void c(A a) {
        System.out.println("a = " + a);
    }
}