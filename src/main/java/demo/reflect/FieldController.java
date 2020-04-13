package demo.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FieldController {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class reflectTargetClass = Class.forName("demo.reflect.ReflectTarget");

        //1、获取所有的公有字段
        System.out.println("************ 获取所有公有的字段 ***************");
        Field[] fieldArray = reflectTargetClass.getFields();
        for (Field f: fieldArray) {
            System.out.println(f);
        }

        //2、获取所有的字段
        System.out.println("************ 获取所有的字段（包括私有、受保护、默认的） ***************");
        fieldArray = reflectTargetClass.getDeclaredFields();
        for (Field f: fieldArray) {
            System.out.println(f);
        }

        //3、获取单个特定公有的字段
        System.out.println("************ 获取公有的字段并调用 ***************");
        Field f = reflectTargetClass.getField("name");
        System.out.println("公有的field name:" + f);
        ReflectTarget reflectTarget = (ReflectTarget) reflectTargetClass.getConstructor().newInstance();

        //4、给获取到的field赋值
        f.set(reflectTarget, "待反射一号");
        //5、验证对应的值name
        System.out.println("验证name: " + reflectTarget.name);
        //6、获取单个私有的Field
        System.out.println("************ 获取私有字段 targetInfo 并调用 ***************");
        f = reflectTargetClass.getDeclaredField("targetInfo");
        System.out.println(f);
        f.setAccessible(true);
        f.set(reflectTarget, "13810592345");
        System.out.println("验证消息" + reflectTarget);
    }
}
