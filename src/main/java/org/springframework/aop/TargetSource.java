package org.springframework.aop;

/**
 * 被代理的目标对象
 * Target 目标对象，指将要被增强的对象，即包含主业务逻辑类的对象
 * @author derekyi
 * @date 2020/12/6
 */
public class TargetSource {

	private final Object target;

	public TargetSource(Object target) {
		this.target = target;
	}

	public Class<?>[] getTargetClass() {
		return this.target.getClass().getInterfaces();
	}

	public Object getTarget() {
		return this.target;
	}

}
