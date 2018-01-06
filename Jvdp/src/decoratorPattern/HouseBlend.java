package decoratorPattern;

public class HouseBlend extends Beverge {
	
	public HouseBlend() {
		// TODO Auto-generated constructor stub
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.89f;
	}

}
