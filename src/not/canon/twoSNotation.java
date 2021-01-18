package not.canon;

public class twoSNotation {

    public static void main(String[] args) {

        // 7 - 3 => 7 + -3

        int seven =       0b111;
        int minusThree = -0b011;

        int four = seven + minusThree;

        System.out.println("four = " + four);

        /*

        0 1 1 1 == plus 7

        0 0 1 1 == plus 3

        minus 3 => flip plus 3 => 1 1 0 0 add one to it => 1 1 0 1


        0 1 1 1 +  (7 + -3)
        1 1 0 1 =
        -------
     c1 0 1 0 0

        one carry remains, but simply throw it away

        the result is 0100 == 4 :)

        */


    }
}
