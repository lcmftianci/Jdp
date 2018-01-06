package strategyPattern;

import jsrlog.JsrLog;

public class Quack implements QuackBehavior {

	public void quack() {
		// TODO Auto-generated method stub
		JsrLog.logout("Quack\n");
	}

}
