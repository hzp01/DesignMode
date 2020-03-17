package singleton;

/**
 * eager 热心的，饿汉式单例，不推荐
 * 类加载就生成实例，没有延迟加载lazy loading的效果，如果实例一直没用到就会造成内存的浪费
 */
public class S2_EagerSingleton_staticCode {
    private S2_EagerSingleton_staticCode() {
    }

    private static S2_EagerSingleton_staticCode singleton;

    static {
        singleton = new S2_EagerSingleton_staticCode();
    }

    public static S2_EagerSingleton_staticCode getInstance() {
        return singleton;
    }
}
