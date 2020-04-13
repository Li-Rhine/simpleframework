package demo.reflect;

public class ReflectTarget {
    //------构造函数-----
    //(默认的带参数的构造函数)
    ReflectTarget(String str) {
        System.out.println("(默认)的构造函数 s= " + str);
    }

    //无参构造函数
    public ReflectTarget() {
        System.out.println("调用了公有的无参构造方法。。。");
    }

    //有一个参数的构造函数
    public ReflectTarget(char name) {
        System.out.println("调用了带有一个参数的构造方法，参数值为 " + name);
    }

    //有多个参数的构造函数
    public ReflectTarget(String name, int index) {
        System.out.println("调用了带有多个参数的构造方法，参数值为 【目标名】：" + name + "【序号】" + index);
    }

    //受保护的构造函数
    protected ReflectTarget(boolean n) {
        System.out.println("受保护的构造方法 n:" + n);
    }

    //私有的构造函数
    private ReflectTarget(int index) {
        System.out.println("私有的构造方法 序号:" + index);
    }





    public static void main(String[] args) throws ClassNotFoundException {
        //第一种方式获取Class对象
        ReflectTarget reflectTarget = new ReflectTarget();
        Class reflectTargetClass1 = reflectTarget.getClass();
        System.out.println("1st : " + reflectTargetClass1.getName());

        //第二种方式获取Class对象
        Class reflectTargetClass2 =  ReflectTarget.class;
        System.out.println("2nd : " + reflectTargetClass2.getName());
        //判断第一种方式获取的class对象和第二种方式获取的是否是同一个
        System.out.println(reflectTargetClass1 == reflectTargetClass2);

        //第三种方式来获取Class对象
        Class reflectTargetClass3 = Class.forName("demo.reflect.ReflectTarget");
        System.out.println("3rd : " + reflectTargetClass3.getName());
        System.out.println(reflectTargetClass2 == reflectTargetClass3);
    }
}
