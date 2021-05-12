package not.canon.testbench;

interface Walk {
    public default int getSpeed() { return 5; }
}

interface Run {
    public default int getSpeed() { return 10; }
}

public class Cat implements Walk, Run {  // DOES NOT COMPILE
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
        System.out.println(new Cat().getWalkSpeed());
        System.out.println(new Cat().getRunSpeed());

    }
    public int getSpeed() {
        return 1;
    }
    public int getWalkSpeed() {
        return new Walk(){}.getSpeed();
    }
    public int getRunSpeed() {
        return Run.super.getSpeed();
    }
}

interface Schedule {
    default void wakeUp()        { checkTime(7);  }
    default void haveBreakfast() { checkTime(9);  }
    default void haveLunch()     { checkTime(12); }
    default void workOut()       { checkTime(18); }
    private void checkTime(int hour) {
        if (hour> 17) {
            System.out.println("You're late!");
        } else {
            System.out.println("You have "+(17-hour)+" hours left "
                    + "to make the appointment");
        }
    }
}

interface Swim {
    private static void breathe(String type) {
        System.out.println("Inhale");
        System.out.println("Performing stroke: " + type);
        System.out.println("Exhale");
    }
    static void butterfly()        { breathe("butterfly");  }
    public static void freestyle() { breathe("freestyle");  }
    default void backstroke()      { breathe("backstroke"); }
    private void breaststroke()    { breathe("breaststroke"); }
}
