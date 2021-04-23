package org.springframework.beans.factory.config;

import org.springframework.beans.PropertyValues;

import java.util.Objects;

/**
 * BeanDefinition实例保存bean的信息，包括class类型、方法构造参数、bean属性、bean的scope等，此处简化只包含class类型和bean属性
 * 每个Bean对应一个BeanDefinition
 *
 * 作用域限定了Spring Bean的作用范围，如果希望IOC容器每次返回的Bean是同一个实例的时候，可以设置scope为singleton，
 * 如果希望IOC容器每次返回的实例是一个新的实例时，可以设置作用域为scope。
 * 作用域有五种：
 * 1.singleton
 * 2.prototype
 * 3.request:该属性仅对HTTP请求产生作用，使用该属性定义Bean时，每次HTTP请求都会创建一个新的Bean,适用于WebApplicationContext环境
 * 4.session:该属性仅用于HTTP Session, 同一个Session共享一个Bean实例，不同的Session使用不同的实例
 * 5.global-session:该属性仅用于HTTP Session,所有的Session共享一个Bean实例
 */
public class BeanDefinition {
	//Bean的作用域为单例模式
	public static String SCOPE_SINGLETON = "singleton";
	//Bean的作用域为原型模式
	public static String SCOPE_PROTOTYPE = "prototype";

	private Class beanClass;

	private PropertyValues propertyValues;

	private String initMethodName;

	private String destroyMethodName;

	private String scope = SCOPE_SINGLETON;

	private boolean singleton = true;

	private boolean prototype = false;

	public BeanDefinition(Class beanClass) {
		this(beanClass, null);
	}

	public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
		this.beanClass = beanClass;
		this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
	}

	public void setScope(String scope) {
		this.scope = scope;
		this.singleton = SCOPE_SINGLETON.equals(scope);
		this.prototype = SCOPE_PROTOTYPE.equals(scope);
	}

	public boolean isSingleton() {
		return this.singleton;
	}

	public boolean isPrototype() {
		return this.prototype;
	}

	public Class getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(Class beanClass) {
		this.beanClass = beanClass;
	}

	public PropertyValues getPropertyValues() {
		return propertyValues;
	}

	public void setPropertyValues(PropertyValues propertyValues) {
		this.propertyValues = propertyValues;
	}

	public String getInitMethodName() {
		return initMethodName;
	}

	public void setInitMethodName(String initMethodName) {
		this.initMethodName = initMethodName;
	}

	public String getDestroyMethodName() {
		return destroyMethodName;
	}

	public void setDestroyMethodName(String destroyMethodName) {
		this.destroyMethodName = destroyMethodName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		BeanDefinition that = (BeanDefinition) o;
		return beanClass.equals(that.beanClass);
	}

	@Override
	public int hashCode() {
		return Objects.hash(beanClass);
	}
}
