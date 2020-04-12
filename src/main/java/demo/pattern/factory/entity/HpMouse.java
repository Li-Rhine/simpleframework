package demo.pattern.factory.entity;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/4/11 2:00
 **/
public class HpMouse implements Mouse{
    @Override
    public void sayHi() {
        System.out.println("我是惠普鼠标");
    }
}
