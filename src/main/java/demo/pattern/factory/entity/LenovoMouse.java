package demo.pattern.factory.entity;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/4/11 2:06
 **/
public class LenovoMouse implements Mouse {
    @Override
    public void sayHi() {
        System.out.println("我是联想鼠标");
    }
}
