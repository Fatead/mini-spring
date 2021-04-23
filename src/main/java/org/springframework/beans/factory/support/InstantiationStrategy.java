package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

/**
 * Bean的实例化策略，有两个实现类
 * 1.SimpleInstantiationStrategy，使用Bean的构造函数来实例化
 * 2.CglibSubclassingInstantiationStrategy，使用CGLIB动态生成子类
 *
 * @author derekyi
 * @date 2020/11/23
 */
public interface InstantiationStrategy {

	Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
