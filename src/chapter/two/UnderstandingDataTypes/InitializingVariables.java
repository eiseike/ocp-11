package chapter.two.UnderstandingDataTypes;

public class InitializingVariables {

//    var tricky = "Hello"; // Error:(5, 5) java: 'var' is not allowed here

    public static void main(String[] args) {

        var tricky = "Hello";
        System.out.println("tricky = " + tricky); // tricky = Hello


        String s1, s2;
        String s3 = "yes", s4 = "no";

        int i1, i2, i3 = 1;

//        System.out.println("i1 = " + i1); // Error:(18, 38) java: variable i1 might not have been initialized
//        System.out.println("i2 = " + i2); // Error:(19, 38) java: variable i2 might not have been initialized
        System.out.println("i3 = " + i3);  // i3 = 1

//        int i4, int i5 = 1; //error Error:(22, 16) java: <identifier> expected
        int i4, i5 = 1; //ok i4 is a unasigned int, i5 is a int 1.

        boolean value;
//        findAnswer(value);  // Error: Error:(13, 20) java: variable value might not have been initialized

        var number = 7;
        number = 4;
//        number = "five";  // Error: Error:(17, 18) java: incompatible types: java.lang.String cannot be converted to int


        var apples = (short) 10;
        apples = (byte) 5; //still short!!!!
        System.out.println(((Object) apples).getClass().getName());

//        apples = 1_000_000;  //Error: Error:(24, 18) java: incompatible types: possible lossy conversion from int to short

        int breakInt    //ok
                = 1;    //ok
        var breakInt2   //ok
                = 1;    //ok


//        var question; //nooope, Error:(32, 13) java: cannot infer type for local variable question (cannot use 'var' on variable without initializer)
//        question = 1;

        // var a = 2, b = 3;  // Error - Error:(48, 20) java: 'var' is not allowed in a compound declaration
        var a = 2; // ok
        var b = 3; // ok


        // var n = null; // Error:(53, 13) java: cannot infer type for local variable n (variable initializer is 'null')

        var n = "myData";
        n = null; //ok, n is inferred as String, String can be null

        //var m = 4;
        //m = null;  // Error - Error:(59, 13) java: incompatible types: <nulltype> cannot be converted to int


        /*

        // this is ok, var can be anything but a type name
        package var;
 
        public class Var {
           public void var() {
              var var = "var";
           }
        public void Var() {
              Var var = new Var();
           }
        }
        */

        /*

        //this is NOT ok, var is reserved name A reserved type name means it cannot be used to define a type, such as a class, interface, or enum.
        //
        //Boyarsky, Jeanne; Selikoff, Scott. OCP Oracle Certified Professional Java SE 11 Developer Complete Study Guide (p. 59). Wiley. Kindle Edition.
    public class var {  // Error:(84, 18) java: 'var' not allowed here
        public var() {
        }
    }

         */


    }

    public static void findAnswer(boolean b) {
    }



}
