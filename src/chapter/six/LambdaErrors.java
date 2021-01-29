package chapter.six;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaErrors {

	public void method() {
		x((var x) -> {}, (var x, var y) -> 0);
		x((String x) -> {}, (Boolean x, Boolean y) -> 0);

	}
	public void x(Consumer<String> x, Comparator<Boolean> y) { }


	public static void main(String[] args) {
		Predicate<String> p = x -> true;
		Predicate<String> p2 = (var x) -> true;
		Predicate<String> p3 = (String x) -> true;
		BiPredicate<String, String> p4 = (String x, String y) -> true;
		//BiPredicate<String,String> p5 = (x, String y) -> true; //invalid lambda parameter declaration
		//BiPredicate<String,String> p6 = (String x,y) -> true; //invalid lambda parameter declaration
		BiPredicate<String, String> p7 = (var x, var y) -> true;
		//BiPredicate<String, String> p71 = (var x, String y) -> true; //invalid lambda parameter declaration
		BiPredicate<String, String> p8 = (x, y) -> true;
		BiPredicate<String, String> p9 = (var x, var y) -> {
			String z = "";
			return true;
		};
		//BiPredicate<String,String> p10 = (var x, var y) -> {String x=""; return true;}; //variable x is already defined in method
	}
	{
		Set<String> set = Set.of("mickey", "minnie");
		List<String> list = List.of("mickey", "minnie");

		set.forEach(s -> System.out.println(s));
		list.forEach(s -> System.out.println(s));
	}
	{
		Set<String> s = Set.of("mickey", "minnie");
		List<String> x = new ArrayList<>(s);

		//s.forEach(s -> System.out.println(s)); // s is already defined
		//x.forEach(x -> System.out.println(x)); // x is already defined

	}

	public void variables(int a) {
		int d = 1;
		BiPredicate<Integer,Integer> p1 = (var aa, var b) -> { // a is already defined
			//var b = 0; // b is already defined
			//int d = 0; // d is already defined
			int c = 0;
			return b == c;
		}; //missing ;
		var b = 1;

	}

	public void remove(List<Character> chars) {
		char end = 'z';
		chars.removeIf(c -> {
			char start = 'a'; return start <= c && c <= end;});

		char c = 'x';
		char start = 'a';
		chars = null;
	}
	public void remove2(List<Character> chars) {
		char end = 'z';

		chars = null;

		chars.removeIf(c -> {
			char start = 'a'; return start <= c && c <= end; });
	}


}
/*
class SomeClass {
	private static String classVariable;
	private String instanceVariable;

	public void boom(String methodArgument) {
		String localVariable = "First change";

		instanceVariable = "Instance variables are always allowed";
		methodArgument = "only effectively method parameters are allowed!";
		classVariable = "Class variables are always allowed";
		Consumer<String> consumer = s -> {
			System.out.println(s + methodArgument + localVariable + instanceVariable + classVariable);
			localVariable = "only effectively final local variables are allowed!";
		};
	}
}
*/