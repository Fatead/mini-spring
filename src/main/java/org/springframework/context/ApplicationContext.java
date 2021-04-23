package org.springframework.context;

import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.core.io.ResourceLoader;

/**
 * 应用上下文
 * ApplicationContext除了拥有BeanFactory的所有功能外，还支持特殊类型的bean,
 * 例如BeanFactoryPostProcessor和BeanPostProcessor的自动识别、资源加载、
 * 容器事件和监听器、国际化支持、单例Bean自动初始化等。
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {

}
