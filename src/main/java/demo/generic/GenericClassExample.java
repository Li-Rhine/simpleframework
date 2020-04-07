package demo.generic;

import lombok.Data;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/4/3 23:40
 **/
@Data
public class GenericClassExample<T> {
    //member这个成员变量的类型为T, T的类型由外部指定
    private T member;
    public GenericClassExample(T member) {
        this.member = member;
    }

    public T handleSomething(T target) {
        return target;
    }

    public String sayHello(String name) {
        return "Hello" + name;
    }

    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.printf("%s", element);
            System.out.printf(" ");
        }
        System.out.println();
    }

}
