package demo.pattern.eventmode;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/4/26 23:12
 **/
public class EventModeDemo {
    public static void main(String[] args) {
        EventSource eventSource = new EventSource();
        SingleClickEventListener singleClickEventListener = new SingleClickEventListener();
        DoubleClickEventListener doubleClickEventListener = new DoubleClickEventListener();

        Event event = new Event();
        event.setType("doubleclick");
        eventSource.register(singleClickEventListener);
        eventSource.register(doubleClickEventListener);
        eventSource.publishEvent(event);
    }
}
