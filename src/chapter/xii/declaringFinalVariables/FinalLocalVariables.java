package chapter.xii.declaringFinalVariables;

public class FinalLocalVariables {

    // a final class variable has to be assigned to a value or object once for it's lifecycle.

    public static void main(String[] args) {
        printZooInfo(true);
        printZooInfo(false);

        {
            String str1 = "DYNAMIC str";
            String str2 = "ing";
            String dynamicConcat = str1 + str2;

            System.out.println("(dynamicConcat == \"DYNAMIC string\") = " + (dynamicConcat == "DYNAMIC string"));
        }
        {

            // When you declare a String (which is immutable) variable as final, and initialize it with a compile-time
            // constant expression, it also becomes a compile-time constant expression, and its value is inlined by the
            // compiler where it is used.

            final String str1 = "STATIC str";
            final String str2 = "ing";
            String staticConcat = str1 + str2; //becomes String staticConcat = "STATIC string";

            // when compared staticConcat to "string" will give true, because string literals are interned.
            System.out.println("(staticConcat == \"STATIC string\") = " + (staticConcat == "STATIC string"));

        }
    }

    public static void printZooInfo(boolean isWeekend) {
        final int giraffe = 5;

        final long lemur;
        if (isWeekend) lemur = 5;
        else lemur = 10;

        System.out.println(giraffe + " " + lemur);
    }

    public void badPrintZooInfo(boolean isWeekend) {
        final int giraffe = 5;
        final long lemur;
        final Long lemur2;
        if(isWeekend) lemur = 5;
        //giraffe = 3; //DNC: cannot assign a value to final variable giraffe
        //System.out.println(giraffe+" "+lemur); //DNC: variable lemur might not have been initialized
        //System.out.println(lemur2); //DNC: lemur2 might not have been initialized
    }

}
