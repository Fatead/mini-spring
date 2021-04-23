package org.springframework.beans.factory.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * 允许自定义修改BeanDefinition的属性值
 * BeanFactoryPostProcessor是spring提供的容器扩展机制，允许我们在bean实例化之前修改bean的定义信息即BeanDefinition信息，
 * 重要的实现类有PropertyPlaceholderConfigurer 和 CustomEditorConfigurer
 * PropertyPlaceholderConfigurer的作用是用Properties文件的配置值替换xml文件中的占位符，
 * CustomEditorConfigurer的作用是实现类型转换。
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface BeanFactoryPostProcessor {

	/**
	 * 在所有BeanDefinition加载完成后，但在bean实例化之前，提供修改BeanDefinition属性值的机制
	 *
	 * @param beanFactory
	 * @throws BeansException
	 */
	void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
