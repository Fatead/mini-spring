package org.springframework.aop;


/**
 * 切点抽象
 * 切入点
 * 类比：连接点相当于数据库中的记录，切点相当于查询条件。
 * 一般一个切点匹配多个连接点。
 */
public interface Pointcut {

	ClassFilter getClassFilter();

	MethodMatcher getMethodMatcher();
}
