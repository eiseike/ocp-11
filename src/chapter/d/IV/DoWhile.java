package chapter.d.IV;

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



        /*
        double iguana = 0;
        do {
            int snake = 1;
            System.out.print(snake++ + " ");
            iguana--;
        } while (snake <= 5); //DNC: cannot find symbol: snake
        System.out.println(iguana);
        */
    }

    public static final boolean DEBUG = false;
    public void method(){
        if(DEBUG){
            System.out.println("debug statement here");
        } // works fine
    }
    /*
    public void method2(){
        while(DEBUG){ //DNC: Error: unreachable statement (if DEBUG final)
            System.out.println("debug statement here");
        }
    }
    */


}
