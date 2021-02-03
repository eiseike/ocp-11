package chapter.viii.polymorphismBasics;

public class PolymorphismAndMethodOverriding {
	public static void main(String[] args) {
		SuperC3 superC3 = new SuperC3();
		superC3.p(); // SuperC3

		ChildC3 childC3 = new ChildC3();
		childC3.p(); // ChildC3
	}
}

class SuperC3 {
	public String s() {return "SuperC3";}
	public void p(){
		System.out.println(this.s());
	}
}

class ChildC3 extends SuperC3 {
	public String s() {return "ChildC3";}
}