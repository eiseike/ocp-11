package chapter.m.XIII;

import java.lang.annotation.*;

@Deprecated
public  class Driver {
    public static void main(String[] args) {
         System.out.println("hi");
    }


}

@Documented @Deprecated
@interface Driver2 {
    int[] value();
    String name() default "";
}


@Driver2(name="a",value = 1) class Taxi {}