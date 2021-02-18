package chapter.g.VII;

//static import java.lang.Math.PI; //DNC: class, interface, or enum expected
//import static java.lang.Math; //DNC: package java does not exist (???)

//import static chapter.seven.B.TYPE;

public class StaticSpecifier {
	public static void main(String[] args) {

		// System.out.println("TYPE = " + TYPE); //DNC: reference to TYPE is ambiguous	both variable TYPE in chapter.seven.A and variable TYPE in chapter.seven.B match

		StaticSpecifier.print(); // print!
		System.out.println(StaticSpecifier.i); // 0

		StaticSpecifier ss = new StaticSpecifier();

		// sc.print is a shortcut to StaticSpecifier.print()
		ss.print(); // print!

		// sc.i is a shortcut to StaticSpecifier.i
		System.out.println(ss.i); // 0

		ss = null;

		// sc may be null, but sc.i is a shortcut to StaticSpecifier.i
		ss.print(); // print!

		// sc may be null, but sc.i is a shortcut to StaticSpecifier.i
		System.out.println(ss.i); // 0

		new Class3();


	}

	static void print() {
		System.out.println("print!");
	}

	static int i = 0;
}

class Static {
	private String name = "Static class";

	public static void first() {}

	public void second() {
		System.out.println(name);
	}

	public static void main(String args[]) {
		first();
//		second(); //DNC: non-static method third() cannot be referenced from a static context
	}
}

class Static2 {
	private String name = "Static class";

	public static void first() {
	}

	public static void second() {
//		System.out.println(name); //DNC: non-static variable name cannot be referenced from a static context
	}

	public static void main(String args[]) {
		first();
		second();
	}
}

class Class3 {
	static{
		System.out.println(1);
	}
	{
		System.out.println(3);
	}
	Class3() {
		System.out.println(5);
	}
	static{
		System.out.println(2);
	}
	{
		System.out.println(4);
	}
}

class Static4 {
	private static int one;
	private static final int two;
	private static final int three = 3;
//	private static final int four;    // DNC: variable not initialized in the default constructor

	static {
		one = 1;
		two = 2;
//		three = 3;                     // DNC: cannot assign a value to final variable
//		two = 2;                       // DNC: cannot assign a value to final variable
	}
}
