package strategyPattern;

import jsrlog.JsrLog;

public class ModelDuck extends Duck {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		JsrLog.logout("I m model duck = %d\n", 1000);
	}
	
	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

}
