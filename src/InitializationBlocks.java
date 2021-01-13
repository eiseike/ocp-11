public class InitializationBlocks {
    {
        System.out.println("1 - Initializer block 1");
    }
    static {
        System.out.println("0 - Static initializer block");
    }
    InitializationBlocks() {
        System.out.println("C - Constructed!");
    }
    {
        System.out.println("2 - Initializer block 2");
    }


    public static void main(String[] args) {
        System.out.println("I.");
        InitializationBlocks i1;
        System.out.println("II.");
        i1 = new InitializationBlocks();
        System.out.println("III.");
        var i2 = new InitializationBlocks();
        System.out.println("IV.");
        InitializationBlocksB i3;
        System.out.println("V.");
        i3 = new InitializationBlocksB();
    }
}


