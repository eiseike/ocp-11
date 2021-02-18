package chapter.l.XII.finals;

public class FinalStaticClassVariables {
    final static String rule1 = "assign final statics (constants) when initialized";
    final static String rule2;

    static
    {rule2 = "assign value to a final static in a static block";}

    {
        //final static String rule3="cannot initialize a final static variable in an initializer block"; //DNC: modifier static not allowed here
    }

    public FinalStaticClassVariables() {
        //final static String rule4="cannot initialize a final static variable in a constructor"; //DNC: modifier static not allowed here
    }
}
