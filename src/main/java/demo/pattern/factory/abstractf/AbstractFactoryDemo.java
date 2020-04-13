package demo.pattern.factory.abstractf;

import demo.pattern.factory.entity.Keyboard;
import demo.pattern.factory.entity.Mouse;

import javax.security.auth.kerberos.KerberosTicket;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        ComputerFactory cf = new HpComputerFactory();
        Mouse mouse = cf.createMouse();
        Keyboard keyboard  =cf.createKeyboard();
        mouse.sayHi();
        keyboard.sayHello();
    }
}
