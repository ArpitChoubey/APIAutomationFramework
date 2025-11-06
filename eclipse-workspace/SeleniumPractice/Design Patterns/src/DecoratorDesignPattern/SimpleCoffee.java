package DecoratorDesignPattern;

public class SimpleCoffee implements Coffee{

	@Override
	public String getdescription() {
		
		return "SimpleCoffee";
	}

	@Override
	public double getCost() {
		
		return 5.0;
	}

}
