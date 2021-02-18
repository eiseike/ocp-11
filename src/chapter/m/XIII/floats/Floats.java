package chapter.m.XIII.floats;

import java.lang.annotation.*;
@Target(ElementType.TYPE_USE)
public @interface Floats {
    int buoyancy() default 2;
}