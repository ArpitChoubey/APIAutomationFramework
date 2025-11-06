package FactoryDesignPattern;

public class CarTest {

	public static void main(String[] args) {
		
		
		CarFactory factory = new CarFactory();
		
		Car suvcar = factory.getCar("SUV");
		suvcar.assemble();
		
		Car sedancar = factory.getCar("SEDAN");
		sedancar.assemble();
		
		Car minicar = factory.getCar("SEDAN");
		minicar.assemble();
		
		
		
		
		
	}

}
