package DecoratorDesignPattern;

public class CreamCoffee extends CoffeeDecorator {

	public CreamCoffee(Coffee coffee) {
		super(coffee);
		
	}
	
	@Override
	public String getdescription() {
		
		return coffee.getdescription()+", Cream";
	}

	@Override
	public double getCost() {
		
		return coffee.getCost()+ 5;
	}

}
