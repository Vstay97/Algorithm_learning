package hello.oop.demo11.abstract_;

/**
 * @Author: Vstay
 * @Date: 2022/1/12 14:00
 */
public abstract class Action {
	/**
	 * abstract:抽象方法, 只有方法的名字, 没有方法的实现!
	 *      是一个约束, 有人帮我们实现
	 */
	public abstract void doSomething();
	/*
	1. 不能new这个抽象类, 只能靠子类去实现它 ->>> `约束`
	2. 抽象类中可以写普通的方法
	3. 抽象方法必须在抽象类中
	*/
	
}
