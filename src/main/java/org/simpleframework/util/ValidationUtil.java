package org.simpleframework.util;

import java.util.Collection;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/4/15 1:37
 **/
public class ValidationUtil {

    /**
     * String是否为null或""
     * @param obj
     * @return 是否为空
     */
    public static boolean isEmpty(String obj) {
        return (obj == null || "".equals(obj));
    }


    /**
     * Array是否为null或者size为0
     * @param obj
     * @return 是否为空
     */
    public static boolean isEmpty(Object[] obj) {
        return (obj == null || obj.length == 0);
    }




    /**
     * Collection是否为null或size为0
     * @param obj Collection
     * @return 是否为空
     */
    public static boolean isEmpty(Collection<?> obj) {
        return obj == null || obj.isEmpty();
    }
}
