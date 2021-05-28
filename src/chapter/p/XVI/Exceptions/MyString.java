package chapter.p.XVI.Exceptions;

class MyString implements AutoCloseable {
    private String s;

    public MyString(String s) {
        this.s = s;
        System.out.println("OPENING: " + s);
    }

    @Override
    public void close() throws Exception {
        System.out.println("CLOSING: " + s);
    }

    @Override
    public String toString() {
        return "MyString{" +
                "s='" + s + '\'' +
                '}';
    }
}
