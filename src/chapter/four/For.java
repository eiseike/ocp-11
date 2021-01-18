package chapter.four;

public class For {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) { // 0 1
            System.out.println("i = " + i);
        }
        short i2;
        for (i2 = 0; i2 < 2; i2++) { // 0 1
            System.out.println("i2 = " + i2);
        }
        /*
        int i3;
        for (int i3 = 0; i2 < 2; i2++) { // DNC: i3 already defined
            System.out.println("i2 = " + i2);
        }
         */
        for (byte i4 = 5; i4 > 0; i4--) {
            System.out.println("i4 = " + i4); // 5 4 3 2 1
        }

        for (int i5 = 0, i6 = 5; i5 < 5 && i6 > 0; i5++) {
            System.out.println(String.valueOf(i5) + "-" + String.valueOf(i6--));
            /*
            0-5
            1-4
            2-3
            3-2
            4-1
            */
        }

    }
}
