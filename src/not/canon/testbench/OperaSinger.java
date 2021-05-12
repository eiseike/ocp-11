package not.canon.testbench;

interface Sing {
    boolean isTooLoud(int volume, int limit);
}
public class OperaSinger {
    public static void main(String[] args) {
        //check((h, l) -> h.toString(), 5);  // m1 //DNC:int cannot be dereferenced FROM THE EXAM
        check((h, l) -> true, 5);  // m1
    }
    private static void check(Sing sing, int volume) {
        if (sing.isTooLoud(volume, 10))   // m2
            System.out.println("not so great");
        else System.out.println("great");
    }
}
