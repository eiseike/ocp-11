package chapter.five;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String... arr) {
        {
            int[] numbers1 = new int[3];
            for (int i : numbers1) {
                System.out.println("i = " + i); /// 0 0 0
            }
        }
        {
            int[] numbers2 = new int[]{42, 55, 99};
            for (int i2 : numbers2) {
                System.out.println("i2 = " + i2); /// 42, 55, 99
            }
        }
        {
            var array1 = new int[1];
            var array2 = new int[1];
            var array3 = new int[]{1};
            var array4 = new int[]{1};
            var array5 = new int[]{1};
        }
        {
            int[] numbers1 = new int[3]; // {0,0,0}
            int[] numbers2 = new int[]{1, 2, 3}; // {1,2,3}
            int[] numbers3 = new int[]{1, 2, 3}; // {1,2,3}
            int[] numbers4 = numbers2;
            System.out.println("(numbers3==numbers2) = " + (numbers3 == numbers2));
            System.out.println("(numbers3.equals(numbers2)) = " + (numbers3.equals(numbers2)));
            System.out.println("Arrays.equals(numbers3, numbers2) = " + Arrays.equals(numbers3, numbers2));
            System.out.println("(numbers4==numbers2) = " + (numbers4 == numbers2));
            System.out.println("(numbers4.equals(numbers2)) = " + (numbers4.equals(numbers2)));
            System.out.println("Arrays.equals(numbers4, numbers2) = " + Arrays.equals(numbers4, numbers2));
            //(numbers3==numbers2) = false
            //(numbers3.equals(numbers2)) = false
            //Arrays.equals(numbers3, numbers2) = true
            //(numbers4==numbers2) = true
            //(numbers4.equals(numbers2)) = true
            //Arrays.equals(numbers4, numbers2) = true

        }
        {
            String[] bugs = {"cricket", "beetle", "ladybug"};
            String[] alias = bugs;
            System.out.println(bugs.equals(alias));     // true
            System.out.println(bugs.toString());
            //[Ljava.lang.String;@160bc7c0
            System.out.println(Arrays.toString(bugs));
            //[cricket, beetle, ladybug]
        }
        {
            new AwesomeClass();
        }
        {
            String[] strings = { "stringValue" };
            Object[] objects = strings;
            String[] againStrings = (String[]) objects;
            //againStrings[0] = new StringBuilder(); //DNC
            //incompatible types: StringBuilder cannot be converted to String
            //objects[0] = new StringBuilder(); // throws java.lang.ArrayStoreException

        }
        {
            int[] numbers = { 100, 9, 10 };
            Arrays.sort(numbers);
            var r = Arrays.toString(numbers); //[9, 10, 100]
            System.out.println(r);
        }
        {
            String[] numbers = { "100", "9", "10" };
            Arrays.sort(numbers);
            var r = Arrays.toString(numbers); //[10, 100, 9]
            System.out.println(r);
        }

        {

            int[] numbers = {2,4,6,8};
            System.out.println(Arrays.binarySearch(numbers, 2)); // 0
            System.out.println(Arrays.binarySearch(numbers, 4)); // 1
            System.out.println(Arrays.binarySearch(numbers, 1)); // -1
            System.out.println(Arrays.binarySearch(numbers, 3)); // -2
            System.out.println(Arrays.binarySearch(numbers, 9)); // -5

        }
        {
            int[] numbers = new int[] {3,2,1};
            System.out.println(Arrays.binarySearch(numbers, 2)); // 1
            System.out.println(Arrays.binarySearch(numbers, 3)); // -4 ???
        }
        {
            System.out.println(Arrays.compare(new int[] {1}, new int[] {2}));
            // -
            System.out.println(Arrays.compare(new int[] {2}, new int[] {2}));
            // 0
            System.out.println(Arrays.compare(new int[] {2}, new int[] {1}));
            // +
        }
        {
            System.out.println(Arrays.compare(new int[] {1,2}, new int[] {1,2}));
            // 0
            System.out.println(Arrays.compare(new int[] {1,2}, new int[] {1,2,3}));
            // -
            System.out.println(Arrays.compare(new int[] {1,2,3}, new int[] {1,2}));
            // +
            System.out.println(Arrays.compare(new int[] {1,2}, new int[] {1,3}));
            // -
            System.out.println(Arrays.compare(new int[] {1,3}, new int[] {1,2}));
            // +
        }
        {
            // all is - :
            System.out.println(Arrays.compare(null, new int[]{1})); // null vs [1]
            System.out.println(Arrays.compare(null, new Integer[1])); // null vs [null]

            System.out.println(Arrays.compare(new int[]{1}, new int[]{2}));
            System.out.println(Arrays.compare(new String[]{"1"}, new String[]{"a"}));
            System.out.println(Arrays.compare(new char[]{'1'}, new char[]{'a'}));
            System.out.println(Arrays.compare(new String[]{"A"}, new String[]{"a"}));
            System.out.println(Arrays.compare(new char[]{'A'}, new char[]{'a'}));

            System.out.println(Arrays.compare(new String[]{""}, new String[]{"a"}));
            System.out.println(Arrays.compare(new String[]{"aaa"}, new String[]{"aba"}));
            // aaa vs aba => aa vs ab => a vs b
            System.out.println(Arrays.compare(new String[]{"a"}, new String[]{"aa"}));
            // a vs aa => "" vs a
        }
        {
            System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1})); // -1
            System.out.println(Arrays.mismatch(new String[] {"a"}, new String[] {"A"})); // 0
            System.out.println(Arrays.mismatch(new int[] {1, 2}, new int[] {1})); // 1
        }
    }
}

class AwesomeClass {

    int ClassStrings1[]; // int[] is an object, and
                         // an uninitialized class object is null.
    int ClassStrings2[] = new int[1];

    public AwesomeClass() {

        {
            int methodStrings1[]; // int[] is an object, and an uninitialized
                                  // local object is uninitialized.
            int methodStrings2[] = new int[1];

            System.out.println(Arrays.toString(ClassStrings1)); // null
            System.out.println(Arrays.toString(ClassStrings2)); // [0]
            //System.out.println(Arrays.toString(methodStrings1));
            // DNC: variable methodStrings1 might not have been initialized
            System.out.println(Arrays.toString(methodStrings2)); //[0]

        }
    }
}

