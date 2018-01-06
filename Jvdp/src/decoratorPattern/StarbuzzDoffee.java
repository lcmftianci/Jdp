package decoratorPattern;

import jsrlog.JsrLog;

/*
 * 测试类 （装饰者模式）
 * */

public class StarbuzzDoffee {
	public static void main(String[] args) {
		Beverge beverge = new Espreeo();
		JsrLog.logout(beverge.getDescription() + "$" + beverge.cost());
		
		//Beverge beverge2 = new DarkRoast();
		
		
	}	
}
