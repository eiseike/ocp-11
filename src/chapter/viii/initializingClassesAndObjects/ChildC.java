package chapter.viii.initializingClassesAndObjects;

class SuperC {
   static { System.out.print("A"); }
   { System.out.print("B"); }

   public SuperC(String s) {
      this(1);
      System.out.print("C");
   }

   public SuperC() {
      System.out.print("D");
   }

   public SuperC(int i) {
      System.out.print("E");
   }
}

public class ChildC extends SuperC {
   static { System.out.print("F"); }

   public ChildC(int i) {
      super("X");
      System.out.print("G");
   }
   { System.out.print("H"); }

   public static void main(String[] grass) {
      new ChildC(1);
      System.out.println();
      new ChildC(2);
   }
}

//AFBECHG
//BECHG