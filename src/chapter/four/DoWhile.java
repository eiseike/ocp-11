package chapter.four;

public class DoWhile {
    public static void main(String[] args) {

        do {
            System.out.println("did!");
        } while (false);


        boolean idk = true;
        while (idk) {
            idk = false;
            System.out.println("idk = " + idk);
        }
    }
}
