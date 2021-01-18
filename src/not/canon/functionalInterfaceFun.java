package not.canon;

import java.util.function.Function;

public class functionalInterfaceFun {
    public static void main(String[] args) {
        odaVisszaFun();
    }

    private static void odaVisszaFun() {
        Function<Integer, String> oda = String::valueOf;

        Function<String, Integer> vissza = Integer::parseInt;

        Function<String, String> odaVissza = oda.compose(vissza);

        System.out.println("odaVissza.apply(\"1\") = " + odaVissza.apply("1"));
    }
}
