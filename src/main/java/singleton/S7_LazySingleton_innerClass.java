package singleton;

/**
 * 懒汉式单例，推荐使用
 * 静态内部类在类装载时并不会初始化，只有在被调用时才会被装载，从而完成单例类的初始化
 */
public class S7_LazySingleton_innerClass {
    private S7_LazySingleton_innerClass(){}

    public static S7_LazySingleton_innerClass getInstance(){
        return SingletonInstance.singleton;
    }

    private static class SingletonInstance{
        private final static  S7_LazySingleton_innerClass singleton = new S7_LazySingleton_innerClass();
    }
}
