package chapter.four;

public class Switch {

    public static void main(String[] args) {

/*
        int month = 5;
 
        switch month {  // DOES NOT COMPILE
            case 1: System.out.print("January");
        }
 
        switch (month)  // DOES NOT COMPILE
        case 1: System.out.print("January");
 
        switch (month) {
            case 1: 2: System.out.print("January"); // DOES NOT COMPILE
        }
 
        switch (month) {
            case 1 || 2: System.out.print("January"); // DOES NOT COMPILE
        }
*/
        int dayOfWeek = 5; // default then break;
        switch (dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

        dayOfWeek = 5; // default, then case 6, then break
        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }


        // Numeric Promotion and Casting

        short size = 4;
        final int small = 15;
        final int big = 1_000_000;
        int notThatBig = 30000;
        final int NOT_THAT_BIG = 30000;
        switch(size) {
            case small: // compile, switch short <-> case implicit short from int
            case 1+2 : // compile, switch short <-> case implicit short from int
            //case big:  // DOES NOT COMPILE switch short <-> case too big int
            //case notThatBig: // DOES NOT COMPILE switch short <-> not a constant
            case NOT_THAT_BIG: // compile, switch short <-> case implicit short from int
                System.out.println("size = " + size);
        }
    }

    final int getCookies() {
        return 4;
    }

    void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch (numberOfAnimals) {
            case bananas:
                //case apples:  // DOES NOT COMPILES
                //case getCookies():  // DOES NOT COMPILE
                //case cookies :  // DOES NOT COMPILE
            case 3 * 5:
        }
    }

    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
            case "Test":
                return 52;
            /*
            case middleName:  // DOES NOT COMPILE (not a constant)
                id = 5;
                break;
            case suffix:
                id = 0;
                break;
            case lastName:    // DOES NOT COMPILE (not a copnstant)
                id = 8;
                break;
            case 5:           // DOES NOT COMPILE (not a String)
                id = 7;
                break;
            case 'J':         // DOES NOT COMPILE (not a String)
                id = 10;
                break;
            case java.time.DayOfWeek.SUNDAY:  // DOES NOT COMPILE (not a String)
                id=15;
                break;
                */
        }
        return id;
    }

}
