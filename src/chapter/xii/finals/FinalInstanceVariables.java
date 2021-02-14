package chapter.xii.finals;

public class FinalInstanceVariables {
    public static void main(String[] args) {
        new FinalInstanceVariables();
    }

    final String rule1 = "assign finals when initialized";
    final String rule2;
    final String rule3;

    static {
        //rule2 = "cannot assign value to a final variable in a static block"; //DNC: non-static variable rule2 cannot be referenced from a static context
    }

    {
        rule3 = "assign value to a final variable in an initializer block";
    }

    public FinalInstanceVariables() {
        rule2 = "assign value to a final variable in a constructor";
        final String rule4 = "initialize a final variable in a constructor";
    }
}
