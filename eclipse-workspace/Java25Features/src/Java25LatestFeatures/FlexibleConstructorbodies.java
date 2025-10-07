package Java25LatestFeatures;

public class FlexibleConstructorbodies extends YoungCons{
	
	FlexibleConstructorbodies(){
		
		IO.println("child class constructor : FlexibleConstructorbodies constructor");
		super();
	}
	
	void main() {
		new FlexibleConstructorbodies();
	}
           
}
