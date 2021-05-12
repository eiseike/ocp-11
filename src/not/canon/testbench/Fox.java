package not.canon.testbench;

public class Fox {
    private class Den {}
    public void getDen() {
        new Den();
    }
    public static void visitFriend() {
        //new Den();  // DOES NOT COMPILE
        new Fox().getDen();
    }
}

class Squirrel {
    public void visitFox() {
        //new Den();  // DOES NOT COMPILE
        new Fox().getDen();  // DOES NOT COMPILE
    }
}

