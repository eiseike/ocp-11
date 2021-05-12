package chapter.o.XV;

import java.util.Optional;

public class ChainingOptionals {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("1");
        //Optional<Integer> result = optional.map(ChainingOptionals::calculator); //DNC
        Optional<Integer> result = optional.flatMap(ChainingOptionals::calculator);
    }

    private static Optional<Integer> calculator(String s) {
        if (s.length() > 0 ) {
            return Optional.of(s.length());
        }
        return Optional.empty();
    }
}
