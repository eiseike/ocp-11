package chapter.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnderstandingArrays {
    public static void main(String... arr) {
        {
            Character[] Characters = new Character[3]; // [null, null, null]
            System.out.println("Arrays.toString(Characters) = " + Arrays.toString(Characters));
        }
        {
            char[] chars = new char[3]; // [ ,  ,  ]
            System.out.println("Arrays.toString(chars) = " + Arrays.toString(chars));
        }
        {
            int[] numbers1 = new int[3];
            for (int i = 0; i < numbers1.length; i++) {
                System.out.println("numbers1[" + i + "] = " + numbers1[i]); /// 0 0 0
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
            var array2 = new int [1];
            var array3 = new int[]{1};
            var array4 = new int[] {1};
            var array5 = new int [] {1};
            var array6 = new int[2][2];
            array6[0][0]=1; // [[1, 0], [0, 0]]
            System.out.println("array6 = " + Arrays.deepToString(array6));
        }
        {
            int[] numbers1 = new int[3]; // {0,0,0}
            int[] numbers2 = new int[]{1, 2, 3}; // {1,2,3}
            int[] numbers3 = new int[]{1, 2, 3}; // {1,2,3}
            int[] numbers4 = numbers2;

            //(numbers3 == numbers2) == false
            //(numbers3.equals(numbers2)) == false\
            //Arrays.equals(numbers3, numbers2) == true

            //(numbers4==numbers2) == true
            //(numbers4.equals(numbers2)) == true
            //Arrays.equals(numbers4, numbers2) == true

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
            new AwesomeClass();
        }
        {
            String[] strings = {"stringValue"};
            Object[] objects = strings;
            String[] againStrings = (String[]) objects;
            //againStrings[0] = new StringBuilder(); //DNC
            //incompatible types: StringBuilder cannot be converted to String
            //objects[0] = new StringBuilder(); // throws java.lang.ArrayStoreException

        }
        {
            int[] numbers = {100, 9, 10};
            Arrays.sort(numbers);
            var r = Arrays.toString(numbers); // [9, 10, 100]
            System.out.println(r);
        }
        {
            String[] numbers = {"100", "9", "10", "11"};
            Arrays.sort(numbers);
            var r = Arrays.toString(numbers); // [10, 100, 11, 9] <-- wtf...
            System.out.println(r);
        }

        {

            int[] numbers = {2, 4, 6, 8};
            System.out.println(Arrays.binarySearch(numbers, 2)); // 0
            System.out.println(Arrays.binarySearch(numbers, 4)); // 1
            System.out.println(Arrays.binarySearch(numbers, 1)); // -1
            System.out.println(Arrays.binarySearch(numbers, 3)); // -2
            System.out.println(Arrays.binarySearch(numbers, 9)); // -5

        }
        {
            int[] numbers = new int[]{3, 2, 1};
            System.out.println(Arrays.binarySearch(numbers, 2)); // 1
            System.out.println(Arrays.binarySearch(numbers, 3)); // -4 ???
        }
        {
            System.out.println(Arrays.compare(new int[]{1}, new int[]{2}));
            // -
            System.out.println(Arrays.compare(new int[]{2}, new int[]{2}));
            // 0
            System.out.println(Arrays.compare(new int[]{2}, new int[]{1}));
            // +
        }
        {
            System.out.println(Arrays.compare(new int[]{1, 2}, new int[]{1, 2}));
            // 0
            System.out.println(Arrays.compare(new int[]{1, 2}, new int[]{1, 2, 3}));
            // -
            System.out.println(Arrays.compare(new int[]{1, 2, 3}, new int[]{1, 2}));
            // +
            System.out.println(Arrays.compare(new int[]{1, 2}, new int[]{1, 3}));
            // -
            System.out.println(Arrays.compare(new int[]{1, 3}, new int[]{1, 2}));
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
            System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1})); // -1
            System.out.println(Arrays.mismatch(new String[]{"a"}, new String[]{"A"})); // 0
            System.out.println(Arrays.mismatch(new int[]{1, 2}, new int[]{1})); // 1
        }

        {
            // gagyisort
            int[] unsorted = new int[]{7, 3, 8, 23, 54, 1, 7, 42, 5, 1};
            for (int t = 0; t < unsorted.length; t++) {
                for (int y = t + 1; y < unsorted.length; y++) {
                    if (unsorted[t] == unsorted[y]) {

                    } else if (unsorted[t] > unsorted[y]) {
                        int v = unsorted[t];
                        unsorted[t] = unsorted[y];
                        unsorted[y] = v;
                    }
                }
            }
            System.out.println("Arrays.toString(unsorted) = " + Arrays.toString(unsorted));
        }
        {
            // gagyisort 2 : lexicographic sort of strings
            String[] unsorted = new String[]{"33339", "5", "55", "2", "323", "5", "8", "23", "236", "234", "235", "234", "22", "1", "222", "345", "11", "33330"};

            /*

            1,
            11,

            2,
            22,
            222,
            23,
            234,
            234,
            235,
            236,

            323,
            33330,
            33339,
            345,

            5,
            5,
            55,

            8

             */
            for (int t = 0; t < unsorted.length; t++) {
                for (int y = t + 1; y < unsorted.length; y++) {
                    if (unsorted[t].compareTo(unsorted[y]) == 0) {

                    } else if (unsorted[t].compareTo(unsorted[y]) > 0) {
                        String v = unsorted[t];
                        unsorted[t] = unsorted[y];
                        unsorted[y] = v;
                    }
                }
            }
            System.out.println("Arrays.toString(unsorted) = " + Arrays.toString(unsorted));
        }

        {
            int [][] args = new int[4][]; // [null,        null,    null, null]
            args[0] = new int[5];         // [[0,0,0,0,0], null,    null, null]
            args[1] = new int[3];         // [[0,0,0,0,0], [0,0,0], null, null]
            System.out.println("(Arrays.deepToString(args)) = " + (Arrays.deepToString(args)));
            //(Arrays.deepToString(args)) = [[0, 0, 0, 0, 0], [0, 0, 0], null, null]

        }
        {
            int[][] twoD = new int[3][2];
            for (int i = 0; i < twoD.length; i++) {
                for (int j = 0; j < twoD[i].length; j++)
                    System.out.print(twoD[i][j] + " "); // print element
                System.out.println();                  // time for a new row
            }

            for (int[] inner : twoD) {
                for (int num : inner)
                    System.out.print(num + " ");
                System.out.println();
            }
        }

        {
            String[] abc = new String[]{"a","b","c"};
            String[] acb = new String[]{"a","c","b"};
            System.out.println("Arrays.compare(abc,acb) = " + Arrays.compare(abc, acb));
        }
        {
            java.util.Date[] dates[] = new java.util.Date[2][];
            System.out.println("Arrays.deepToString(dates) = " + Arrays.deepToString(dates));
        }
        {
            // int[][] types = new int[]; //DNC: array dimension missing
            // int[][] java = new int[][]; //DNC: array dimension missing

            Object[][][] cubbies = new Object[3][0][5]; //VALID!!!!
            //cubbies[1][1][1] = 1; //ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0
            System.out.println("Arrays.deepToString(cubbies) = " + Arrays.deepToString(cubbies));

        }

        {
            List<Object> al = new ArrayList<>();
            al.add(new Integer[]{1,2,3});
            al.add(new Integer[]{2,3,4});

            shallowAslistProofer(al, null);

            Object[] objects = al.toArray();
            Integer[] object = (Integer[]) objects[0];
            object[0]=0;

            Object[] objects2 = al.toArray();
            shallowAslistProofer(al, objects2);
            System.out.println("shallow!!!!!");
        }
        {
            List<Integer> al = new ArrayList<Integer>();
            al.add(Integer.valueOf(1));
            al.add(Integer.valueOf(2));

            shallowAslistProofer(al, null);

            Integer[] objects = al.toArray(new Integer[0]);

            objects[0]=Integer.valueOf(0);

            Integer[] objects2 = al.toArray(new Integer[0]);
            shallowAslistProofer(al, objects2);
        }
    }
    private static void shallowAslistProofer(List<Object> as, Object[] os) {
        if (os == null) {
            System.out.println(" -------------------------------------------");
        }
        for (Object a:as) {
            System.out.println(Arrays.deepToString((Object[]) a));
        }
        if (os != null) {
            System.out.println(Arrays.deepToString(os));
        }
    }    private static void shallowAslistProofer(List<Integer> as, Integer[] os) {
        if (os == null) {
            System.out.println(" -------------------------------------------");
        }
        for (Integer a:as) {
            System.out.println(a);
        }
        if (os != null) {
            System.out.println(Arrays.deepToString(os));
        }
    }
}

