package chapter.viii.iplicitSuperCalling;

public class Main {

	public static void main(String[] args) {
		System.out.println("`ChildC deleteMe;`");
		//ChildC deleteMe; // -> 1
		System.out.println("`SuperC deleteMe2;`");
		SuperC deleteMe2; // -> (nothing) -- 1 called before
		System.out.println("`new ChildC();`");
		new ChildC(); // -> 2, 3, 4, 5, 6
		System.out.println("`new ChildC();`");
		new ChildC(); // -> 3, 4, 5, 6 -- 2 is called before

		/*
		1 class chapter.viii.SuperC static initializer block called
		2 class chapter.viii.ChildC static initializer block called
		3 class chapter.viii.SuperC as ChildIsFun{} dynamic initializer block called
		4 class chapter.viii.SuperC as ChildIsFun{} constructor called
		5 class chapter.viii.ChildC as ChildIsFun{} dynamic initializer block called
		6 class chapter.viii.ChildC as ChildIsFun{} constructor called
		----
		3 class chapter.viii.SuperC as ChildIsFun{} dynamic initializer block called
		4 class chapter.viii.SuperC as ChildIsFun{} constructor called
		5 class chapter.viii.ChildC as ChildIsFun{} dynamic initializer block called
		6 class chapter.viii.ChildC as ChildIsFun{} constructor called
		*/
	}
}


class SuperC {

	{
		System.out.println(" 3 " + SuperC.class + " as " + this + " dynamic initializer block called");
	}
	static {
		// 1
		System.out.println(" 1 " + SuperC.class + " static initializer block called");
	}
	@Override
	public String toString() {
		return "ThisIsFun{}";
	}
	SuperC(){
		System.out.println(" 4 "+ SuperC.class + " as " + this + " constructor called");
	}
}

class ChildC extends SuperC {
	{
		System.out.println(" 5 " + ChildC.class + " as " + this + " dynamic initializer block called");
	}
	static {
		System.out.println(" 2 " + ChildC.class + " static initializer block called");
	}
	ChildC(){
		System.out.println(" 6 " + ChildC.class + " as " + this + " constructor called");
	}

	@Override
	public String toString() {
		return "ChildIsFun{}";
	}
}