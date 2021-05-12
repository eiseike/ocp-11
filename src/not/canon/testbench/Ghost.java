package not.canon.testbench;

public class Ghost {
    public static void boo() {
        System.out.println("Not scared");
    }
    protected class Spirit {
        public void boo() {
            System.out.println("Booo!!!");
        }
    }
    public static void main(String... haunt) {
        //cannot inherit from final not.canon.testbench.Ghost.Spirit
        var g = new Ghost().new Spirit() {}; //FROM THE TEST
        new Ghost().boo();
    }
}