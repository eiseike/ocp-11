package chapter.h.VIII.iplicitSuperCalling;

public class Main {

	public static void main(String[] args) {
		Integer i = null;
		new Funky(false);
		//new Funky(null);
	}
}

class Funky {
	Funky(int i) {
		System.out.println("Funky int");
	}
	Funky(Integer i) {
		System.out.println("Funky Integer");
	}
	Funky(String s) {
		System.out.println("Funky String");
	}
	Funky(Object o) {
		System.out.println("Funky Object");
	}

}
//
//
//class SuperC {
//
//	{
//		System.out.println(" 3 " + SuperC.class + " as " + this + " dynamic initializer block called");
//	}
//	static {
//		// 1
//		System.out.println(" 1 " + SuperC.class + " static initializer block called");
//	}
//	@Override
//	public String toString() {
//		return "ThisIsFun{}";
//	}
//	SuperC(){
//		System.out.println(" 4 "+ SuperC.class + " as " + this + " constructor called");
//	}
//	SuperC(int i){
//		System.out.println(" X "+ SuperC.class + "(int i) as " + this + " constructor called");
//	}
//}
//
//class ChildC extends SuperC {
//	{
//		System.out.println(" 5 " + ChildC.class + " as " + this + " dynamic initializer block called");
//	}
//	static {
//		System.out.println(" 2 " + ChildC.class + " static initializer block called");
//	}
//	ChildC(){
//		super(1); // if there is no explicit super call, this line is optional
//		System.out.println(" 6 " + ChildC.class + " as " + this + " constructor called");
//	}
//
//	@Override
//	public String toString() {
//		return "ChildIsFun{}";
//	}
//}


//class SuperC {
//	String a = "Super";
//}
//class ChildC extends SuperC {
//	String a = "Child";
//	ChildC() {
//		System.out.println(super.a + ";" + a ); // Super;Child
//	}
//}


//class SuperC {
//	String a = "Super";
//}
//class ChildC extends SuperC {
//	String a = "Child";
//	ChildC() {
//		System.out.println(this.a + ";" + a ); // Child;Child
//	}
//}

//class C {
//	C() { // DNC: recursive constructor invocation
//		this();
//	}
//}

class SuperC {
	String a = "Super";

	public SuperC() {
	}
}

class ChildC extends SuperC {
	ChildC() {
		//ChildC(1); // cannot find symbol - constructor only callable with new
		System.out.println(a);
		new ChildC(1);
		System.out.println(a);
	}

	ChildC(int i) {
		System.out.println("this(" + i + ") called");
		a = "Modified Child";
	}
}


/*
`new ChildC();`
this(1) called
this() called
 */
