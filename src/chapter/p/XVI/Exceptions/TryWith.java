package chapter.p.XVI.Exceptions;

public class TryWith {
    public static void main(String[] args) throws Exception {

        //try (String s = "a") {
        //} //DNC: incompatible types: try-with-resources not applicable to variable type

        MyString c = new MyString("c");
        try (
                MyString a = new MyString("a");
                MyString b = new MyString("b")
        ) {

            System.out.println("INSIDE");
            System.out.println("a = " + a);
        } catch (Exception e) {
//            System.out.println("a = " + a); //DNC: cannot find symbol variable a
            System.out.println("c = " + c);
        } finally {
//            System.out.println("a = " + a); //DNC: cannot find symbol variable a
            System.out.println("FINALLY");
            if (c!=null){
                c.close();
            }
        }
        // OPENING: c
        // OPENING: a
        // OPENING: b
        // INSIDE
        // a = MyString{s='a'}
        // CLOSING: b
        // CLOSING: a
        // FINALLY
        // CLOSING: c
    }
}

