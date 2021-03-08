package chapter.o.XV;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Supplier;

public class ImplementingSupplier {
    public static void main(String[] args) {
        {
            Supplier<LocalDate> s1 = LocalDate::now;
            Supplier<LocalDate> s2 = () -> LocalDate.now();

            LocalDate d1 = s1.get();
            LocalDate d2 = s2.get();

            System.out.println(d1);
            System.out.println(d2);
        }
        {
            Supplier<StringBuilder> s1 = StringBuilder::new;
            Supplier<StringBuilder> s2 = () -> new StringBuilder();

            System.out.println(s1.get().append("a"));
            System.out.println(s2.get());
        }
        {
            Supplier<String> s1 = new Supplier<String>(){
                @Override
                public String get() {
                    return "nesze egy string";
                }
            };
            Supplier<String> s2 = () -> "Nesze egy masik string!";
            System.out.println(s1.get());
            System.out.println(s2 .get());
        }
        {
            Supplier<ArrayList<String>> s3 = ArrayList<String>::new;
            ArrayList<String> a1 = s3.get();
            System.out.println(s3);
            System.out.println(a1);

        }
        {
            Supplier<ArrayList<String>> s3 = ArrayList::new;
            ArrayList<String> a1 = s3.get();
            a1.add("This is fun!");
            System.out.println(a1);
        }

    }
}
