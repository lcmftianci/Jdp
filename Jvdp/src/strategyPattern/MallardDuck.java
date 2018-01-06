package strategyPattern;

import jsrlog.JsrLog;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		JsrLog.logout("I m a real Mallard duck\n");
	}

}
