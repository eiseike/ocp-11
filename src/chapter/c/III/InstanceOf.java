package chapter.c.III;

public class InstanceOf {
    public static void main(String[] args) {

        Object s = "a";
        String ss = (String) s;
        System.out.println("ss = " + ss);

        Object o = ss;




        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;

        System.out.println("(null instanceof Object) = " + (null instanceof Object)); //false

        Object noObjectHere = null;
        System.out.println("(noObjectHere instanceof String) = " + (noObjectHere instanceof String)); //false

        // if (null instanceof null){} //java: illegal start of type (the second null is not an object)

        // if(new Integer(1) instanceof String){} //DNC: Integer cannot be converted to String
        // //See:
        // Integer i = (Integer)"1"; //DNC: Integer cannot be converted to String

    }
    public static void openZoo(Number time) {
        if(time instanceof Integer)
            System.out.print((Integer)time + " O'clock");
        else
            System.out.print(time);
    }


    /*
    public static void boomOpenZoo(Number time) {
        if(time instanceof String) //Error: incompatible types: java.lang.Number cannot be converted to java.lang.String
            System.out.print((Integer)time + " O'clock");
        else
            System.out.print(time);
    }
    */

    void stg() {
        if("" instanceof Object){} //true
        if(new Object() instanceof Object){} //true
        if(new Object() instanceof Integer){} //false
        if(new Integer(1) instanceof Number){} //true
    }
}
