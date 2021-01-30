package not.canon.omg1.C;

import not.canon.omg1.A;
import not.canon.omg1.B;

public class C extends A {
	public static void main(String... arrr) {
		B b = new B();
		b.omg1();
		//System.out.println("b.a = " + b.a); //DNC: a has protected access
		//System.out.println("b.b = " + b.b); //DNC: b has protected access
		C c = new C();
		c.CanISeeADotA();

	}
	public void CanISeeADotA() {
		System.out.println(a);
	}
	public void CanISeeBDotB() {
		// System.out.println(b); // cannot find symbol
	}
}


