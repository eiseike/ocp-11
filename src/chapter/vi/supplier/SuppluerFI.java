package chapter.vi.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SuppluerFI {

	public static void main(String[] args) {
		Supplier<Integer> number = () -> new Random().nextInt();

		System.out.println(returnNumber(number));
	}

	private static int returnNumber(Supplier<Integer> supplier) {
		return supplier.get();
	}
}

