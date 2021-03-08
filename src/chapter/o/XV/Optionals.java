package chapter.o.XV;

import java.util.Optional;

public class Optionals {


    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(average(90, 100)); // Optional[95.0]
        System.out.println(average());        // Optional.empty
        {
            Optional<Double> opt = average(90, 100);
            if (opt.isPresent()) {
                System.out.println(opt.get()); // 95.0
            }
        }
        {
            Optional<Double> opt = average();
            //System.out.println(opt.get()); //Throws java.util.NoSuchElementException: No value present
            System.out.println(opt.orElseGet(()->1.0D));
            //System.out.println(opt.orElseThrow()); //Throws java.util.NoSuchElementException: No value present
            //System.out.println(opt.orElseThrow(()->new Exception("boo!"))); //Throws java.lang.Exception: boo!
        }


    }


}
