package chapter.p.XVI.Exceptions;

import java.io.IOException;

public class TryWithSupressedCatched {
    public static void main(String[] args) throws Exception {
        {
            var o = new Opened();
            try (o) {
                // this throw calls the closes of the resources. `o` throw another
                // IllegalStateException and that will be added as a suppressed one to this throw.
                throw new IllegalStateException("try throw!");

            } catch (IllegalStateException e) {
                System.out.println("caught = " + e);
                for (Throwable s : e.getSuppressed()
                ) {
                    System.out.println("suppressed = " + s);
                }
            }
            // caught = java.lang.IllegalStateException: try throw!
            // suppressed = java.lang.IllegalStateException: close throw!
        }
        {
//            var o = new Opened();
//            try (o) {
//                // this throw calls the closes of the resources. `o` throw another
//                // IllegalStateException and that will be added as a suppressed one to this throw.
//                throw new IOException("try throw!");
//
//            } catch (IllegalStateException e) {
//                System.out.println("caught = " + e);
//                for (Throwable s : e.getSuppressed()
//                ) {
//                    System.out.println("suppressed = " + s);
//                }
//            }
            // as there is no IOException catch block, this try block won't catch the exception but delegate the
            // Exception to the caller method and thus the program will exit with code 1 and with output like this:
            //
            // Exception in thread "main" java.io.IOException: try throw!
            //     at chapter.p.XVI.Exceptions.TryWithSupressedCatched.main(TryWithSupressedCatched.java:29)
            // Suppressed: java.lang.IllegalStateException: close throw!
            //     at chapter.p.XVI.Exceptions.TryWithSupressedCatched$Opened.close(TryWithSupressedCatched.java:51)
            // at chapter.p.XVI.Exceptions.TryWithSupressedCatched.main(TryWithSupressedCatched.java:26)

        }
        {
            var o = new Opened();
            try (o) {
                // this throw calls the closes of the resources. `o` throw another
                // IllegalStateException and that will be added as a suppressed one to this throw.
                throw new IOException("try throw!");

            } catch (IllegalStateException e) {
                System.out.println("caught = " + e);
                for (Throwable s : e.getSuppressed()
                ) {
                    System.out.println("suppressed = " + s);
                }
            } finally {
                throw new IOException("Always bet on the finally");
            }
            // as there is no IOException catch block, this try block won't catch the exception but would delegate the
            // Exception to the caller method. But finally throws a new IOException and this new exception overwrites
            // the old trace thus the program will exit with code 1 and with output like this (without mentioning the
            // lost exceptions):
            //
            // Exception in thread "main" java.io.IOException: Always bet on the finally
            //     at chapter.p.XVI.Exceptions.TryWithSupressedCatched.main(TryWithSupressedCatched.java:62)

        }
    }

    public Opened getOpened() {
        return new Opened();
    }

    static class Opened implements AutoCloseable {
        @Override
        public void close() throws Exception {
            throw new IllegalStateException("close throw!");
        }
    }
}
