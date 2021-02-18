package chapter.m.XIII;

import java.lang.annotation.Repeatable;

@interface FerociousPack {
    Ferocious[] value();          // m1
}

@Repeatable(FerociousPack.class)  // m2
@interface Ferocious { String value() default "1";
//String stg();
}

@Ferocious @Ferocious public class Lion {
    public static void main(String[] args) {

    }
}

@interface Strong {
   int force(); }
@interface Wind {
   public static final int temperature = 20;
   //Integer storm() default 1;
   //public void kiteFlying(); //invalid type for annotation type element
   //protected String gusts();
   //Strong power() default @Strong(10);
}