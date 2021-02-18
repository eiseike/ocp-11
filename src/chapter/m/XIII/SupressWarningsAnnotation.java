package chapter.m.XIII;

import java.util.ArrayList;
import java.util.List;

public class SupressWarningsAnnotation {
    public static void main(String[] args) {
    }
}

class SongBird {
    @Deprecated static void sing(int volume) {}
    static Object chirp(List<String> data) { return data.size(); }
}

class Nightingale {
    @SuppressWarnings("deprecation")
    public void wakeUp() {
        SongBird.sing(10);
    }

    @SuppressWarnings("unchecked")
    public void goToBed() {
        SongBird.chirp(new ArrayList());
    }
    public static void main(String[] args) {
        var birdy = new Nightingale();
        birdy.wakeUp();
        birdy.goToBed();
    }
}