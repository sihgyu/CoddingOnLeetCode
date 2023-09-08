package dataStructure.singleton;

public class Singleton {
    private Singleton() {
    }

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (null != instance) {
            return instance;
        }
        synchronized (Singleton.class) {
            if (null == instance) {
                instance = new Singleton();
            }
        }
        return instance;
    }


}

