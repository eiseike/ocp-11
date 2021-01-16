package chapter.three;

public class AssigningValuesAndCasting {
    public static void main(String[] args) {

        // the compiler automatically casts smaller data type to a larger one:
        int i1 = 1;
        long l1 =  i1;
        long explicitl1 = (long)i1; //this long is redundant

        // the compiler not casts larger data type to a smaller one:
        long l2 = 2L;
        //int i2 = l2; //DOES NOT COMPILE
        int expliciti2 = (int)l2;

        int fur = (int)5;
        int hair = (short) 2;
        String type = (String)  "Bird";
        short tail = (short)(4 + 10);
        //long feathers = 10(long);  // DOES NOT COMPILE


        //float egg = 2.0 / 9;        // DOES NOT COMPILE 2.0 is a double
        float egg = (float) 2.0 / 9;

        //int tadpole = (int)5 * 2L;  // DOES NOT COMPILE 2L is a Long
        int tadpole = 5 * (int)2L;

        //short frog = 3 - 2.0;       // DOES NOT COMPILE, 2.0 is a double
        short frog = 3 - (short)2.0;



    }
}
