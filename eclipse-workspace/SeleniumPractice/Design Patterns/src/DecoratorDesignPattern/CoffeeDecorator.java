package DecoratorDesignPattern;

public class CoffeeDecorator implements Coffee {
	
	protected Coffee coffee;
	
	public CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
		
	}

	@Override
	public String getdescription() {
		
		return coffee.getdescription();
	}

	@Override
	public double getCost() {
		
		return coffee.getCost();
	}

}
