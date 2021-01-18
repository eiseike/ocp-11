package chapter.three;

public class TernatyOperator {
    public static void main(String[] args) {

        int stripes = 7;
        System.out.println(stripes > 5 ? 21 : "Zebra");

        // int animal = (stripes < 9) ? 3 : "Horse";  // DOES NOT COMPILE

        {
            int sheep = 1;
            int zzz = 1;
            int sleep = zzz < 10 ? sheep++ : zzz++;
            System.out.println(sheep + "," + zzz);  // 2,1
            // Notice that since the left-hand boolean expression was true, only
            // sheep was incremented. Contrast the preceding example with the
            // following modification:
        }
        {
            int sheep = 1;
            int zzz = 1;
            int sleep = zzz >= 10 ? sheep++ : zzz++;
            System.out.println(sheep + "," + zzz);  // 1,2
        }

        int a = 2, b = 4, c = 2;
        System.out.println(a > 2 ? --c : b++);
        System.out.println(b = (a!=c ? a : b++));
        System.out.println(a > b ? b < c ? b : 2 : 1);

    }
}
