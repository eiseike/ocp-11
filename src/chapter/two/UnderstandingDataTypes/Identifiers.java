package chapter.two.UnderstandingDataTypes;

public class Identifiers {

    Identifiers() {
        System.out.println("Constructed!!!1");
    }
    public static void main(String... atLeastITypedIt) {

        var i = new Identifiers();

        /* these are illegal identifiers - reserved names, commands or literals:
            abstract
        assert
        boolean
        break
        byte
        case
            catch
        char
        class
            const
        continue
        default
        do
            double
            else
        enum
            extends
        false
        final
            finally
        float
        for
            goto
        if
            implements
            import
            instanceof
        int
        interface
        long
        native
        new
        null
            package
        private
        protected
        public
        return
        short
        static
        strictfp
        super
        switch
        synchronized
        this
        throw
            throws
        transient
        true
        try
        void
        volatile
        while
        _ (underscore)
                */

        int __;
        int $1;
        int _1;
        long okidentifier;
        float $OK2Identifier;
        boolean _alsoOK1d3ntifi3r;
        char __SStillOkbutKnotsonice$;

        //These examples are not legal:
//        int 11; //cannot sratr with number
//        int _;  //a simple `_` is not allowed
//        byte hollywood@vine; // @ is not a letter, digit, $ or _
//        String *$coffee;     // * is not a letter, digit, $ or _
//        double public;       // public is a reserved word
    }

/*
A reserved type name means it cannot be used to define a type, such as a class, interface, or enum.
var is one of them:
    public class var {  // DOES NOT COMPILE
        public var() {
        }
    }
*/

    public class Var {  // DOES COMPILE
        public void var() {
            var var = 1;
        }
    }

}
