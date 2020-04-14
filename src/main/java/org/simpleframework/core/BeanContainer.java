package org.simpleframework.core;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.simpleframework.core.annotation.Component;
import org.simpleframework.core.annotation.Controller;
import org.simpleframework.core.annotation.Repository;
import org.simpleframework.core.annotation.Service;
import org.simpleframework.util.ClassUtil;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/4/14 23:07
 **/

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BeanContainer {
    /**
     * 存放所有被配置标记的目标对象的Map
     */
    private final Map<Class<?>, Object> beanMap = new ConcurrentHashMap<>();

    /**
     * 加载bean的注解列表
     */
    private static final List<Class<? extends Annotation>> BEAN_ANNOTATION = Arrays.asList(Component.class,
            Controller.class, Service.class, Repository.class);


    /**
     * 获取Bean容器实例
     * @return BeanContainer
     */
    private static BeanContainer getInstance() {
        return ContainerHolder.HOLDER.instance;
    }

    private enum ContainerHolder {
        HOLDER;
        private BeanContainer instance;

        private ContainerHolder() {
            instance = new BeanContainer();
        }

    }

    /**
     * 扫描加载所有的Bean
     * @param packageName 包名
     */
    public void loadBeans(String packageName) {
        Set<Class<?>> classSet = ClassUtil.exactPackageClass(packageName);
        if (classSet == null || classSet.isEmpty()) {
            log.warn("extract nothing from packageName" + packageName);
            return;
        }
        for (Class clazz: classSet) {
            for (Class<? extends Annotation> annotation:BEAN_ANNOTATION) {
                //如果类上面标记了定义的注解
                if (clazz.isAnnotationPresent(annotation)) {
                    //将目标类本身作为键，目标类的实例作为值，放入到beanMap中
                    beanMap.put(clazz, ClassUtil.newInstance(clazz, true));
                }
            }
        }
    }
}