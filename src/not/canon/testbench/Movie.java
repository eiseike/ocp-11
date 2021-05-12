package not.canon.testbench;

public class Movie {
   private int butter = 5;
   private Movie() {
       System.out.println("private Movie() called");
   }
   private void movie() {}

   protected class Popcorn {
      private Popcorn() {}
      //public static int butter = 10; //FROM THE EXAM
      public int butter = 10;
      public void startMovie() {
         System.out.println(butter);
      }
   }
   public static void main(String[] args) {
      var movie = new Movie();
      //Movie.movie(); // non-static method movie() cannot be referenced from a static context
      Movie.Popcorn in = new Movie().new Popcorn();
      in.startMovie();
   } }