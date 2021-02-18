package chapter.l.XII.nestedClasses;

import chapter.a.I.packagea.ClassA;

import java.io.Serializable;

//TODO: static inner classes
//TODO: local classes (Local classes can access final and effectively final local variables.)

public class InnerClasses {
    static class BadStaticClass {
    } //modifier static not allowed here

    public static void main(String[] args) {

        OuterClass.A a = new OuterClass().new A();
        //B b = new B(); //DNC: cannot find symbol
        //C c = new C(); //DNC: cannot find symbol
        //D d = new D(); //DNC: cannot find symbol

        OuterClass.A.B bb = a.new B();
        OuterClass.A.B.C cc = bb.new C();
        OuterClass.A.B.C.D dd = cc.new D();

        //This won't work; an enclosing instance that contains A is required
        //new A().new B().new C().new D().allTheX(); //DNC:non-static variable this cannot be referenced from a static context

        new OuterClass().new A().new B().new C().new D();

        var o = new Object(){};
        System.out.println(o);

        Ghost.main();
        Ghost.main2();

    }
}

class OuterClass {

    public class A extends ClassA implements Serializable {
        //static int i = 0; //DNC: Illegal static declaration in inner class A
        private static final int x = 10;

        protected class B {
            private int x = 20;

            final class C {
                private int x = 30;

                class D {
                    private int x = 40;

                    public void allTheX() {
                        System.out.println(x);          // 40
                        System.out.println(this.x);     // 40
                        System.out.println(C.this.x);   // 30
                        System.out.println(B.this.x);   // 20
                        System.out.println(A.this.x);   // 10
                    }

                    void inD() {
                        A a = new A();
                        B b = new B();
                        C c = new C();
                        D d = new D();
                        A aa = new A();
                        A.B bb = aa.new B();
                        A.B.C cc = bb.new C();
                        A.B.C.D dd = cc.new D();
                    }
                }

                void inC() {
                    A a = new A();
                    B b = new B();
                    C c = new C();
                    D d = new D();
                }
            }

            void inB() {
                A a = new A();
                B b = new B();
                C c = new C();
                //D d = new D(); //DNC: cannot find symbol

                A.B.C.D dd = c.new D();
            }
        }

        void inA() {
            A a = new A();
            B b = new B();
            //C c = new C(); //DNC: cannot find symbol
            //D d = new D(); //DNC: cannot find symbol

            B.C bc = new B().new C();
            B.C.D bcd = new B().new C().new D();
        }
    }
}

// Anonymous classes

class Ghost {
    public void boo() {
        System.out.println("Boo!");
    }
    public static void main(String... haunt) {
        var g = new Ghost() {
            @Override
            public void boo() {
                System.out.println("I ain't afraid of java");
            }
        };
        g.boo(); // I ain't afraid of java
    }
    public static void main2(String... haunt) {
        var g = new Ghost(){};
        g.boo(); // Boo!
    }
}

class ZooGiftShop {
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };  // Don't forget the semicolon!

        return basePrice - sale.dollarsOff();
    }
}

class ZooGiftShop2 {
    interface SaleTodayOnly {
        int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {

            @Override
            public int dollarsOff() {
                return 3;
            }
        };

        //O hey u, there is a lambda :P
        SaleTodayOnly sale2 = () -> 3;

        return basePrice - sale.dollarsOff();
    }
}

class ZooGiftShop3 {
    interface SaleTodayOnly {
        int dollarsOff();
    }

    public int pay() {

        return admission(5, new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        });
    }

    public int admission(int basePrice, SaleTodayOnly sale) {
        return basePrice - sale.dollarsOff();
    }
}
