package chapter.i.IX.creatingAbstractClasses;

abstract class Bird {
	public abstract String getName();

	public void printName() {
		System.out.print(getName());
	}
}

public class Stork extends Bird {
	public String getName() {
		return "Stork!";
	}

	public static void main(String[] args) {
		new Stork().printName();
	}
}

//DNC: Stork2 is not abstract and does not override
// abstract method getName() in Bird
//class Stork2 extends Bird {}

//DNC: Egret is not abstract and does not override
// abstract method peck() in Egret
//class Egret {  // DOES NOT COMPILE
//	public abstract void peck();
//}


//class abstract Jackal {  // DOES NOT COMPILE
//	public int abstract howl();  // DOES NOT COMPILE
//}
