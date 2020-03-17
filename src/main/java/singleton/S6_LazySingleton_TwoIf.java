package singleton;

/**
 * 懒汉式单例，线程不安全，推荐使用
 */
public class S6_LazySingleton_TwoIf {
    private S6_LazySingleton_TwoIf(){}

    private static volatile S6_LazySingleton_TwoIf singleton;

    public static S6_LazySingleton_TwoIf getInstance(){
        if (singleton == null) {
            synchronized (S6_LazySingleton_TwoIf.class) {
                if (singleton == null) {
                    return new S6_LazySingleton_TwoIf();
                }
            }
        }
        return singleton;
    }
}
