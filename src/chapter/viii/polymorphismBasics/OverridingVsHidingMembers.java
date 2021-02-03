package chapter.viii.polymorphismBasics;

public class OverridingVsHidingMembers {
	public static void main(String[] args) {
		SuperC4 superC4 = new SuperC4();
		superC4.p(); // SuperC4

		ChildC4 childC4 = new ChildC4();
		childC4.p(); // SuperC4
	}
}

class SuperC4 {
	public static String s() {return "SuperC4";}
	public void p(){
		System.out.println(this.s());
	}
}

class ChildC4 extends SuperC4 {
	public static String s() {return "ChildC4";}
}