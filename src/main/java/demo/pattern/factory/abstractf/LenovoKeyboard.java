package demo.pattern.factory.abstractf;

import demo.pattern.factory.entity.Keyboard;

public class LenovoKeyboard implements Keyboard {
    @Override
    public void sayHello() {
        System.out.println("我是联想键盘");
    }
}
