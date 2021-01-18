package not.canon;

public class oneSNotation {

    public static void main(String[] args) {

        // 7 - 3 => 7 + -3

        int seven =       0b111;
        int minusThree = -0b011;

        int four = seven + minusThree;

        System.out.println("four = " + four);

        /*

        0 1 1 1 == plus 7

        0 0 1 1 == plus 3

        flip plus 3 => 1 1 0 0

        add it =>

        0 1 1 1 +
        1 1 0 0 =
        -------
    c1  0 0 1 1

        one carry remains, add it to the result:

        0 0 1 1 +
        0 0 0 1 =
        -------
        0 1 0 0

        the result is 3 :)

        */



        System.out.println("~3 = " + ~3);

    }
}
