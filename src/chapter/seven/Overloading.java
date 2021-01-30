package chapter.seven;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Overloading {

	// same arguments
	public void a() {
	}
	//public static void a(){} // DNC: method is already defined in class
	//public String a(){} // DNC: method is already defined in class
	//private int a(){} // DNC: method is already defined in class

	// erasure
	//public void a(List<String> strings) {} // DNC: clash, same erasure
	//public void a(List<Integer> integers) {} // DNC: clash, same erasure
	public void a(List integers) {
	}

	// legal overloads
	public void a(String s) {
	}

	public void a(String s, int i) {
	}

	public void a(int i, String s) {
	}

	public void a(int i, String... s) {
	}

	public void a(Integer i) {
		System.out.println("void a(Integer i)");
	}

	public void a(int i) {
		System.out.println("void a(int i)");
	}

	// array vs varargs
	public void a(int[] i) {
		System.out.println("public void a(int[] i)");
	}
	//public void a(int... i){} // DNC: cannot declare both a(int...) and a(int[])

	public void b(int... i) {
		System.out.println("void b(int... i)");
	}

	public void c(Integer i) {
		System.out.println("void c(Integer i)");
	}

	public void d(int i) {
		System.out.println("void d(int i)");
	}

	public void e(int i) {
		System.out.println("void e(int i)");
	}

	public void e(Object i) {
		System.out.println("void e(Object i)");
	}

	public static void promotion(Iterable i) {
		System.out.println("I");
	}

	public static void promotion(CharSequence c) {
		System.out.println("C");
	}

	public static void promotion(Object o) {
		System.out.println("O");
	}

	public static void primitives(int i) {
		System.out.println("void primitives(int i)");
	}

	public static void primitives(long l) {
		System.out.println("void primitives(long l)");
	}

	public static void primitives(float f) {
		System.out.println("void primitives(float f)");
	}

	public static void primitives(Object o) {
		System.out.println("void primitives(Object o)");
	}

	public static void conversion(Long l) {
	}

	public static void main(String[] args) {
		Overloading o = new Overloading();

		// varargs == arrays, arrays != varargs
		o.a(new int[]{1, 2, 3}); // -> public void a(int[] i)
		//o.a(1,2,3);      // -> DNC: method cannot be applied to given types
		o.b(new int[]{1, 2, 3}); // -> void b(int... i)
		o.b(1, 2, 3);        // -> void b(int... i)

		// overloading
		o.a(1); // -> void a(int i)
		o.a(Integer.valueOf(1)); // -> void a(Integer i)

		// boxing
		o.c(1); // -> void c(Integer i)
		o.c(Integer.valueOf("1")); // -> void c(Integer i)

		// boxing
		o.d(1); // -> void d(int i)
		o.d(Integer.valueOf("1")); // -> void d(int i)

		// cast before boxing
		o.e(1); // -> void e(int i)
		o.e(Integer.valueOf("1")); // -> void e(Object i)

		// promotion
		promotion("abc"); // -> C
		promotion(new ArrayList<>()); // -> I
		promotion(LocalDate.of(2019, Month.JULY, 4)); // -> O

		//primitives
		primitives(1); // -> void primitives(int i)
		primitives(1L); // -> void primitives(long l)
		primitives(1.0f); // -> void primitives(float f)
		primitives(1.0); // -> void primitives(Object o)

		// too many conversions
		//conversion(1); // incompatible types: int cannot be converted to java.lang.Long (1 => lL => Long{1})
		conversion(1L); // long can be converted to Long (lL => Long{1})
		conversion(Long.valueOf(1)); // Long
	}
}
