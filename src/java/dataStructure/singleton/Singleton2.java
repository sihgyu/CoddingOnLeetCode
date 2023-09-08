package dataStructure.singleton;

public class Singleton2 {
    private static class SingletonHolder {
        static final Singleton2 singleton = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.singleton;
    }
}
