package demo.pattern.eventmode;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/4/26 23:06
 **/
public class SingleClickEventListener implements EventListener {
    @Override
    public void processEvent(Event event) {
        if ("singleclick".equals(event.getType())) {
            System.out.println("单击被触发");
        }
    }
}
