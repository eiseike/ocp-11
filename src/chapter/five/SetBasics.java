package chapter.five;

import java.util.HashSet;
import java.util.Set;

import java.util.HashMap;
import java.util.Map;

public class SetBasics {
	public static void main(String[] args) {

		{

			// boolean Set.add(E e);

			// boolean Set.remove(Object o);

			// int Set.size();

			// boolean Set.isEmpty();

			//import java.util.Set;
			//import java.util.HashSet;


			Set<Integer> set = new HashSet<>();

			System.out.println(set.add(66)); // true
			System.out.println(set.add(66)); // false

			System.out.println(set.size()); // 1

			System.out.println(set.remove(66)); // true
			System.out.println(set.remove(66)); // false

			System.out.println(set.contains(66)); // false

			set.clear();

			System.out.println(set.isEmpty()); // true
		}
		{

			// import java.util.HashMap;
			// import java.util.Map;

			System.out.println("------------------");
			Map<String, String> map = new HashMap<>();
			System.out.println(map.put("koala", "hamburger")); // null
			System.out.println(map.put("koala", "bamboo")); // hamburger
			System.out.println(map.get("koala")); // bamboo
			System.out.println(map.getOrDefault("ant", "leaf")); // leaf
			for (String key : map.keySet())
				System.out.println(key + " " + map.get(key)); // koala bamboo

		}
		{

			//Set<Float> f1 = Set.of(1.23); //incompatible types
			Set<Double> d1 = Set.of(1.23);
			Set<Float> f2 = Set.of(1.23f);
			//Set<Double> d2 = Set.of(1.23f); //incompatible types

			double d3 = 1.23f;
			//float f3 = 1.23; // possible lossy conversion
		}
	}
}
