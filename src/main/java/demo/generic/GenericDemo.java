package demo.generic;


import jdk.internal.org.objectweb.asm.tree.LineNumberNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/4/3 23:36
 **/
public class GenericDemo {
    public static void handleMember(GenericClassExample<? extends Number> integerGenericClassExample) {
        Integer result = 111 + (Integer) integerGenericClassExample.getMember();
        System.out.println("result is " + result);
    }

    public static void main(String[] args) {
        GenericClassExample<String> stringExample = new GenericClassExample<>("abc");
        GenericClassExample<Number> integerExample = new GenericClassExample<>(123);

//        System.out.println(stringExample.getMember().getClass());
//        System.out.println(integerExample.getMember().getClass());
//        System.out.println(integerExample.sayHello("haha"));

        System.out.println(stringExample.getClass());
        System.out.println(integerExample.getClass());
        handleMember(integerExample);
    }
}
