package chapter.ix;

import javax.management.RuntimeErrorException;
import java.util.Scanner;

public class UnderstandingExceptions {
	public static void main(String... omg) {
		{
			// try withoud curly braces
			//try //DNC: '{' expected //DNC 'try' without 'catch', 'finally' or resource declarations
			//	Thrower.throwSuperE();
			//catch
			//   (SuperE supere) {} //DNC: 'catch' without 'try'
		}
		{
			// empty try
			//try {
			//	Thrower.throwSuperE(); //DNC: 'try' without 'catch', 'finally' or resource declarations
			//	Thrower.throwSubE(); //DNC: 'try' without 'catch', 'finally' or resource declarations
			//}
		}
		{
			// only a finally with uncaught exceptions
			//try {
			//	Thrower.throwSuperE(); //DNC: SuperE must be caught or declared to be thrown
			//	Thrower.throwSubE(); //DNC: SubE must be caught or declared to be thrown
			//} finally {}
		}
		{
			// only a finally is allowed when ther are no uncaught exceptions
			try {
				System.out.println("trying...");
			} finally {
				System.out.println("finally!");
			}
		}
		{
			//empty try blocks are only allowed to use resources as it creates an Implicit finally Block
			try (Closeme c = new Closeme();) {
				System.out.println(c);
			}
		}
		{
			// the resource lives only in the try block
			try (Closeme s = new Closeme()) {
			   s.nextLine();
			} catch(Exception e) {
			   //s.nextInt(); //DNC: cannot find symbol
			} finally {
			   //s.nextInt(); //DNC: cannot find symbol
			}
		}
		{
			// you CAN catch errors but you shouldn't
			try {
				System.out.println("hi");
			} catch (Error e) {
				System.out.println(e);
			}
		}
		{
			try {
				Thrower.throwSuperE();
				Thrower.throwSubE();
			} catch (SuperE supere) {
				// always have to catch the sub exception(s) first!
				//} catch (SubE sube) { //DNC: SubE has already been caught
			}
		}
		{
//			try {
//			} catch (IllegalArgumentException e) {
//				// always have to catch the sub exception(s) first!
//			} catch (NumberFormatException e) {  //DNC: NumberFormatException has already been caught
//			}
		}
		{
			try {
				Thrower.throwSubE();
			} catch (SubE sube) {
				System.out.println(sube);
//			} catch (SuperE supere) {
//				//trying to escape from the block
//				System.out.println(sube); // cannot find symbol
			}
		}
		{
			try {
				Thrower.throwSuperE();
				Thrower.throwSubE();
			} catch (SubE sube) {
			} catch (SuperE supere) {
			}
		}
		{
//			try {
//				Thrower.throwSuperE();
//				Thrower.throwSubE();
//				// Applying a Multi-catch Block
//			} catch (SubE | SuperE supere) { //DNC: Alternatives in a multi-catch statement cannot be related by subclassing; Alternative SubE is a subclass of alternative SuperE
//			}
		}
		{
			try {
				Thrower.throwSuperE();
				Thrower.throwUnrelatedE();
				// Applying a Multi-catch Block
			} catch (UnrelatedException | SuperE e) {
			}
		}
		{

			// finally interrupts any other return statements in the clauses!
			int goHomeFalse = goHome(false);
			System.out.println("goHomeFalse = " + goHomeFalse); // -3
			int goHomeTrue = goHome(true);
			System.out.println("goHomeTrue = " + goHomeTrue); // -3

		}
		{
			// catch cannot catch exception thrown in finally block
			Integer o = null;
			try {
				System.out.println("ok");
			} catch (NullPointerException npe) {
				System.out.println(npe);
			} finally {
			//	o.intValue(); //throws npe
			}
		}
		{
			//printout exceptions
			try {
				Integer i = null;
				i.intValue();
			} catch (Exception e) {
				System.out.println("e = " + e);
				System.out.println("e.getMessage() = " + e.getMessage());
				System.out.print("e.printStackTrace() = ");
				e.printStackTrace(System.out);
			}
		}
		{
			// System.exit() short-circuits finally
			try {
				System.out.println("Bye");
				System.exit(0);
			} finally {
				System.out.print("Never going to get here");  // Not printed
			}
		}

	}

	public static int goHome(boolean boom) {
		try {
			if (boom) {
				throw new Exception("e!");
			}
			System.out.println("1");
			// finally interrupts any other return statements in the clauses!
			return -1;
		} catch (Exception e) {
			System.out.println("2");
			// finally interrupts any other return statements and throws in the clauses!
			throw new Exception("Here we go to boom!");
		} finally {
			System.out.println("3");
			// finally interrupts any other return statements in the clauses!
			return -3;
		}
		//return 4; //DNC: unreachable code
	}

}

class SuperE extends Exception {
}

class SubE extends SuperE {
}

class UnrelatedException extends Exception{}

class Thrower {
	public static void throwSuperE() throws SuperE {}
	public static void throwSubE() throws SubE {}
	public static void throwUnrelatedE() throws UnrelatedException {}
}

class Closeme implements AutoCloseable {
	@Override
	public void close() {
	}

	public void nextLine() {}
}
