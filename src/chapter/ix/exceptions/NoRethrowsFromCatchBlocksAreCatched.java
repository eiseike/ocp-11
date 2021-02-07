package chapter.ix.exceptions;

import java.io.FileReader;

public class NoRethrowsFromCatchBlocksAreCatched {
	public static void main(String[] args) {
		System.out.print("a");                    // sout a
		try {
			System.out.print("b");                // sout b
			throw new IllegalArgumentException(); // IllegalArgumentException thrown from try
		} catch (IllegalArgumentException e) {    // IllegalArgumentException catched in a catch block
			System.out.print("c");                // sout c
			throw new RuntimeException("1");      // No catch block will catch this RuntimeException,
			// going to finally before throw this RuntimeException
		} catch (RuntimeException e) {            // ...skipping this line ....
			System.out.print("d");                // ...skipping this line ....
			throw new RuntimeException("2");      // ...skipping this line ....
		} finally {                               // finally
			System.out.print("e");                // sout e
			throw new RuntimeException("3");      // We already have a RuntimeException(1) but finally hijacks
			// every return and throw, so throw this RuntimeException(3) instead
		}
	}
	/*
abceException in thread "main" java.lang.RuntimeException: 3
	at chapter.ix.exceptions.NoRethrowsFromCatchBlocksAreCatched.main(NoRethrowsFromCatchBlocksAreCatched.java:20)
	 */
}