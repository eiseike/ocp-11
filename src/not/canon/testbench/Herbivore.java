package not.canon.testbench;

public interface Herbivore {
   int amount = 10;
   public int amount2 = 10;
   public static int amount3 = 10;
   public static final int amount4 = 10;

   static boolean gather = true;
   static void eatGrass() {}
   //int findMore() { return 2; }
   default float rest() { return 2; }
   //protected int chew() { return 13; }
   private static void eatLeaves() {}
}
