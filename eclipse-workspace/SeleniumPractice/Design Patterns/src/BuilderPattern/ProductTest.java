package BuilderPattern;

public class ProductTest {

	public static void main(String[] args) {
		
		
		Product prod1 = new Product.ProductBuilder("Apple Macbook Pro",1000).build();
		System.out.println(prod1);
		System.out.println(prod1.getCategory());
		
		
		Product prod2 = new Product.ProductBuilder("Samsung Monitor",800)
				        .setCategory("Electronics")
				       .setDescription("This is 18 inch ")
				       .setDiscount(10)
				       .setFreeshipping(false)
				       .setStock(3)
				       .build();
		
		System.out.println(prod2);
		
		prod2.setDiscount(18);
		prod2.setStock(54);
		
		System.out.println(prod2);
	}

}
