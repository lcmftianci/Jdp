package decoratorPattern;

public class Mocha extends CondimentDecorator {
	
	Beverge beverge;

	public Mocha(Beverge beverge){
		this.beverge = beverge;	
	}
	
	public double cost() {
		return 0.20 + beverge.cost();
	}
	
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverge.getDescription() + ", Mocha";
	}

}
