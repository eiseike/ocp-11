package chapter.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static chapter.three.NumericPromotion.g;

public class UnderstandingArrayLists {
	public static void main(String[] args) {
		{
			//import java.util.ArrayList;

			ArrayList list1 = new ArrayList();
			ArrayList list2 = new ArrayList(10);
			ArrayList list3 = new ArrayList(list2);

			ArrayList<String> list4 = new ArrayList<String>();
			ArrayList<String> list5 = new ArrayList<>();
		}
		{
			//import java.util.ArrayList;

			var strings = new ArrayList<String>(); //string's type is arrayList<String>
			strings.add("a");
			for (String s : strings) {
			}
		}
		{
			//import java.util.ArrayList;

			var strings = new ArrayList<>(); //string's type is arrayList<Object>
			strings.add("a");
			//for (String s : strings) {} // DNC: incompatible types
			for (Object s : strings) {
				String ss = (String) s;
			}

		}
		{
			//import java.util.List;
			//import java.util.ArrayList;

			List<String> list6 = new ArrayList<>();
			//ArrayList<String> list7 = new List<>(); // DNC: incompatible types
			//Arraylist<> list8 = new ArrayList<>(); // DNC: illegal start of type
			//Arraylist<> list9 = new ArrayList<String>(); // DNC: illegal start of type

		}
		{
			//import java.util.ArrayList;
			ArrayList list = new ArrayList();
			// or ArrayList list = new ArrayList<>();
			System.out.println(list.add("hawk"));        // true -> [hawk]
			System.out.println(list.add(Boolean.TRUE)); // true -> [hawk, true]
			System.out.println(list.add(false));        // true -> [hawk, true, false]
			System.out.println(list.add(1));            // true -> [hawk, true, false, 1]
			System.out.println(list);                    // [hawk, true, false, 1]

		}
		{
			//import java.util.ArrayList;
			ArrayList<String> list = new ArrayList<>();
			list.add("hawk");
			//list.add(Boolean.TRUE); //DNC: incompatible types
			//list.add(false); //DNC: incompatible types
			//list.add(1); //DNC: incompatible types
			list.add(String.valueOf(Boolean.TRUE));
			list.add(String.valueOf(false));
			list.add(String.valueOf(1));
			System.out.println(list); //[hawk, true, false, 1]
		}
		{
			//import java.util.ArrayList;
			List<String> birds = new ArrayList<>();
			birds.add("hawk");                        // [hawk]
			birds.add(1, "robin");    // [hawk, robin]
			birds.add(0, "blue jay"); // [blue jay, hawk, robin]
			birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
			System.out.println(birds);

		}
		{
			List<String> birds = new ArrayList<>(List.of("hawk", "hawk"));
			birds.remove("cardinal"); // false
			birds.remove("hawk");     // true
			birds.remove(0);       // hawk
			System.out.println(birds);   // []
		}
		{
			var numbers = new ArrayList<Integer>();
			numbers.add(3); //add (3 to index 0 => [3]
			numbers.add(0, 2); //add 2 to index 0 => [2, 3]
			numbers.add(0, 1); //add 1 to index 1 => [1, 2, 3]

			//Integer.valueOf() returns an Integer object
			boolean remove = numbers.remove(Integer.valueOf(1)); // true => [2, 3]

			//boolean remove2 = numbers.remove(1); // DNC: incompatible types
			// (1 is not an object so it is an index, so remove returns an Integer)

			//Integer.parseInt() returns a primitive int
			Integer remove1 = numbers.remove(Integer.parseInt("1")); // 3 => [2]
			System.out.println("number = " + numbers); // [2]
		}
		{
			var words = new ArrayList<String>(List.of("Apple", "Bear", "Cat"));
			System.out.println("words = " + words); // [Apple, Bear, Cat]
		}

		{
			//import java.util.List;
			//import java.util.ArrayList;

			List<String> birds = new ArrayList<>();
			//birds.set(0, "hawk");               // throw IndexOutOfBoundsException
			birds.add("hawk");                    // [hawk]
			System.out.println(birds.size());     // 1
			birds.set(0, "robin");               // [robin]
			System.out.println(birds.size());     // 1
			//birds.set(1, "robin");               // throw IndexOutOfBoundsException
			System.out.println("birds = " + birds); // birds = [robin]
		}
		{
			//import java.util.List;
			//import java.util.ArrayList;

			List<String> birds = new ArrayList<>();
			System.out.println(birds.add("hawk"));       // true -> [hawk]
			System.out.println(birds.contains("hawk"));  // true
			System.out.println(birds.contains("robin")); // false
			System.out.println(birds.isEmpty());         // false
			System.out.println(birds.size());            // 1
			birds.clear();
			System.out.println(birds.isEmpty());         // true
			System.out.println(birds.size());            // 0

		}
		{
			//import java.util.List;
			//import java.util.ArrayList;

			List<String> one = new ArrayList<>(); // -> 1[]
			List<String> two = new ArrayList<>(); // -> 1[],2[]
			System.out.println(one.equals(two));  // true
			//System.out.println(one.remove(0)); //throws IndexOutOfBoundsException: Index 0 out of bounds for length 0
			one.add("a");                         // true -> 1[a],2[]
			System.out.println(one.equals(two));  // false
			two.add("a");                         // [a]  -> 1[a],2[a]
			System.out.println(one.equals(two));  // true
			one.add("b");                         // true -> 1[a,b], 2[a]
			two.add(0, "b");                      // true -> 1[a,b], 2[b,a]
			System.out.println(one.equals(two));  // false

		}
		{

			//import java.util.ArrayList;
			//import java.util.Collections;
			//import java.util.List;

			List<Integer> l = new ArrayList<>();
			l.add(9);
			l.add(1);
			l.add(5);
			Collections.sort(l);
			System.out.println(l); // [1, 5, 9]
		}

		{
			List<Integer> list = Arrays.asList(10, 4, -1, 5);
			int[] array = {6, -4, 12, 0, -10};
			Collections.sort(list);

			Integer converted[] = list.toArray(new Integer[4]);
			System.out.println(converted[0]);
			System.out.println(Arrays.binarySearch(array, 12));
		}

		{
			List<String> gorillas = new ArrayList<>(); // String
			//gorillas.add(1);
			gorillas.add("A");
			for(var koko : gorillas)
				System.out.println(g(koko));

			var monkeys = new ArrayList<>(); // Object
			monkeys.add(1);
			monkeys.add("A");
			for(var albert : monkeys)
				System.out.println(g(albert));

			List chimpanzees = new ArrayList<Integer>(); // Object
			chimpanzees.add(1);
			chimpanzees.add("A");
			for(var ham : chimpanzees)
				System.out.println(g(ham));
		}
	}
}
