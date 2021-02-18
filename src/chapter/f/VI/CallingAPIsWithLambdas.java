package chapter.f.VI;

import java.util.List;
import java.util.ArrayList;

import java.util.Set;
import java.util.HashSet;

public class CallingAPIsWithLambdas {
	public static void main(String[] args) {

		{
			//import java.util.List;
			//import java.util.ArrayList;

			List<String> al = new ArrayList<>();
			al.add("a1");
			al.add("b1");
			al.add("c1");
			System.out.println(al); // [a1, b1, c1]
			al.removeIf(s -> s.charAt(0) == 'b');
			System.out.println(al); // [a1, c1]
		}

		{
			//import java.util.Set;
			//import java.util.HashSet;

			Set<String> hs = new HashSet<String>();
			hs.add("s1");
			hs.add("s2");
			hs.add("s3");
			System.out.println(hs); // [s3, s1, s2]
			hs.removeIf(s -> s.charAt(1) != '1');
			System.out.println(hs); // [s1]
		}
	}
}
