package singleton;

/**
 * 懒汉式单例，线程不安全，不推荐
 */
public class S3_LazySingleton {
    private S3_LazySingleton(){}

    private static S3_LazySingleton singleton;

    public static S3_LazySingleton getInstance(){
        if (singleton == null) {
            return new S3_LazySingleton();
        }
        return singleton;
    }
}
