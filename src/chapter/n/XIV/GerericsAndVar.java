package chapter.n.XIV;

import java.util.ArrayList;
import java.util.List;

public class GerericsAndVar {
    public static void main(String[] args) {
        List<?> x1 = new ArrayList<>();
        var x2 = new ArrayList<>();

//        List<Object> ol1 = x1; //DNC: incompatible types: List<capture#1 of ?> cannot be converted to List<Object>
        List<Object> ol2 = x2;

        List<?> al1 = x1;
        List<?> al2 = x1;

        System.out.println(x1.getClass().getName());
        System.out.println(x2.getClass().getName());
    }
}

