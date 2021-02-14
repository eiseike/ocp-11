package chapter.xii.Enums;

public class Enums {
    public static void main(String[] args) {

        final var a = 2;

        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER); // SUMMER
        System.out.println(s == Season.SUMMER); // true
        //System.out.println(Season.SUMMER == 2); //DNC:bad operand types for binary operator '=='; first type:  Season, second type: int
        System.out.println(Season.SUMMER.ordinal() == 2); // true
        Season s2 = Season.valueOf("SUMMER"); // SUMMER
        //Season t2 = Season.valueOf("summer"); // Throws IllegalArgumentException: No enum constant Season.summer
        System.out.println("Expected visitors in summer:" + Season.SUMMER.getExpectedVisitors());

        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal() + " " + season.getExpectedVisitors());
            /*
            WINTER 0 Low
            SPRING 1 Medium
            SUMMER 2 High
            FALL 3 Medium
            */
        }

        Season summer = Season.SUMMER;
        switch (summer) {
            case WINTER:
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            //case Season.FALL: //DNC: an enum switch case label must be the unqualified name of an enumeration constant
            //    System.out.println("Rake some leaves!");
            //    break;
            //case 0: //DNC: an enum switch case label must be the unqualified name of an enumeration constant
            //    System.out.println("Get out the sled!");
            //    break;
            default:
                System.out.println("Is it summer yet?");
        }
        // Time for the pool!

        for (Season2 season2 : Season2.values()) {
            System.out.println(season2.name() + " " + season2.ordinal() + " " + season2.getHours());
            /*
            WINTER 0 10am-3pm
            SPRING 1 9am-5pm
            SUMMER 2 9am-7pm
            FALL 3 9am-5pm
            */
        } for (Season3 season3 : Season3.values()) {
            System.out.println(season3.name() + " " + season3.ordinal() + " " + season3.getHours());
            /*
            WINTER 0 10am-3pm
            SUMMER 1 9am-7pm
            SPRING 2 9am-5pm
            FALL 3 9am-5pm
            */
        }

    }
}

//enum BasicOne {
//    SEMICOLON, IS, OPTIONAL
//}
//
//enum BadFlavors {
//    BUT, ONLY, IF, THERE, ARE, NO, HELPERS, AFTER, THE, VALUE, LIST //DNC: ',', '}', or ';' expected
//    static final BadFlavors DEFAULT = BUT;
//}

enum Season {

    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

    private final String expectedVisitors;

    Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }
    //public Season(){} //modifier public not allowed here

    public String getExpectedVisitors() {
        return expectedVisitors;
    }
}

//enum ExtendedSeason extends Season { } //DNC: cannot extend an enum

enum Season2 {
    WINTER {
        public String getHours() { return "10am-3pm"; }
    },
    SPRING {
        public String getHours() { return "9am-5pm"; }
    },
    SUMMER {
        public String getHours() { return "9am-7pm"; }
    },
    FALL {
        public String getHours() { return "9am-5pm"; }
    };
    public abstract String getHours();
}

enum Season3 {
    WINTER {
        public String getHours() { return "10am-3pm"; }
        public void cantTouchThis(){}
    },
    SUMMER {
        public String getHours() { return "9am-7pm"; }
    },
    SPRING, FALL;
    public String getHours() { return "9am-5pm"; }
}