package Exam1110.InterfaceProject_O;

public class TV {
	
	String name; // 이름 
	double price; // 가격
	
	public TV() {
		super();
	}

	public TV(String name, double price) {
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

	@Override
	public String toString() {
		return "TV [name=" + name + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	
	
}
