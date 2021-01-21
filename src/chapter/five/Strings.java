package chapter.five;

public class Strings {
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
            String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
            int len = sb.length();
            char ch = sb.charAt(6);
            System.out.println(sub + " " + len + " " + ch); //anim 7 s
        }
        {
            StringBuilder sb = new StringBuilder().append(1).append('c');
            sb.append("-").append(true);
            System.out.println(sb);      // 1c-true
        }
    }
}
