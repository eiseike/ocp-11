package chapter.four;

public class BreakContinueLabels {
    public static void main(String[] args) {


        int[][] list = {{1, 13}, {5, 2}, {2, 2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;

        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }
        if (positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at: " +
                    "(" + positionX + "," + positionY + ")");
        }
        // Value 2 found at: (1,1)


        CLEANING:
        for (char stables = 'a'; stables <= 'd'; stables++) {
            for (int leopard = 1; leopard < 4; leopard++) {
                if (stables == 'b' || leopard == 2) {
                    continue CLEANING;
                }
                System.out.println("Cleaning: " + stables + "," + leopard);

            }
        }
        // Cleaning: a,1
        // Cleaning: c,1
        // Cleaning: d,1

        int[] results = searchForValue(list, searchValue);

        if (results == null) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at: " +
                    "(" + results[0] + "," + results[1] + ")");
        }
        // Value 2 found at: (1,1)


        int checkDate = 0;
        while (checkDate < 10) {
            checkDate++;
            if (checkDate > 100) {
                break;
                // checkDate++;  // DNC: Unreachable statement
            }
        }

        int minute = 1;

        WATCH:
        while (minute > 2) {
            if (minute++ > 2) {
                continue WATCH;
                //System.out.print(minute); // DNC: Unreachable statement
            }
        }

        int hour = 2;
        switch (hour) {
            case 1:
                return;
                // hour++;  // DNC: Unreachable statement
            case 2:
        }

    }

    private static int[] searchForValue(int[][] list, int v) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == v) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}

