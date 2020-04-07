package demo.generic;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/4/7 22:53
 **/
public interface GenericIFactory<T,N> {
    T nextObject();
    N nextNumber();
}
