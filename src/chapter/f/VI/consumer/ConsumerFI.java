package chapter.f.VI.consumer;

import java.util.function.Consumer;

public class ConsumerFI {

	public static void main(String[] args) {
		Consumer<String> consumer = x -> System.out.println(x);

		print(consumer, "Hello World");
	}

	private static void print(Consumer<String> consumer, String value) {
		consumer.accept(value);
	}

}
