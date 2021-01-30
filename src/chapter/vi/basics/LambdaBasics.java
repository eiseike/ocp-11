package chapter.vi.basics;

import java.util.ArrayList;
import java.util.List;

public class LambdaBasics {
	public static void main(String[] args) {

		// list of animals
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true, false));
		animals.add(new Animal("kangaroo", true, false, true));
		animals.add(new Animal("rabbit", true, false, true));
		animals.add(new Animal("turtle", false, true, false));

		// pass class that does check
		print(animals, new CheckIfHopper());

		// use anonim class:
		print(animals, new CheckTrait() {
			@Override
			public boolean test(Animal a) {
				return a.canSwim();
			}
		});

		// use a lambda like a pro
		print(animals, Animal::isFurry);

	}

	private static void print(List<Animal> animals,
							  CheckTrait checker) {
		for (Animal animal : animals) {

			// the general check
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}

class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	private boolean furry;

	public Animal(String speciesName, boolean hopper, boolean swimmer, boolean furry) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
		this.furry = furry;
	}

	public boolean isFurry() {
		return furry;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public String toString() {
		return species;
	}
}


interface CheckTrait {
	boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
	public boolean test(Animal a) {
		return a.canHop();
	}
}
