package Exam1108.FruitProject_O;

public class Fruit {

	double calorie;
	double price;
	double weight;
	
	public Fruit() {
		super();
	}

	public Fruit(double calorie, double price, double weight) {
		super();
		this.calorie = calorie;
		this.price = price;
		this.weight = weight;
	}

	public double getCalorie() {
		return calorie;
	}

	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Fruit [calorie=" + calorie + ", price=" + price + ", weight=" + weight + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
