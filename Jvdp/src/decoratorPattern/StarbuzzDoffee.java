package decoratorPattern;

import jsrlog.JsrLog;

/*
 * ������ ��װ����ģʽ��
 * */

public class StarbuzzDoffee {
	public static void main(String[] args) {
		Beverge beverge = new Espreeo();
		JsrLog.logout(beverge.getDescription() + "$" + beverge.cost());
		
		//Beverge beverge2 = new DarkRoast();
		
		
	}	
}
