package chapter.n.XIV;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferences {
    public static void main(String[] args) {
        {
            var str = "abc";
            Predicate<String> methodRef = str::startsWith;
            Predicate<String> lambda = s -> str.startsWith(s);

            boolean a = methodRef.test("a");
            System.out.println(" a = " + a);
            boolean b = methodRef.test("b");
            System.out.println(" b = " + b);
        }
        {
            Function<Integer, List<String>> f = x -> new ArrayList<>(x);
            List<String> l = f.apply(1);
            System.out.println(" l = " + l);
        }
    }
}
