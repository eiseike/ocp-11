package chapter.o.XV.streams;

import java.util.IntSummaryStatistics;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        {
            Stream<Integer> boxedi = IntStream.of(1).boxed();
            Stream<Integer> boxedi2 = IntStream.of('1').boxed();
            Stream<Integer> boxedi3 = IntStream.of((short)1).boxed();
            Stream<Double> boxedd = DoubleStream.of(1.0).boxed();
            Stream<Long> boxedl = LongStream.of(1L).boxed();
        }
        {
            IntStream range = IntStream.range(0, 10);
            range.forEach(System.out::print); //0123456789
        }
        {
            IntSummaryStatistics intSummaryStatistics = IntStream.range(0, 10).summaryStatistics();
            System.out.println(intSummaryStatistics);
        }

    }
}
