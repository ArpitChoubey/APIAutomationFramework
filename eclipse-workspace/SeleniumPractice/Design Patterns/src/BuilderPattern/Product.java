package BuilderPattern;

public class Product {
	
	private String name;
	private double price;
	
	private String description;
	private String category;
	private double discount;
	private boolean freeshipping;
	private int stock;
	
	
	private Product(ProductBuilder builder) {
	
		this.name = builder.name;
		this.price = builder.price;
		this.description = builder.description;
		this.category = builder.category;
		this.discount = builder.discount;
		this.freeshipping = builder.freeshipping;
		this.stock = builder.stock;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public boolean isFreeshipping() {
		return freeshipping;
	}


	public void setFreeshipping(boolean freeshipping) {
		this.freeshipping = freeshipping;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", description=" + description + ", category=" + category
				+ ", discount=" + discount + ", freeshipping=" + freeshipping + ", stock=" + stock + "]";
	}
	
	public static class ProductBuilder{
		private String name;
		private double price;
		
		private String description;
		private String category;
		private double discount;
		private boolean freeshipping;
		private int stock;
		
		
		ProductBuilder(String name, double price) {
			super();
			this.name = name;
			this.price = price;
		}

		public ProductBuilder setDescription(String description) {
			this.description = description;
			return this;
		}

		public ProductBuilder setCategory(String category) {
			this.category = category;
			return this;
		}

		public ProductBuilder setDiscount(double discount) {
			this.discount = discount;
			return this;
		}

		public ProductBuilder setFreeshipping(boolean freeshipping) {
			this.freeshipping = freeshipping;
			return this;
		}

		public ProductBuilder setStock(int stock) {
			this.stock = stock;
			return this;
		}
		
		
		public Product build() {
			return new Product(this);
		}
		
	}
	
	

}
