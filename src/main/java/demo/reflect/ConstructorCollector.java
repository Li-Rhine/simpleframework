package demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorCollector {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName("demo.reflect.ReflectTarget");
        //1、获取所有的公有的构造方法
        System.out.println("**************** 所有公有的构造方法 *****************");
        Constructor[] conArray = clazz.getConstructors();
        for (Constructor c : conArray) {
            System.out.println(c);
        }

        //2、获取所有的构造方法
        System.out.println("**************** 所有的构造方法（包括：私有、受保护、默认、公有） *****************");
        conArray = clazz.getDeclaredConstructors();
        for (Constructor c : conArray) {
            System.out.println(c);
        }

        //3、获取单个带参数的公有方法
        System.out.println("**************** 获取公有、有两个参数的构造方法 *****************");
        Constructor con = clazz.getConstructor(String.class, int.class);
        System.out.println("con = " + con);

        //4、获取单个私有的构造函数
        System.out.println("**************** 获取私有构造方法 *****************");
        con = clazz.getDeclaredConstructor(int.class);
        System.out.println("con = " + con);
        System.out.println("******************* 调用私有构造方法创建实例 **************");
        //暴力访问(忽略掉访问修饰符)
        con.setAccessible(true);
        ReflectTarget reflectTarget = (ReflectTarget) con.newInstance(1);

    }
}
