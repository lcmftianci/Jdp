package strategyPattern;
import jsrlog.JsrLog;

/*
 * 策略模式，有一个比是一个更好
 * 特点：
 * 主体与行为分开
 * 多组合少继承
 * 说明：
 * 策略模式定义了算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户
 * */

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {
		// TODO Auto-generated constructor stub
	}

	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuacl() {
		quackBehavior.quack();
	}
	
	public void swim() {
		JsrLog.logout("All ducks float,  Event decoys!\n");
	}
	
	//动态设定主体行为
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
}
