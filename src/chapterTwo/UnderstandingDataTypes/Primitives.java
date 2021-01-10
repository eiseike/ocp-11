package chapterTwo.UnderstandingDataTypes;

public class Primitives {
    public static void main(String[] args) {

        char c = 'c';       //16 bit (unsigned) unicode value

        byte b = 1;         // 8 bit signed integral value (-127 - 128)
        short s = 1;        //16 bit signed integral value
        int i = 1;          //32 bit signed integral value
        long l = 1L;        //64 bit signed integral value

        float f = 1.1f;     //32 bit floating-point value
        double d = 1.1;     //64 bit floating-point value

        boolean bo = true;  //true or false

        short bird = 'd'; //100
        char mammal = (short) 83; //S

        /*
        short reptile = 65535;  // Error:(21, 25) java: incompatible types: possible lossy conversion from int to short
        char fish = (short)-1;  // Error:(22, 21) java: incompatible types: possible lossy conversion from short to char
        */

        //Writing Literals

        //long max = 3123456789; // Error:(28, 20) java: integer number too large
        long max = 3123456789L;  // now Java knows it is a long
        long pleaseNo = 111l;  // lowercase 111L

        //double notAtStart = _1000.00;          // DOES NOT COMPILE
        //double notAtEnd = 1000.00_;            // DOES NOT COMPILE
        //double notByDecimal = 1000_.00;        // DOES NOT COMPILE
        double annoyingButLegal = 1_00_0.0_0;  // Ugly, but compiles = 1000.0
        double reallyUgly = 1__________2;      // Also compiles =  12.0
        int iii = 1_1_1; // 111

        //Primitives are not references:

        //int value = null;   // cannot be null - Error:(41, 21) java: incompatible types: <nulltype> cannot be converted to int
        //value.something(); // it has no methods - Error:(42, 14) java: int cannot be dereferenced
        //value.x=1; // it has no fields - Error:(43, 14) java: int cannot be dereferenced

    }
}
