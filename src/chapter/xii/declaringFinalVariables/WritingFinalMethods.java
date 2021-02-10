package chapter.xii.declaringFinalVariables;

public class WritingFinalMethods {
}

abstract class AbstractC {
    abstract void chew();
}

class SuperC extends AbstractC {
    final void chew() {}
}

class SubC extends SuperC {
    //void chew() {} //DNC: chew() in SubC cannot override chew() in SuperC; overridden method is final
}
