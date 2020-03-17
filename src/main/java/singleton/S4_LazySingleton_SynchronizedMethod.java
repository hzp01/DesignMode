package singleton;

/**
 * 懒汉式单例，多线程调用方法线程阻塞，效率低，不推荐
 */
public class S4_LazySingleton_SynchronizedMethod {
    private S4_LazySingleton_SynchronizedMethod(){}

    private static S4_LazySingleton_SynchronizedMethod singleton;

    public static synchronized S4_LazySingleton_SynchronizedMethod getInstance(){
        if (singleton == null) {
            return new S4_LazySingleton_SynchronizedMethod();
        }
        return singleton;
    }
}
