package chapter.iv;

public class If {
    public static void main(String[] args) {

        int hourOfDay = 1;
        if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else if(hourOfDay < 11) {
            System.out.println("Good Morning");  // COMPILES BUT IS UNREACHABLE
        } else {
            System.out.println("Good Evening");
        }

        /*
        if(hourOfDay) {}  // DOES NOT COMPILE, not a boolean
        if(hourOfDay = 1) {}  // DOES NOT COMPILE, assigment is an error here
        */
    }
}
