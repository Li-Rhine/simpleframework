package demo.pattern.factory.entity;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/4/11 1:59
 **/
public class DellMouse implements Mouse {
    @Override
    public void sayHi() {
        System.out.println("我是戴尔鼠标");
    }
}
