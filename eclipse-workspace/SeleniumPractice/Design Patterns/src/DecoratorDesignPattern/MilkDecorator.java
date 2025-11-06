package DecoratorDesignPattern;

public class MilkDecorator extends CoffeeDecorator {

	public MilkDecorator(Coffee coffee) {
		super(coffee);
		
	}
	
	@Override
	public String getdescription() {
		
		return coffee.getdescription()+",Milk";
	}

	@Override
	public double getCost() {
		
		return coffee.getCost()+1.5;
	}

}
