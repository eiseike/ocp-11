package chapter.m.XIII;

@Mark
public class AMarkerAnnotation {
    public static void main(String[] args) {

    }
}

@interface Mark {
    int i = 1;
    String noope() default "";
}