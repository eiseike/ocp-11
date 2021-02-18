package chapter.m.XIII;

import java.lang.annotation.*;
enum UnitOfTemp { C, F }
public @interface Snow { boolean value(); }
@Target(ElementType.METHOD) @interface Cold {
   //private Cold() {}
   //int temperature;
   //UnitOfTemp unit default UnitOfTemp.C;
   Snow snow() default @Snow(true);
}
