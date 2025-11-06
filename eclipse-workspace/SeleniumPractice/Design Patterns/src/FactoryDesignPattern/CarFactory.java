package FactoryDesignPattern;

public class CarFactory {
	
	public Car getCar(String CarType) {
		
		if(CarType == null) {
			
			return null ;
		}
		
		if(CarType.equalsIgnoreCase("SUV")) {
			return new SUV();
		}
		else if(CarType.equalsIgnoreCase("SEDAN")) {
			return new SEDAN();
		}
		else if(CarType.equalsIgnoreCase("MINI")) {
			return new Mini();
		}
		
		return null;
	}

		
	}


