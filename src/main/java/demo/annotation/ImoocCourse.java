package demo.annotation;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/4/14 0:17
 **/
@CourseInfoAnnotation(courseName = "剑指java面试", courseTag = "面试",
        courseProfile = "课程想抓住这两个痛点，在自研框架和Spring框架的穿插讲解中让大家逐渐熟悉Spring框架的脉络")
public class ImoocCourse {

    @PersonInfoAnnotation(name = "翔仔", language = {"java", "C++", "Go", "Python"})
    private String author;

    @CourseInfoAnnotation(courseName = "校园商铺", courseTag = "实战",
            courseProfile = "手把手教会开发", courseIndex = 144)
    public void getCourseInfo() {

    }
}
