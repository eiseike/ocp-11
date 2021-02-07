package chapter.viii.understaidingobjectcasting;

public class Runner {
	public static void main(String[] args) {
		System.out.println("-ss---------------------------------------------");

		SuperC ss = new SuperC();

		System.out.println("ss.s = " + ss.s);
		System.out.println("ss.ss = " + ss.ss);
		ss.method1();
		ss.method2();
		ss.method3();
		System.out.println("ss.s = " + ss.s);
		System.out.println("ss.ss = " + ss.ss);

		SuperC.ss= "static SuperC";
		ChildC.ss = "static ChildC";
		System.out.println("-cc---------------------------------------------");

		ChildC cc = new ChildC();
		System.out.println("cc.s = " + cc.s);
		System.out.println("cc.ss = " + cc.ss);
		cc.method1();
		cc.method2();
		cc.method3();
		System.out.println("cc.s = " + cc.s);
		System.out.println("cc.ss = " + cc.ss);

		SuperC.ss= "static SuperC";
		ChildC.ss = "static ChildC";
		System.out.println("-sc---------------------------------------------");

		SuperC sc = new ChildC();
		System.out.println("sc.s = " + sc.s);
		System.out.println("sc.ss = " + sc.ss);
		sc.method1();
		sc.method2();
		sc.method3();
		System.out.println("sc.s = " + sc.s);
		System.out.println("sc.ss = " + sc.ss);

		SuperC.ss= "static SuperC";
		ChildC.ss = "static ChildC";
		System.out.println("-csc--------------------------------------------");


//		ChildC csc = (ChildC) new SuperC(); // boom!
//
//		System.out.println("sc.s = " + sc.s);
//		System.out.println("sc.ss = " + sc.ss);
//		sc.method1();
//		sc.method2();
//		sc.method3();
//		System.out.println("sc.s = " + sc.s);
//		System.out.println("sc.ss = " + sc.ss);
	}

}

class SuperC {
	String s = "initial SuperC";
	static String ss = "static SuperC";

	void method1(){
		System.out.println("SuperC.method1()");
	}
	void method2(){
		s = "modified SuperC";
	}
	static void method3(){
		ss = "modified static SuperC";
	}
	SuperC() {
		System.out.println("SuperC constructor called");
		s = "SuperC constructor was here";
		ss = "this is static: SuperC constructor was here";
	}
	{System.out.println("SuperC instance initialization block called");}
	static
	{System.out.println("SuperC static initialization block called");}

}
class ChildC extends SuperC {
	String s = "initial ChildC";
	static String ss = "static ChildC";
	void method1(){
		System.out.print("Calling super.method1(): ");
		super.method1();
		System.out.println("ChildC.method1()");
	}
	void method2(){
		System.out.print("Calling super.method2(): ");
		s = "modified ChildC";
		System.out.println("super.s = " + super.s);
	}
	static void method3(){
		ss = "modified static ChildC";
	}
	ChildC() {
		super(); //implicit
		System.out.println("ChildC constructor called");
		s = "ChildC constructor was here";
		ss = "his is static: ChildC constructor was here";
	}
	{System.out.println("ChildC instance initialization block called");}
	static
	{System.out.println("ChildC static initialization block called");}

}

class Double{}
class Float extends Double {}