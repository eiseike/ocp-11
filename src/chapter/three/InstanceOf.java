package chapter.three;

public class InstanceOf {
    public static void main(String[] args) {
        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;

        System.out.println("(null instanceof Object) = " + (null instanceof Object)); //false

        Object noObjectHere = null;
        System.out.println("(noObjectHere instanceof String) = " + (noObjectHere instanceof String)); //false

        // if (null instanceof null){} //java: illegal start of type (the second null is not an object)

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
}
