package demo.pattern.eventmode;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/4/26 23:06
 **/
public class DoubleClickEventListener implements EventListener {
    @Override
    public void processEvent(Event event) {
        if ("doubleclick".equals(event.getType())) {
            System.out.println("双击被触发");
        }
    }
}
