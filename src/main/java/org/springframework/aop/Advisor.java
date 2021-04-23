package org.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * 使用AOP的目的就是在不改变源码的前提下，往一个方法的前后插入一个代码块
 * Advisor（增强器/顾问）
 * Aspect切面，泛指交叉业务逻辑，类级别，包含了同一类型业务的不同增强方法。比如事务处理和日志处理可以理解为两个切面
 * Advice 通知，实际上是对主业务逻辑的一种增强。
 * Weaving：织入，把切面连接到其他的应用程序或者对象上，并创建一个被通知（advised）的对象。
 * 织入可以在编译时（例如使用AspectJ编译器）、类加载时和运行时完成。
 * 织入是指将切面代码插入到目标对象的过程，代理的invoke方法完成的工作，可以称为织入。
 * Spring在运行时完成织入
 * 连接点（JoinPoint） 由方法和相对点确定。
 *
 */
public interface Advisor {

	Advice getAdvice();

}
