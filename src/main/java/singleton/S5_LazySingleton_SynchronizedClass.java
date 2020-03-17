package singleton;

/**
 * 懒汉式单例，线程不安全，不推荐
 */
public class S5_LazySingleton_SynchronizedClass {
    private S5_LazySingleton_SynchronizedClass(){}

    private static S5_LazySingleton_SynchronizedClass singleton;

    public static S5_LazySingleton_SynchronizedClass getInstance(){
        if (singleton == null) {
            synchronized (S5_LazySingleton_SynchronizedClass.class) {
                return new S5_LazySingleton_SynchronizedClass();
            }
        }
        return singleton;
    }
}
