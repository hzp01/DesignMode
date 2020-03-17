package singleton;

/**
 * eager 热心的，饿汉式单例，不推荐
 * 类加载就生成实例，没有延迟加载lazy loading的效果，如果实例一直没用到就会造成内存的浪费
 */
public class S1_EagerSingleton {
    private S1_EagerSingleton(){}

    private final static S1_EagerSingleton singleton = new S1_EagerSingleton();

    public static S1_EagerSingleton getInstance() {
        return singleton;
    }
}
