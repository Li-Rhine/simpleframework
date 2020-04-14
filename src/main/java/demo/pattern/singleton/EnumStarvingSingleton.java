package demo.pattern.singleton;

/**
 * 单例-枚举类型  防止反射攻击和序列化攻击
 */
public class EnumStarvingSingleton {

    private EnumStarvingSingleton() {
    }

    public static EnumStarvingSingleton getInstance() {
        return ContainerHolder.HOLDER.instance;
    }

    private enum ContainerHolder {
        HOLDER;
        private EnumStarvingSingleton instance;

        private ContainerHolder() {
            instance = new EnumStarvingSingleton();
        }
    }
}
