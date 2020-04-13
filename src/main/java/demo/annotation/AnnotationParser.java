package demo.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/4/14 0:48
 **/
public class AnnotationParser {
    //解析类的注解
    public static void parseTypeAnnotation() throws ClassNotFoundException {
        Class clazz = Class.forName("demo.annotation.ImoocCourse");
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            CourseInfoAnnotation courseInfoAnnotation = (CourseInfoAnnotation) annotation;
            System.out.println("课程名：" + courseInfoAnnotation.courseName() + "\n" +
                    "课程标签：" + courseInfoAnnotation.courseTag() + "\n" +
                    "课程简介：" + courseInfoAnnotation.courseProfile() + "\n" +
                    "课程序号：" + courseInfoAnnotation.courseIndex());
        }
    }

    //解析成员变量上的标签
    public static void parseFieldAnnotation() throws ClassNotFoundException {
        Class clazz = Class.forName("demo.annotation.ImoocCourse");
        Field[] fields = clazz.getDeclaredFields();
        for (Field f: fields) {
            //判断成员变量中是否有指定注解类型的注解
            boolean hasAnnotation = f.isAnnotationPresent(PersonInfoAnnotation.class);
            if (hasAnnotation) {
                PersonInfoAnnotation personInfoAnnotation = f.getAnnotation(PersonInfoAnnotation.class);
                System.out.println("课程名：" + personInfoAnnotation.name() + "\n" +
                        "课程标签：" + personInfoAnnotation.age() + "\n" +
                        "课程简介：" + personInfoAnnotation.gender());
                for (String language: personInfoAnnotation.language()) {
                    System.out.println("课程语言：" + language);
                }
            }
        }
    }

    //解析方法注解
    public static void parseMethodAnnotation() throws ClassNotFoundException {
        Class clazz = Class.forName("demo.annotation.ImoocCourse");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method: methods) {
            //判断方法中是否有指定注解类型的注解
            boolean hasAnnotation = method.isAnnotationPresent(CourseInfoAnnotation.class);
            if (hasAnnotation) {
                CourseInfoAnnotation courseInfoAnnotation = method.getAnnotation(CourseInfoAnnotation.class);
                System.out.println("课程名：" + courseInfoAnnotation.courseName() + "\n" +
                        "课程标签：" + courseInfoAnnotation.courseTag() + "\n" +
                        "课程简介：" + courseInfoAnnotation.courseProfile() + "\n" +
                        "课程序号：" + courseInfoAnnotation.courseIndex());
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        parseTypeAnnotation();
//        parseFieldAnnotation();
        parseMethodAnnotation();
    }

}
