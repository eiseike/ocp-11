package not.canon.testbench;

public enum AnimalClasses {
   MAMMAL(true), INVERTIBRATE(Boolean.FALSE), BIRD(false),
   REPTILE(false), AMPHIBIAN(false), FISH(false) {
      public int swim() { return 4; }
   //} //FUCK YOU VIZSGA
   };
   final boolean hasHair;
   //public AnimalClasses(boolean hasHair) { /FUCK YOU VIZSGA
   AnimalClasses(boolean hasHair) {
      this.hasHair = hasHair;
   }
   public boolean hasHair() { return hasHair; }
   public int swim() { return 0; }
}
