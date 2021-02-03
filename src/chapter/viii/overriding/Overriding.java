package chapter.viii.overriding;

import java.util.Locale;

public class Overriding {
	public static void main(String[] args) {

		ChildC cc = new ChildC();
		System.out.println(" -------------------------------------------");

		SuperC sc = cc;
		SuperC ss = new SuperC();

		System.out.println(" -------------------------------------------");


		//ChildC cs = new SuperC(); //DNC: SuperC cannot be converted to ChildC

		System.out.println("cc = " + cc);
		System.out.println("cc.name = " + cc.name);
		System.out.println("cc.getSuperName() = " + cc.getSuperName());
		System.out.println("cc.getStaticName() = " + cc.getStaticName());
		cc.say("cc");
		System.out.println(" -------------------------------------------");
		System.out.println("s = " + sc);
		System.out.println("s.name = " + sc.name);
		System.out.println("((ChildC)sc).getSuperName() = " + ((ChildC)sc).getSuperName());
		System.out.println("sc.getStaticName() = " + sc.getStaticName());
		sc.say("sc");
		System.out.println(" -------------------------------------------");
		System.out.println("ss = " + ss);
		System.out.println("ss.name = " + ss.name);
		System.out.println("ss.getStaticName() = " + ss.getStaticName());
		ss.say("ss");
		System.out.println(" -------------------------------------------");


	}
}

class SuperC {
	private final static String staticName = "SuperC";
	public String name = "SuperC";
	public static int i = 1;
	public void say(String n) {
		System.out.println(n +".name = " + name);
		System.out.println(n +".i = " + i);
	}
	SuperC(){
		System.out.println("super created!");
	}
	static String getStaticName(){return staticName;};

}

class ChildC extends SuperC {
	private static String staticName = "ChildC";
	public String name = "ChildC";
	public static int i = 2;
	{super.name+=" hacked by ChildC";}
	public String getSuperName() {
		return super.name;
	}
	public void say(String n) {
		System.out.println(n +".name = " + name);
		System.out.println(n +".i = " + i);
	}
	ChildC() {super();
		System.out.println("child created!");}

	static String getStaticName(){return staticName;};

}
