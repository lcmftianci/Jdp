package decoratorPattern;

/*
 * 装饰着模式：动态的将责任附加到对象上，若要拓展功能，装饰者提供了比继承更有弹性的替代方案
 * */

public abstract class Beverge {
	String description = "Unknow Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
