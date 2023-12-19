package Exam1110.Product_O;

public class DiscountPrice extends Product {

	private double discount; // 할인율
	

	public DiscountPrice() {
		super();
	}

	public DiscountPrice(double discount) {
		super();
		this.discount = discount;
	}

	public DiscountPrice(String name, double price, double discount) {
		super(name, price);
		this.discount = discount;
		// TODO Auto-generated constructor stub
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void discountPrice() {
		System.out.println("물건의 이름: " + getName());
		System.out.println("물건의 가격: " + getPrice() + " 할인율" + discount);
		System.out.println("할인된 가격은: " + (getPrice() - (getPrice() * (discount/100))));
	}
	
	@Override
	public String toString() {
		return "DiscountPrice [discount=" + discount + ", toString()=" + super.toString() + "]";
	}	
}
