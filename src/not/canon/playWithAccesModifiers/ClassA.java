package not.canon.playWithAccesModifiers;

public class ClassA {
    private final String privateString;
    final String packagePrivateString;
    protected final String protectedString;
    public final String publicString;

    private static final String privateStaticString = "privateStaticString";
    final static String packagePrivateStaticString = "packagePrivateStaticString";
    protected static final String protectedStaticString = "protectedStaticString";
    public static final String publicStaticString = "publicStaticString";

    public ClassA() {
        packagePrivateString = "packagePrivateString";
        protectedString = "protectedString";
        privateString = "privateString";
        publicString = "publicString";

        System.out.println(this.publicString);
        System.out.println(this.protectedString);
        System.out.println(this.packagePrivateString);
        System.out.println(this.privateString);
        System.out.println(this.publicStaticString);
        System.out.println(this.protectedStaticString);
        System.out.println(this.packagePrivateStaticString);
        System.out.println(this.privateStaticString);
        System.out.println(ClassA.publicStaticString);
        System.out.println(ClassA.protectedStaticString);
        System.out.println(ClassA.packagePrivateStaticString);
        System.out.println(ClassA.privateStaticString);
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println(a.publicString);
        System.out.println(a.protectedString);
        System.out.println(a.packagePrivateString);
        System.out.println(a.privateString);
        System.out.println(a.publicStaticString);
        System.out.println(a.protectedStaticString);
        System.out.println(a.packagePrivateStaticString);
        System.out.println(a.privateStaticString);
        System.out.println(ClassA.publicStaticString);
        System.out.println(ClassA.protectedStaticString);
        System.out.println(ClassA.packagePrivateStaticString);
        System.out.println(ClassA.privateStaticString);
    }
}