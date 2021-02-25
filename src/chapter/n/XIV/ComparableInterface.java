package chapter.n.XIV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.naturalOrder;

public class ComparableInterface implements Comparable<ComparableInterface> {

    private String name;

    public ComparableInterface(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(ComparableInterface o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        {
            ComparableInterface c1 = new ComparableInterface("Zeno");
            ComparableInterface c2 = new ComparableInterface("Adam");
            System.out.println(c1.compareTo(c2)); // 25
            System.out.println(c2.compareTo(c1)); // -25

            List<ComparableInterface> l = new ArrayList<>();
            l.add(c1);
            l.add(c2);
            System.out.println(l); // [Zeno, Adam]
            Collections.sort(l);   // If l wouldn't implement Comparable<>, this wouldn't compile.
            System.out.println(l); // [Adam, Zeno]
            Comparator tComparator = Comparator.naturalOrder();
            int compare = tComparator.compare(c1, c2);
            System.out.println(compare);
        }
        {
            CompareInt c1 = new CompareInt(1);
            CompareInt c2 = new CompareInt(2);
            System.out.println(c1.compareTo(c2)); // -1
            System.out.println(c2.compareTo(c1)); // 1
            List<CompareInt> l = new ArrayList<>();
            l.add(c2);
            l.add(c1);
            System.out.println(l); // [2, 1]
            Collections.sort(l);
            System.out.println(l); // [1, 2]
        }
        {
            List<CompareNullableInt> l = new ArrayList<>();
            l.add(new CompareNullableInt(null));
            l.add(new CompareNullableInt(2));
            l.add(new CompareNullableInt(null));
            l.add(new CompareNullableInt(1));
            System.out.println(l);
            Collections.sort(l);
            System.out.println(l);
        }
    }
}

class CompareInt implements Comparable<CompareInt> {
    @Override
    public int compareTo(CompareInt o) {
        return value - o.value;
    }

    private Integer value;

    public CompareInt(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

}

class CompareNullableInt implements Comparable<CompareNullableInt> {
    @Override
    public int compareTo(CompareNullableInt o) {
        if (value == null && o.value == null) {
            return 0;
        } else if (value == null) {
            return -1;
        } else if (o.value == null) {
            return 1;
        } else {
            return value - o.value;
        }
    }

    private Integer value;

    public CompareNullableInt(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == null) {
            return "null";
        } else {
            return value.toString();
        }
    }

    public static void main(String[] args) {
        {
            List<CompareNullableInt> l = new ArrayList<>();
            l.add(new CompareNullableInt(null));
            l.add(new CompareNullableInt(2));
            l.add(new CompareNullableInt(null));
            l.add(new CompareNullableInt(1));
            System.out.println(l); // [null, 2, null, 1]
            Collections.sort(l);
            System.out.println(l); // [null, null, 1, 2]
        }
    }
}
