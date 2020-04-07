package demo.generic;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/4/8 1:17
 **/
public class GenericFactoryImpl<T, N> implements GenericIFactory<T, N> {
    @Override
    public T nextObject() {
        return null;
    }

    @Override
    public N nextNumber() {
        return null;
    }
}
