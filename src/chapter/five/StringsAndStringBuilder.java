package chapter.five;

public class StringsAndStringBuilder {
	public static void main(String[] args) {

		{
			System.out.println("(1 + 2) = " + (1 + 2));
			System.out.println("(\"a\" + \"b\") = " + ("a" + "b"));
			System.out.println("(\"a\" + \"b\" + 3) = " + ("a" + "b" + 3));
			System.out.println("(1 + 2 + \"c\") = " + (1 + 2 + "c"));
			System.out.println("(\"c\" + 1 + 2) = " + ("c" + 1 + 2));

            /*
            (1 + 2) = 3
            ("a" + "b") = ab
            ("a" + "b" + 3) = ab3
            (1 + 2 + "c") = 3c !!!!!!!!
            ("c" + 1 + 2) = c12 !!!!!!!
             */
		}

		{
			int three = 3;
			String four = "4";
			System.out.println("(1 + 2 + three + four) = " + (1 + 2 + three + four));
			// (1 + 2 + three + four) = 64
		}

		{
			String s = "1";             // s currently holds "1"
			s += "2";                   // s currently holds "12"
			s += 3;                     // s currently holds "123"
			System.out.println(s);      // 123

		}
		{
			String s = "1";            // 1
			s += false;                // 1false
			System.out.println(s);      // 1false
		}
		{
			String s1 = "1";            // s = 1
			String s2 = s1.concat("2"); // s2 = s+"2"
			s2.concat("3");             // s2+"3" - no one use this method's result
			System.out.println(s2);     // s2 == s+"2"
			//12
		}
		{
			String string = "animals";
			System.out.println(string.length());  // 7
		}
		{
			String string = "animals";
			System.out.println(string.charAt(0));  // a
			System.out.println(string.charAt(6));  // s
			//System.out.println(string.charAt(7));  // throws StringIndexOutOfBoundsException
		}
		{
			String string = "animals";
			System.out.println(string.indexOf('a'));         // 0
			System.out.println(string.indexOf('a', 0));         // 0
			System.out.println(string.indexOf('a', 1));         // 4
			System.out.println(string.indexOf('a', 4));      // 4
			System.out.println(string.indexOf("al"));        // 4
			System.out.println(string.indexOf("al", 5));     // -1
		}
		{
			String string = "animals";
			System.out.println(string.substring(3));                   // mals
			System.out.println(string.substring(string.indexOf('m'))); // mals
			System.out.println(string.substring(3, 4));                // m
			System.out.println(string.substring(3, 7));                // mals

			System.out.println(string.substring(3, 3)); // empty string
			//System.out.println(string.substring(3, 2));  // throws StringIndexOutOfBoundsException: begin 3, end 2, length 7
			//System.out.println(string.substring(3, 8)); // throws StringIndexOutOfBoundsException: begin 3, end 8, length 7

		}
		{
			String string = "animals";
			System.out.println(string.toUpperCase());  // ANIMALS
			System.out.println("Abc123".toLowerCase());  // abc123
		}
		{
			System.out.println("abc".equals("ABC"));  // false
			System.out.println("ABC".equals("ABC"));  // true
			System.out.println("abc".equalsIgnoreCase("ABC"));  // true
		}
		{
			System.out.println("abc".startsWith("a")); // true
			System.out.println("abc".startsWith("A")); // false
			System.out.println("abc".endsWith("c")); // true
			System.out.println("abc".endsWith("C")); // false
		}
		{
			System.out.println("aAbcabc".replace('a', 'A')); // AAbcAbc
			System.out.println("aAbcabc".replace("a", "A")); // AAbcAbc
			System.out.println("aAbcabc".replace("a", "A!")); // A!AbcA!bc
		}
		{
			System.out.println("abc".contains("b")); // true
			System.out.println("abc".contains("B")); // false

		}
		{
			System.out.println("abc".strip());                 // abc
			System.out.println("\t   a b c\n".strip());        // a b c
			String text = " abc\t ";
			System.out.println(text.trim().length());         // 3
			System.out.println(text.strip().length());        // 3 //unicode support
			System.out.println(text.stripLeading().length()); // 5 //unicode support
			System.out.println(text.stripTrailing().length());// 4 //unicode support
		}
		{
			String first = "rat" + 1;
			String second = "r" + "a" + "t" + "1";
			String third = "r" + "a" + "t" + new String("1");
			System.out.println(first == second);          // true
			System.out.println(first == second.intern()); // true
			System.out.println(first == third);           // false
			System.out.println(first == third.intern());  // true¶}1
		}
		{

			String a = new String("a");
			System.out.println(System.identityHashCode(a)); //11111111
			String b = new String("b");
			System.out.println(System.identityHashCode(b)); //22222222
			String b2 = new String("b");
			System.out.println(System.identityHashCode(b2)); //33333333
		}
		{
			String a = new String("a").intern();
			System.out.println(System.identityHashCode(a)); //44444444
			String b = new String("b").intern();
			System.out.println(System.identityHashCode(b)); //55555555
			String b2 = new String("b").intern();
			System.out.println(System.identityHashCode(b2)); //55555555
		}
		{
			String a = "a"; // implicit intern
			System.out.println(System.identityHashCode(a)); //44444444
			String b = "b"; // implicit intern
			System.out.println(System.identityHashCode(b)); //55555555
			String b2 = "b"; // implicit intern
			System.out.println(System.identityHashCode(b2)); //55555555
		}
		{
			String a = "a".intern(); // redundant explicit intern
			System.out.println(System.identityHashCode(a)); //44444444
			String b = "b".intern(); // redundant explicit intern
			System.out.println(System.identityHashCode(b)); //55555555
			String b2 = "b".intern(); // redundant explicit intern
			System.out.println(System.identityHashCode(b2)); //55555555
		}

		{
			String start = "AniMaL   ";
			String trimmed = start.trim();                 // "AniMaL"
			String lowercase = trimmed.toLowerCase();      // "animal"
			String result = lowercase.replace('a', 'A');   // "AnimAl"
			System.out.println(result); // AnimAl
		}
		{
			String result = "AniMaL   ".trim().toLowerCase().replace('a', 'A');
			System.out.println(result); // AnimAl
		}
		{
			String a = "abc";
			String b = a.toUpperCase();
			b = b.replace("B", "2").replace('C', '3');
			System.out.println("a=" + a); //abc
			System.out.println("b=" + b); //A23
		}
		{
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder("animal");
			StringBuilder sb3 = new StringBuilder(10);
		}
		{
			StringBuilder sb = new StringBuilder("animals");

			//sb.indexOf('a'); //DNC: incompatible types: char cannot be converted to String
			int a = sb.indexOf("a"); // 0

			String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
			int len = sb.length();
			char ch = sb.charAt(6);
			System.out.println(sub + " " + len + " " + ch); //anim 7 s
		}
		{
			StringBuilder sb = new StringBuilder();
			StringBuilder sb2 = sb.append("1");
			// System.identityHashCode(sb) == System.identityHashCode(sb2)

		}
		{
			StringBuilder sb = new StringBuilder().append(1).append('c');
			sb.append("-").append(true);
			System.out.println(sb);      // 1c-true
		}
		{
			// new StringBuilder("abc").insert(0,"x") => xabc
			// new StringBuilder("abc").insert(1,"x") => axbc
			// new StringBuilder("abc").insert(2,"x") => abxc
			// new StringBuilder("abc").insert(3,"x") => abcx
			// new StringBuilder("abc").insert(4,"x") => java.lang.StringIndexOutOfBoundsException: offset 4,length 3
			// new StringBuilder("abc").insert(-1,"x") => java.lang.StringIndexOutOfBoundsException: offset -1,length 3
			StringBuilder sb = new StringBuilder("animals");
			sb.insert(7, "-");                   // sb = animals-
			sb.insert(0, "-");                   // sb = -animals-
			sb.insert(4, "-");                   // sb = -ani-mals-
		}
		{
			StringBuilder builder;
			builder = new StringBuilder("pigeon dirty").replace(3, 6, "sty");
			System.out.println("builder = " + builder); //  pigsty dirty
			builder = new StringBuilder("pigeon dirty").replace(3, 6, "s are");
			System.out.println("builder = " + builder); // pigs are dirty
			builder = new StringBuilder("pigeon dirty").replace(3, 6, "");
			System.out.println("builder = " + builder); // pig dirty
            /*
            builder = pigsty dirty
            builder = pigs are dirty
            builder = pig dirty
             */
			builder = new StringBuilder("pigeon dirty").replace(0, 0, "xxx");
			System.out.println("builder = " + builder); // xxxpigeon dirty

			//builder = new StringBuilder("pigeon dirty").replace(1, 0, "xxx");
			//java.lang.StringIndexOutOfBoundsException: start 1, end 0, length 12

			//builder = new StringBuilder("pigeon dirty").replace(-1, 0, "xxx");
			//java.lang.StringIndexOutOfBoundsException: start -1, end 0, length 12

			builder = new StringBuilder("pigeon dirty").replace(0, 9999, "xxx");
			System.out.println("builder = " + builder); // builder = xxx
		}
		{

			StringBuilder one = new StringBuilder(); // 1""
			StringBuilder two = new StringBuilder(); // 2""

			StringBuilder three = one.append("a"); // 1,3"a" 2""

			System.out.println(one == two); // false // 1,3"a" is not 2""
			System.out.println(one == three); // true  // 1,3"a" is 1,3"a"
			System.out.println(one.equals(two)); // false // 1,3"a" is not 2""
			System.out.println(one.equals(three)); // true  // 1,3"a" is 1,3"a"
			System.out.println(one); // "a"
			System.out.println(two); // ""
			System.out.println(three); // "a"

			String x = "Hello World";
			String z = " Hello World".trim();
			System.out.println(x == z);      // false
			System.out.println(x.equals(z)); // true

		}
		{
			// The string pool contains literal values and constants that appear in your program.
			String s = "I LOVE JAVA"; // Literal
			String s2 = "I " + "LOVE " + "JAVA"; // Compile time constant.
			System.out.println("(s==s2) = " + (s == s2)); // (s==s2) = true

			// compiled dynamically, not in string pool
			String s3 = new String("I LOVE JAVA");
			System.out.println("(s==s3) = " + (s == s3)); // (s==s3) = false

			// compiled dynamically, but forced to use the string pool
			String s4 = new String("I LOVE JAVA").intern();
			System.out.println("(s==s3) = " + (s == s4)); // (s==s3) = true

		}
		{
			String x = "Hello World";
			String z = " Hello World".trim();
			System.out.println(x == z);      // false
			System.out.println(x.equals(z)); // true
		}
		{
			int count = 0;
			String s1 = "java";
			String s2 = "java";
			StringBuilder s3 = new StringBuilder("java");
			if (s1 == s2) count++;
			if (s1.equals(s2)) count++;
			//if (s1 == s3) count++; //DNC: incomparable types
			if (s1.equals(s3)) count++;
			System.out.println(count);

		}
		/*
		{
			StringBuilder b = "rumble"; //DNC: incompatible types: java.lang.String cannot be converted to java.lang.StringBuilder
			b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
			System.out.println(b);
		}
		 */
		{
			String numbers = "012345678";
			System.out.println(numbers.substring(1, 3)); // 12
			System.out.println(numbers.substring(7, 7)); // ""
			System.out.println(numbers.substring(7));    // 78
			System.out.println(numbers.substring(7, 9)); // 78

		}
		{
			var s = "Hello";
			var t = new String(s);
			if ("Hello".equals(s)) System.out.println("one");
			if (t == s) System.out.println("two");
			if (t.intern() == s) System.out.println("three");
			if ("Hello" == s) System.out.println("four");
			if ("Hello".intern() == t) System.out.println("five");
		}
		{
			int[] rohagymeg = new int[]{1};
			System.out.println(rohagymeg.length);
			String fasszopo = "java";
			System.out.println(fasszopo.length());
		}
		{
			String numbers = "012345678";
			System.out.println(numbers.substring(1, 3));
			System.out.println(numbers.substring(7, 7));
			System.out.println(numbers.substring(7));
		}
		{


			class Lion {
				public void roar(String roar1, StringBuilder roar2) {
					roar1.concat("!!!");
					roar2.append("!!!");
				}
			}
			String roar1 = "roar";
			StringBuilder roar2 = new StringBuilder("roar");
			new Lion().roar(roar1, roar2);
			System.out.println(roar1 + " " + roar2);


		}
	}
}

/*
class Fish {
	public static void main(String[] args) {
		int numFish = 4;
		String fishType = "tuna";
		//String anotherFish = numFish + 1; //DNC: incompatible types: int cannot be converted to java.lang.String
		System.out.println(anotherFish + " " + fishType);
		System.out.println(numFish + " " + 1);
	}
}
*/

