package chapter.three;

public class LogicalOperators {
    public static void main(String... args) {

        boolean eyesClosed = true;
        boolean breathingSlowly = true;
        boolean resting = eyesClosed | breathingSlowly;
        boolean asleep = eyesClosed & breathingSlowly;
        boolean awake = eyesClosed ^ breathingSlowly;
        System.out.println("awake = " + awake);
        System.out.println("asleep = " + asleep);
        System.out.println("resting = " + resting);
        /*
        awake = false
        asleep = true
        resting = true
        */

        int hour = 10;
        boolean zooOpen = true || (hour < 4);
        System.out.println(zooOpen);  // true

        // NPE

        Integer i=null;
        //if(i!=null & i <5) {} // Runtime: Exception in thread "main" java.lang.NullPointerException
        if(i!=null && i <5) {}

        int rabbit = 6;

        // Because rabbit >= 6 is true, the increment operator on the right side
        // of the expression is never evaluated, so the output is 6.
        boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
        System.out.println(rabbit); // 6

    }
}
