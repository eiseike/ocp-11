package chapter.n.XIV;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapImplementations {
    public static void main(String[] args) {

        Map<String, Object> hm = new HashMap<>();
        hm.put("b", null);
        hm.put("bb", null);
        hm.put("a", null);

        System.out.println(hm.keySet()); // [bb, a, b]

        Map<String, Object> tm = new TreeMap<>();
        tm.put("bb", null);
        tm.put("b", null);
        tm.put("a", null);

        System.out.println(tm.keySet()); // [a, b, bb]

        Map<String, String> m = new HashMap<>();
        m.put("A", "a");               // m={A=a}
        m.clear();                     // m={}
        m.put("1", "1");               // m={1=1}
        m.put("B", "b");               // m={1=1, B=b}
        m.put("C", "c");               // m={1=1, B=b, C=c}
        m.containsKey(1);     // false
        m.containsKey(false); // false
        m.containsKey("0");   // false
        m.containsKey("1");   // true

        m.containsValue(1);   // false
        m.containsValue(false); // false
        m.containsValue("0"); // false
        m.containsValue("1"); // true

        m.entrySet(); // [1=1, B=b, C=c]

        m.forEach((String k, CharSequence v) -> {
            System.out.print(k + ":" + v); // 1:1B:bC:c
        });

        m.get(1); // null
        m.get("1"); // "1"
        m.get("C"); // "c"

        m.getOrDefault(1, "default"); // "default"

        m.isEmpty(); // false

        m.keySet(); // [1, B, C]

        // merge sets key to value if key not presents then return the value
        m.merge("2", "2", (s, s2) -> null); // 2 (m={1=1, 2=2, B=b, C=c})

        // merge removes key if presents and BiFunction returns null then returns null
        m.merge("2", "2", (s, s2) -> null); // null (m={1=1, B=b, C=c})

        // merge changes key if presents and BiFunction not returns null then returns BiFunction's result
        m.merge("1", "new value", (oldV, newV) -> {
                    // oldV = 1
                    // newV = new value
                    return "x";
                }
        );                                            // x (m={1=x, B=b, C=c})

        m.put("1", "I");                              // x (m={1=I, B=b, C=c})

        m.put("0", "0");                   // null (m={0=0, 1=I, B=b, C=c})

        m.putIfAbsent("1", "!"); // I (m={0=0, 1=I, B=b, C=c})
        m.putIfAbsent("D", "!"); // !!!null!!! (m={0=0, 1=I, B=b, C=c, D=!})

        m.remove("D"); // ! (m={0=0, 1=I, B=b, C=c})
        m.remove("D"); // null (m={0=0, 1=I, B=b, C=c})
        m.remove(null); // null (m={0=0, 1=I, B=b, C=c})

        m.replace("D", "D"); // null (m={0=0, 1=I, B=b, C=c})
        m.replace(null, null); // null (m={0=0, 1=I, B=b, C=c})
        m.replace("1", "1"); // I (m={0=0, 1=1, B=b, C=c})

        m.replaceAll((String k, String v) -> v.toUpperCase()); // void! (m={0=0, 1=1, B=B, C=C})

        m.size(); // 4

        m.keySet(); // [0, 1, B, C]
        m.values(); // [0, 1, B, C]

    }
}
