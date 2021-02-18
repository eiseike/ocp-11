package chapter.h.VIII.polymorphismBasics;

public class PolymorphismAndMethodOverriding {
	public static void main(String[] args) {
		SuperC3 superC3 = new SuperC3();
		System.out.println(superC3.s());
		superC3.p(); // SuperC3
		superC3.trap();
		//superC3.trap(true); // DNC

		ChildC3 childC3 = new ChildC3();
		System.out.println(childC3.s());
		childC3.p(); // ChildC3
		childC3.trap();
		childC3.trap(true);

		SuperC3 impostor = new ChildC3();
		//WTF
		System.out.println("WTF");
		System.out.println(impostor.s());
		impostor.p();
		impostor.trap();
		//impostor.trap(true); // DNC
	}
}

class SuperC3 {
	public String s() {return "SuperC3";}
	public void p(){
		System.out.println(this.s());
	}
	public void trap(){}
}

class ChildC3 extends SuperC3 {
	public String s() {return "ChildC3";}
	public void trap(boolean evil){}
}