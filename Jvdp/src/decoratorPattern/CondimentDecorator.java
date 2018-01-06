package decoratorPattern;

/*装饰者抽象类*/

public abstract class CondimentDecorator extends Beverge {
	
	public abstract String getDescription();
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
