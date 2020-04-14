package demo.pattern.singleton;

/**
 * 单例-饿汉模式
 */
public class StarvingSingleton {

    private static final StarvingSingleton starvingSingleton = new StarvingSingleton();
    //私有构造函数
    private StarvingSingleton() {

    }
    public static StarvingSingleton getInstance() {
        return starvingSingleton;
    }


}
