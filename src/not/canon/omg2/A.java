package not.canon.omg2;

public class A {
	public static void main(String[] args) {
		B bb = new B();
		A aa = new A();
		C cx = new C();

		A ab = new B(); // A super B
		//B ba = new A(); //incompatible types, B not super A
		A ac = new C(); // A super C
		B bc = new C(); // B super C
		//C cb = new B(); //incompatible types, C not super B
		//C ca = new A(); //incompatible types, C not super A
	}
}
class B extends A {}
class C extends B {}