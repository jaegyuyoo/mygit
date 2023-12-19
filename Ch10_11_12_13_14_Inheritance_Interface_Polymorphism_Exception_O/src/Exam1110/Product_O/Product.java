package Exam1110.Product_O;

public class Product {

	private String name; // 이름
	private double price; // 가격

	public Product() {
		super();
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
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
	
	public void discountPrice() {
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	
	
}
