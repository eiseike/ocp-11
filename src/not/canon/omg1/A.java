package not.canon.omg1;

public class A {
	protected final String a;
	public A() {
		a="a";
	}
	public static void main(String[] args) {

		A a = new B();
		System.out.println("a.a = " + a.a);
		//a.omg1(); // cannot find symbol
		((B)a).omg1(); // omg
		
		B b = new B();
		b.omg1();
		System.out.println("b.a = " + b.a);

		A aa = new A();
		//System.out.println("a.b = " + a.b); //cannot find symbol

		A ab = new B();
		System.out.println("ab.a = " + ab.a); // protected in same package
	}
}