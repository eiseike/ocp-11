package chapter.m.XIII;

import java.util.Arrays;
import java.util.List;

public class AnnotationElementTypes {
    public static void main(String[] args) {

    }
}
interface Fox {}
class Bear {}
enum Size {SMALL, MEDIUM, LARGE}

@interface Panda {
    //Integer badHeight(); //DNC: invalid type for annotation type element
    int height();
    //String[][] BadGeneralInfo(); //DNC:invalid type for annotation type element
    String[] generalInfo();
    Size size() default Size.SMALL;
    //Bear BadFriendlyBear(); //DNC:invalid type for annotation type element
    Class<Bear> FriendlyClass();
    //Fox BadFriendlyFox(); //DNC:invalid type for annotation type element
    Class<Fox> friendlyFox();
    Exercise exercise() default @Exercise(hoursPerDay=2);
    Exercise[] exercises() default {@Exercise(hoursPerDay=2), @Exercise(hoursPerDay=3)};

    //protected Material material();  //DNC: modifier protected not allowed here
    //private String friendly();      //DNC: modifier private not allowed here
    //final boolean isBunny();        //DNC: modifier final not allowed here
    Material GoodMaterial();
    abstract String GoodFriendly();
    public abstract boolean GoodIsBunny();
}

@interface Exercise {
    int hoursPerDay();
    int startHour() default 6;
}
@interface Material {}


