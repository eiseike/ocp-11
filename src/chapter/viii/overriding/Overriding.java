package chapter.viii.overriding;

import javax.annotation.processing.SupportedOptions;

public class Overriding {
	public static void main(String[] args) {
		ChildC c = new ChildC();
		SuperC s = c;
		SuperC sc = new ChildC();
		//ChildC cs = new SuperC(); //DNC: SuperC cannot be converted to ChildC
		System.out.println("c.name = " + c.name);
		System.out.println("s.name = " + s.name);
		System.out.println("sc.name = " + sc.name);
		//s.say(); //DNC: cannot find symbol
		c.say();
		s.name="x";
		System.out.println("c.name = " + c.name);
		System.out.println("s.name = " + s.name);
		System.out.println("sc.name = " + sc.name);

		/*
		c.name = ChildC
		s.name = SuperC
		sc.name = SuperC
		ChildC
		*/
	}
}
class SuperC {
	public String name = "SuperC";
}

class ChildC extends SuperC {
	public String name = "ChildC";
	public void say() {
		System.out.println(name);
	}
}
