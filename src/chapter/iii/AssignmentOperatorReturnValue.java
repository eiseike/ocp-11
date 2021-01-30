package chapter.iii;

public class AssignmentOperatorReturnValue {
    public static void main(String[] args) {
        long wolf = 5;
        long coyote = (wolf = 3);
        System.out.println(wolf);   // 3
        System.out.println(coyote); // 3


        int i;
        System.out.println("(i=1) = " + (i = 1)); // (i=1) = 1

        boolean healthy = false;
        if(healthy = true) // = !!!!!!!!!!!!!!!!
            System.out.println("healthy = " + healthy);
    }
}
