package demo.pattern.factory.simple;

import demo.pattern.factory.entity.DellMouse;
import demo.pattern.factory.entity.HpMouse;
import demo.pattern.factory.entity.LenovoMouse;
import demo.pattern.factory.entity.Mouse;
import org.jcp.xml.dsig.internal.MacOutputStream;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/4/11 2:00
 **/
public class MouseFactory {
    public static Mouse creatMouse(int type) {
        switch (type) {
            case 0: return new DellMouse();
            case 1: return new HpMouse();
            case 2: return new LenovoMouse();
            default: return new DellMouse();
        }
    }

    public static void main(String[] args) {
        Mouse mouse = MouseFactory.creatMouse(1);
        mouse.sayHi();

    }
}
