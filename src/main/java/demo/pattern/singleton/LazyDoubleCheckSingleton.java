package demo.pattern.singleton;

/**
 * 单例-双重检查锁
 * 饿汉、双重检查都无法解决 反射攻击，只有枚举可以
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {

        //第一次检测
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    //memory = allocate(); //1、分配对象内存空间
                    //instance(memory)     //2、初始化对象
                    //instance = memory;   //3、设置instance指向刚分配的内存地址，此时instance ！= null
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }

        return instance;
    }
}
