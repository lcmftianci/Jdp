package decoratorPattern;

public class Espreeo extends Beverge {
	
	public Espreeo() {
		// TODO Auto-generated constructor stub
		description = "Espresso";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
