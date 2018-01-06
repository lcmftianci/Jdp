package strategyPattern;
import jsrlog.JsrLog;

/*
 * 策略模式，有一个比是一个更好
 * 主体与行为分开
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
