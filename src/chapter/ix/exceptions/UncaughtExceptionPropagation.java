package chapter.ix.exceptions;

public class UncaughtExceptionPropagation {
   public void go() {
      System.out.print("A"); // 1st
      try {
         stop();
      } catch (ArithmeticException e) {
         System.out.print("B");
      } finally {
         System.out.print("C"); // third
      } //uncaught exception, propagating back to caller
      System.out.print("D");
   }
   public void stop() {
      System.out.print("E"); //2nd
      Object x = null;
      x.toString();
      System.out.print("F");
   }
   public static void main(String n[]) {
      new UncaughtExceptionPropagation().go();
      /*
AECException in thread "main" java.lang.NullPointerException
	at chapter.ix.exceptions.UncaughtExceptionPropagation.stop(UncaughtExceptionPropagation.java:18)
	at chapter.ix.exceptions.UncaughtExceptionPropagation.go(UncaughtExceptionPropagation.java:7)
	at chapter.ix.exceptions.UncaughtExceptionPropagation.main(UncaughtExceptionPropagation.java:22)

       */
   }
}
