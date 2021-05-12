package not.canon.testbench;

import java.io.IOException;
import java.util.*;

public class WildCard implements Comparator {
    public void showSize(List<?> list) {
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        {
//        WildCard card = new WildCard();
//
//        ArrayList <? extends Number> list = new ArrayList <Integer>()
//        ;
//        card.showSize(list);


            Comparator<Integer> c1 = (o1, o2) -> o2 - o1;
            Comparator<Integer> c2 = Comparator.naturalOrder();
            Comparator<Integer> c3 = Comparator.reverseOrder();

            var list = Arrays.asList(5, 4, 7, 2);
            Collections.sort(list, c3);
            System.out.println(Collections.binarySearch(list, 2));


            List<Integer> q = new LinkedList<>();
            q.add(10);
            q.add(12);
            q.remove(1);
            System.out.print(q);

            Map m = new HashMap();
            m.put(123, "456");
            m.put("abc", "def");
            System.out.println(m.containsValue("123"));
        }
        {
            var map = Map.of(1, 2, 3, 6);
            var list = List.copyOf(map.entrySet());

            List<Integer> one = List.of(8, 16, 2);
            var copy = List.copyOf(one);
            var copyOfCopy = List.copyOf(copy);
            var thirdCopy = new ArrayList<>(copyOfCopy);

            //list.replaceAll(x -> x * 2);
            //one.replaceAll(x -> x * 2);
            thirdCopy.replaceAll(x -> x * 2);

            System.out.println(thirdCopy);
        }
        {
            Set<?> set = Set.of("lion", "tiger", "bear");
            var s = Set.copyOf(set);
            s.forEach(System.out::println);
        }
        {
            var map = new HashMap<Integer, String>();
            map.put(1, null);
            System.out.println(map);
            map.merge(1,"a", (a,b)->null);
            System.out.println(map);
        }{
            var map = new HashMap<Integer, String>();
            map.put(1, "na jó, ezt végül is én felejtettem el :sweatdrops:");
            System.out.println(map);
            map.merge(1,"a", (a,b)->null);
            System.out.println(map);
        }
    }


    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public static <T> T identity(T t) {
        return t;
    }
}


class W {
}

class X extends W {
}

class Y extends X {
}

class Z<Y> {
    W w1 = new W();
    W w2 = new X();
    //X w3 = new Y();
//   Y y3 = new Y();
}