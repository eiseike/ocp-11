
public class Trues {




    public static void main(String[] foo) {
        var s1 = "Java"; //a
        var s2 = "Java"; //a
        var s3 = "Ja".concat("va"); //b
        var s4 = s3.intern(); //a
        var sb1 = new StringBuilder(); //c
        sb1.append("Ja").append("va"); //c

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
    }



}
