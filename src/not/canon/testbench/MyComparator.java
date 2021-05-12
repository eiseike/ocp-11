package not.canon.testbench;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class MyComparator implements Comparator<String> {

   public int compare(String a, String b) {
      return b.toLowerCase().compareTo(a.toLowerCase());
   }
   public static void main(String[] args) {
      String[] values = { "123", "Abb", "aab" };
      Arrays.sort(values, new MyComparator());
      for (var s: values)
         System.out.print(s + " ");


 var map = new HashMap<Integer, Integer>(10);
 for (int i = 1; i <= 10; i++) {
    map.put(i, i * i);
 }
 System.out.println(map.get(4));
   }

}
