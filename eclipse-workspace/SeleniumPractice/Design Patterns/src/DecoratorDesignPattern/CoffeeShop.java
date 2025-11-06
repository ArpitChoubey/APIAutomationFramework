package DecoratorDesignPattern;

public class CoffeeShop {

	public static void main(String[] args) {
		
		
		Coffee myCoffee = new SimpleCoffee();
		
		System.out.println(myCoffee.getdescription() +"$" +myCoffee.getCost() );
		
		myCoffee = new MilkDecorator(myCoffee);
		
		System.out.println(myCoffee.getdescription() +"$" +myCoffee.getCost());
		
       myCoffee = new SugarDecorator(myCoffee);
		
		System.out.println(myCoffee.getdescription() +"$" +myCoffee.getCost());

            myCoffee = new CreamDecorator();
		
		System.out.println(myCoffee.getdescription() +"$" +myCoffee.getCost());
		
		
		System.out.println("Final Cost :"+myCoffee.getCost());

	}

}
