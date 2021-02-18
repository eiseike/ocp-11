package chapter.m.XIII.floats;

// Birch.java
import java.util.function.Predicate;
interface Wood {}
@Floats class Duck {}
@Floats
public class Birch implements @Floats Wood {
   //@Floats(10)
     boolean mill() {
      Predicate<Integer> t = (@Floats Integer a) -> a > 10;
     return //(@Floats)
       t.test(12);
   } }