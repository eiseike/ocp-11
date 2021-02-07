package chapter.ix.constructorsInAbstractClasses;

abstract class Bear {
	abstract Comparable<String> chew();

	public Bear() {
		System.out.println(chew());
	}
}

public class Panda extends Bear {
	String chew() {
		return "yummy!";
	}

	public static void main(String[] args) {
		new Panda(); // yummy!
	}
}

abstract class Turtle {
	//public abstract long eat()      // DOES NOT COMPILE
	//public abstract void swim() {}; // DOES NOT COMPILE
	//public abstract int getAge() {  // DOES NOT COMPILE
	//	return 10;
	//}
	//public void sleep;              // DOES NOT COMPILE
	//public void goInShell();        // DOES NOT COMPILE
}

// final, private and static cannot be abstract

//abstract final class Tortoise {  // DOES NOT COMPILE
//	public abstract final void walk();   // DOES NOT COMPILE
//}
//
//abstract class Whale {
//	private abstract void sing();  // DOES NOT COMPILE
//}
//
//abstract class Hippopotamus {
//	abstract static void swim();  // DOES NOT COMPILE
//}

abstract class Animal {
	public abstract String getName();
}

//class Walrus extends Animal {} // DOES NOT COMPILE

///

// Any time a concrete class is extending an abstract class,
// it must implement all of the methods that are inherited as abstract.
abstract class Mammal {
	abstract void showHorn();
	abstract void eatLeaf();
}

abstract class Rhino extends Mammal {
	void showHorn(){}
}

class BlackRhino extends Rhino {
	void eatLeaf(){}
}

///

abstract class Animal2 {
	abstract String getName();
}
abstract class BigCat extends Animal2 {
	protected abstract void roar();
}

class Lion extends BigCat {
	public String getName() {
		return "Lion";
	}
	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}
}

