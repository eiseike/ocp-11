package chapter.n.XIV;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementations {
    public static void main(String[] args) {

        {
            Set<Hash> s = new HashSet<>();
            // Hash has no implemented equals and hashCode, so every Hash object is "different".
            s.add(new Hash());
            s.add(new Hash());
            s.add(new Hash());
            System.out.println(s); // [Hash@1, Hash@2, Hash@3]
        }
        {
            Set<SameHash> s = new HashSet<>();
            // SameHash's equals and hashCode implementation return the same value, so every SameHash object is the "same".
            s.add(new SameHash());
            s.add(new SameHash()); // duplicate
            s.add(new SameHash()); // duplicate
            System.out.println(s); // [SameHash@1]
        }
        {

            Set<Hash> s = new TreeSet<>();
            // Hash is not Comparable, so TreeSet throws ClassCastException on the first add
            try {
                s.add(new Hash()); // throws ClassCastException class Hash cannot be cast to class Comparable
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        {
            Set<Hash> s = new TreeSet<>( (s1,s2)->0 ); // Specify comparator in the constructor
            s.add(new Hash());
            s.add(new Hash()); // duplicate
            s.add(new Hash()); // duplicate
            System.out.println(s); // [Hash@1]
        }
        {
            Set<ComparableHash> s = new TreeSet<>();
            s.add(new ComparableHash());
            s.add(new ComparableHash()); // duplicate
            s.add(new ComparableHash()); // duplicate
            System.out.println(s); // [ComparableHash@1]
        }
    }
}

class Hash {}

class SameHash{
    @Override
    public int hashCode() {
        return 0;
    }
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

class ComparableHash implements Comparable<ComparableHash> {
    @Override
    public int compareTo(ComparableHash o) {
        return 0;
    }
}
