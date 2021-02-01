package chapter.viii.polymorphismBasics;

public class Polymorph {
	public static void main(String[] args) {

		{
			ChildC cc = new ChildC();
			SuperI si_from_cc = cc;
			SuperC sc_from_cc = cc;

			//cc, si_from_cc and sc_from_cc are 3 references to a new ChildC object

			System.out.println("cc.a() = " + cc.a());
			System.out.println("cc.b() = " + cc.b());
			//SuperI has no relation with SuperC's a() method
			//System.out.println("si_from_cc.a() = " + si_from_cc.a()); // DNC: cannot find symbol
			System.out.println("si_from_cc.b() = " + si_from_cc.b());
			System.out.println("sc_from_cc.a() = " + sc_from_cc.a());
			//SuperC has no relation with SuperI's (and ChildC's) b() method
			//System.out.println("sc_from_cc.b() = " + sc_from_cc.b()); // DNC: cannot find symbol
			/*
			cc.a() = SuperC
			cc.b() = ChildC
			si_from_cc.b() = ChildC
			sc_from_cc.a() = SuperC
			*/
		}
		{
			SuperC sc = new SuperC();
			ChildC cc_from_sc = (ChildC) sc; //throws class SuperC cannot be cast to class ChildC
			//ChildC implicit_cc_from_sc = sc; //DNC: incompatible types: SuperC cannot be converted to ChildC

			ChildC cc = new ChildC();
			SuperC sc_from_cc = (SuperC) cc;
			SuperC implicit_sc_from_cc = cc;

			ChildC cc_from_sc_from_cc = (ChildC) sc_from_cc;
			//ChildC implicit_cc_from_sc_from_cc = sc_from_cc; //DNC: incompatible types: SuperC cannot be converted to ChildC
		}
	}
}

class SuperC {
	public String a() {
		return "SuperC";
	}
}

interface SuperI {
	public abstract String b();
}

class ChildC extends SuperC implements SuperI {
	public String b() {
		return "ChildC";
	}
}