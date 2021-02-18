package chapter.d.IV;

import java.util.ArrayList;
import java.util.List;

import static chapter.c.III.NumericPromotion.g;

public class TrickyLoops {
    public static void main(String[] args) {
        {
            var tailFeathers = 3;
            final var one = 1;
            switch (tailFeathers) {
                case one:
                    System.out.print(3 + " ");
                default:
                case 3:
                    System.out.print(5 + " ");
            }
            while (tailFeathers > 1) {
                System.out.print(--tailFeathers + " ");
            }
        }
        // 5 2 1

        System.out.println();
        {
            int participants = 4, animals = 2, performers = -1;

            while ((participants = participants + 1) < 10) {
            }
            do {
            } while (animals++ <= 1);
            for (; performers < 2; performers += 2) {
            }

            System.out.println(participants);
            System.out.println(animals);
            System.out.println(performers);
        }
        // 10
        // 3
        // 3

        /*{

            int w = 0, r = 1;
            String name = "";
            while (w < 2) {
                name += "A";
                do {
                    name += "B";
                    if (name.length() > 0) name += "C";
                    else break;
                } while (r <= 1); // infinite loop as r == 1
                r++;
                w++;
            }
            System.out.println("name = " + name);

        }
         */

        {
            for (var penguin : new int[2]) {
                System.out.println("penguin = " + penguin);
                System.out.println("g(penguin) = " + g(penguin));
            }

            var ostrich = new Character[3];
            for (var emu : ostrich) {
                System.out.println("emu = " + emu);
                System.out.println("g(emu) = " + g(emu));
            }
            List parrots = new ArrayList();
            for (var macaw : parrots) {
                System.out.println("macaw = " + macaw);
                System.out.println("g(macaw) = " + g(macaw));

            }
        }

        {
            for (int i = 1; i < 0; i++) {
                System.out.println("i = " + i);
            }
        }
        {
            int z = 1;
            switch (z) {
                case 2:
                case 3:
                case 4:
            }
        }
        {
            if (true) {
            } else {
                //} else{ //DNC: java: 'else' without 'if'
            }
        }
        {
            int sing = 8, squawk = 2, notes = 0;
            while (sing > squawk) {
                sing--;
                squawk += 2;
                notes += sing + squawk;
            }
            System.out.println(notes);
        }
        {
            String instrument = "violin";
            final String CELLO = "cello";
            String viola = "viola";
            int p = -1;
            switch (instrument) {
                case "bass":
                    break;
                case CELLO:
                    p++;
                default:
                    p++;
                case "VIOLIN":
                    p++;
                case "viola":
                    ++p;
                    break;
            }
            System.out.println(p);

        }

        {
            a x = a.ONE;
            switch (x) {
                case ONE:
                    System.out.println(a.ONE);
            }
        }
        {

            int count = 0;
            BUNNY:
            for (int row = 1; row <= 3; row++)
                RABBIT:for (int col = 0; col < 3; col++) {
                    if ((col + row) % 2 == 0) {
                        // break BUNNY, RABBIT
                        // continue BUNNY, RABBIT
                        // break, continue
                        // ^^^select which needed here to print 2
                    }
                    count++;
                }
            System.out.println(count);
        }
        {
            List<Integer> myFavoriteNumbers = new ArrayList<>();
            myFavoriteNumbers.add(10);
            myFavoriteNumbers.add(14);
            for (var a : myFavoriteNumbers) {
                System.out.print(a + ", ");
                break;
            }

            for (int b : myFavoriteNumbers) {
                continue;
                //System.out.print(b + ", "); //DNC: unreachable statement
            }

            for (Object c : myFavoriteNumbers)
                System.out.print(c + ", ");
        }
        {
            int penguin = 50, turtle = 75;
            boolean older = penguin >= turtle;
            if (older = true) System.out.println("Success");
            else System.out.println("Failure");
            // else if(penguin != 50) System.out.println("Other"); //DNC: java: 'else' without 'if'
        }
        {
            int temperature = 4;
            long humidity = -temperature + temperature * 3;
            if (temperature >= 4)
                if (humidity < 6) System.out.println("Too Low");
                else System.out.println("Just Right");
            else System.out.println("Too High");
            //motherfuckers did not ident this one XD
        }

        {
            int height = 1;
            L1:
            while (height++ < 10) {
                long humidity = 12;
                L2:
                do {
                    if (humidity-- % 12 == 0) continue L2;
                    int temperature = 30;
                    L3:
                    for (; ; ) {
                        temperature++;
                        if (temperature > 50) continue L2;
                    }
                } while (humidity > 4);
            }
        }


        {
            final char a = 'A', e = 'E';
            char grade = 'B';
            switch (grade) {
                default:
                case a:
                //case 'B': 'C': System.out.print("great "); // DNC: not a statement
                    // one cannot chain cases like
                    // case a: b: c: stg;
                    // ... but like ...
                    // case a:
                    // case b:
                    // case c:
                    //     stg;

                case 'D': System.out.print("good "); break;
                case e:
                case 'F': System.out.print("not good ");
            }
        }
    }


    enum a {
        ONE;
    }
}
