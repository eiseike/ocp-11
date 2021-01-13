public class InitializationBlocksB {
    {
        System.out.println("B1 - Initializer block 1");
    }
    static {
        System.out.println("B0 - Static initializer block");
    }
    InitializationBlocksB() {
        System.out.println("BC - Constructed!");
    }
    {
        System.out.println("B2 - Initializer block 2");
    }
}


