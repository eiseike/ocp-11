import a.Classname;


public class Klassz {

    public static void add(Integer x, Integer y) {
        //x = x + y;
    }

    public static void main(String[] args) {
        Integer i = new Integer(1);
        System.out.println("i.valueOf() = " + i.valueOf());
        Classname c;

        i.stg = 2;
        Integer i2 = new Integer(2);
        System.out.println("i2.stg = " + i2.stg);

        System.out.println("Integer.stg = " + Integer.stg);

        var x = new Integer(15);
        var y = new Integer(20);

        Klassz.add(x, y);
        System.out.println("x = " + x);
    }


}

class Integer {


    public static int stg = 0;

    private int intt;

    public Integer(int i) {
        intt = i;
    }

    public int valueOf() {
        return new java.lang.Integer(intt);
    }
}
