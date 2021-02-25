package chapter.n.XIV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorReverseOrder implements Comparable<ComparatorReverseOrder>{

    private Integer value;

    public ComparatorReverseOrder(Integer value) {
        this.value=value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }


    public static void main(String[] args) {
        List<ComparatorReverseOrder> l = new ArrayList<>();
        l.add(new ComparatorReverseOrder(1));
        l.add(new ComparatorReverseOrder(2));
        System.out.println(l); // [1, 2]

        // this wouldn't compile if ComparatorReverseOrder wasn't Comparable
        Collections.sort(l, Comparator.reverseOrder());
        // or
        l.sort(Comparator.reverseOrder());

        System.out.println(l); // [2, 1]

        // this wouldn't compile if ComparatorReverseOrder wasn't Comparable
        Collections.sort(l, Comparator.naturalOrder());
        // or
        l.sort(Comparator.naturalOrder());

        System.out.println(l); // [1, 2]
    }

    @Override
    public int compareTo(ComparatorReverseOrder o) {
        return value - o.value;
    }
}
