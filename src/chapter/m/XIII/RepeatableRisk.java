package chapter.m.XIII;

import java.lang.annotation.Repeatable;

class Zoo {
    public static class Monkey {
    }

    @Risk(danger = "Not risky at all", level = -10)
    @Risk(danger = "Silly", level = 0)
    @Risk(danger = "Aggressive", level = 5)
    @Risk(danger = "Violent", level = 10)
    private Monkey monkey;
}

@Repeatable(Risks.class)
@interface Risk {
    String danger();
    int level();
}

@interface Risks {
    Risk[] value();
}

