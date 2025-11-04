package Java8Features;

public class LambdaDeclare {

	public static void main(String[] args) {
		
		WebPage w1 = new WebPage() {
			
			@Override
			public void header(String value) {
				System.out.println("hii " +value);
			}
		};
		WebPage w5 = (value)-> 
			System.out.println("hii " +value);

		
WebPage w2 = new WebPage() {
			
			@Override
			public void header(String value) {
				System.out.println(value.toLowerCase());
			}
		};
		
		WebPage w4 = (value)->System.out.println(value.toLowerCase());
		
WebPage w3 = new WebPage() {
			
			@Override
			public void header(String value) {
				System.out.println(value.toUpperCase());
			}
		};
		WebPage w6 = (value) -> System.out.println(value.toUpperCase());
		
		w1.header("Google");
		w2.header("Laxman");
		w3.header("Ram");
		w4.header("ARPIT");
		w5.header("Uncle");
		w6.header("arpit");
	}
}
			
	


	