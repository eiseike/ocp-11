package not.canon.testbench;
public interface BigCat {
    String getName();
    default void defaultShowName() {System.out.println(getName());}
}
class BigCatImpl implements BigCat{
    public static void main(String[] args) {
        BigCatImpl b = new BigCatImpl();
        b.defaultShowName(); //implemented
    }
    @Override
    public String getName() {
        return "implemented";
    }
    String getName = "1";
}