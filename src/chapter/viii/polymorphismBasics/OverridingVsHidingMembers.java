package chapter.viii.polymorphismBasics;

public class OverridingVsHidingMembers {
	public static void main(String[] args) {
		SuperC4 superC4 = new SuperC4();
		superC4.p(); // SuperC4

		ChildC4 childC4 = new ChildC4();
		childC4.p(); // SuperC4

		//

		final Child m = new Child();
		final Person t = m;
		m.name = "Elysia";
		t.name = "Sophia";
		m.setName("Webby");
		t.setName("Olivia");
		System.out.println(m.name + " " + t.name);
	}
}

class SuperC4 {
	static int x = 1;
	public static String s() {
		return "SuperC4";
	}

	public void p() {
		System.out.println(this.s());
	}
}

class ChildC4 extends SuperC4 {
	int x = 2;
	public static String s() {
		return "ChildC4";
	}
}

class Person {
	static String name;
	static void setName(String q) {
		name = q;
	}
}

class Child extends Person {
	static String name;
	static void setName(String w) {
		name = w;
	}
}