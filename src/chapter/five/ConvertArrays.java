package chapter.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrays {
	public static void main(String... arr) {
		{
			//import java.util.ArrayList;
			//import java.util.Arrays;
			//import java.util.List;

			List<String> list = new ArrayList<>();
			list.add("hawk");
			list.add("robin");
			Object[] objectArray = list.toArray();
			String[] stringArray = list.toArray(new String[0]);
			list.clear();

			System.out.println(list.size());     // 0
			System.out.println(objectArray.length);     // 2
			System.out.println(stringArray.length);     // 2
			System.out.println(list); // []
			System.out.println(Arrays.toString(objectArray)); // [hawk, robin]
			System.out.println(Arrays.toString(stringArray)); // [hawk, robin]
		}
		{
			//import java.util.Arrays;
			//import java.util.List;

			String[] array = { "hawk", "robin" };     // [hawk, robin]
			List<String> backedList = Arrays.asList(array); // returns fixed size list
			System.out.println(backedList.size());         // 2
			backedList.set(1, "test");                     // [hawk, test]
			array[0] = "new";                        // [new, test]
			System.out.println(Arrays.toString(array)); // [new, test]
			System.out.println(backedList); // [new, test]
			//backedList.remove(1);     // throws UnsupportedOperationException

		}
		{

			//import java.util.Arrays;
			//import java.util.List;

			String[] array = { "hawk", "robin" };        // [hawk, robin]
			List<String> inmutableList = List.of(array);      // returns immutable list
			System.out.println(inmutableList.size());            // 2
			array[0] = "new";
			System.out.println(Arrays.toString(array)); // [new, robin]
			System.out.println(inmutableList);                   // [hawk, robin]
			// inmutableList.set(1, "test");      // throws UnsupportedOperationException
			// inmutableList.remove(1);     // throws UnsupportedOperationException


		}

		{

			Integer[] ints = {1, 2, 3};
			List<Integer> integers = List.of(ints);
			System.out.println("ints = " + Arrays.toString(ints));
			System.out.println("integers = " + integers);

			ints[1]=0;

			System.out.println("ints = " + Arrays.toString(ints));
			System.out.println("integers = " + integers);

		}

		{
			Integer[] ints2 = {1, 2, 3};
			List<Integer> integers2 = Arrays.asList(ints2);

			System.out.println("ints2 = " + Arrays.toString(ints2));
			System.out.println("integers2 = " + integers2);

			ints2[1]=0;

			System.out.println("ints2 = " + Arrays.toString(ints2));
			System.out.println("integers2 = " + integers2);

			integers2.set(1,-1);

			System.out.println("ints2 = " + Arrays.toString(ints2));
			System.out.println("integers2 = " + integers2);
		}

		{
			List<Object> list = new ArrayList(List.of(1,2,"3"));
			Object[] array = list.toArray();
			//Integer[] intArray = list.toArray(new Integer[0]); //ArrayStoreException
			//String[] stringArray = list.toArray(new String[0]); //ArrayStoreException
		}
		{
			List<Object> list = new ArrayList(List.of("1","2","3"));
			Object[] array = list.toArray();
			//Integer[] intArray = list.toArray(new Integer[0]); //ArrayStoreException
			String[] stringArray = list.toArray(new String[0]); //ArrayStoreException
			System.out.println(Arrays.toString(stringArray)); // [1, 2, 3]
		}
	}
}
