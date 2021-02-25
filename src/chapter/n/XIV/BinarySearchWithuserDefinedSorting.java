package chapter.n.XIV;

import java.util.*;

public class BinarySearchWithuserDefinedSorting {
    public static void main(String[] args) {
        {
            // This won't return any usable data. names are sorted by natural order, but binarySearch uses reverseOrder
            // instead of that.
            var names = Arrays.asList("Fluffy", "Hoppy");
            Comparator<String> c = Comparator.reverseOrder();
            var index = Collections.binarySearch(names, "Hoppy", c);
            System.out.println(index); // -1
        }
        {
            // Now we use a reverse ordered names, so the binarySearch will return index 0 az a match.
            var names = Arrays.asList("Hoppy", "Fluffy");
            Comparator<String> c = Comparator.reverseOrder();
            var index = Collections.binarySearch(names, "Hoppy", c);
            System.out.println(index); // 0
        }

        {
            SortRabbits r = new SortRabbits();
            r.sortThemRabbits();
        }
    }
}

class SortRabbits {
    class Rabbit {
        int id;

        public Rabbit(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return String.valueOf(id);
        }
    }

    public void sortThemRabbits() {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit(3));
        rabbits.add(new Rabbit(4));
        rabbits.add(new Rabbit(1));
        rabbits.add(new Rabbit(2));
        Comparator<Rabbit> c = Comparator.comparingInt(r -> r.id);
        Collections.sort(rabbits, c);
        System.out.println(rabbits);
    }

}



