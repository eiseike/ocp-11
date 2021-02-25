package chapter.n.XIV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {

    public static void main(String[] args) {
        Comparator<UncomparableInt> asc = new Comparator<UncomparableInt>() {
            @Override
            public int compare(UncomparableInt o1, UncomparableInt o2) {
                return o1.getValue()-o2.getValue();
            }
        };
        Comparator<UncomparableInt> asc2 = (o1, o2) -> o1.getValue()-o2.getValue();
        Comparator<UncomparableInt> asc3 = Comparator.comparingInt(UncomparableInt::getValue);

        List<UncomparableInt> l = new ArrayList<>();
        l.add(new UncomparableInt(2));
        l.add(new UncomparableInt(1));
        System.out.println(l); // [2, 1]
        //Collections.sort(l); //DNC: no suitable method found for sort(List<UncomparableInt>)
        Collections.sort(l, asc);
        System.out.println(l); // [1, 2]
        Collections.sort(l, asc2);
        System.out.println(l); // [1, 2]
        Collections.sort(l, asc3);
        System.out.println(l); // [1, 2]
    }
}

class UncomparableInt {

    private Integer value;

    public UncomparableInt(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
