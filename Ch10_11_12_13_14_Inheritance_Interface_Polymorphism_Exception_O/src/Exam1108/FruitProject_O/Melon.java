package Exam1108.FruitProject_O;

public class Melon extends Fruit {

	private String farmInformation;

	public Melon() {
		super();
	}

	public Melon(String farmInformation) {
		super(3.2,3.2,3.9);
		this.farmInformation = farmInformation;
	}

	public Melon(double calorie, double price, double weight, String farmInformation) {
		super(calorie, price, weight);
		this.farmInformation = farmInformation;
	}

	public String getFarmInformation() {
		return farmInformation;
	}

	public void setFarmInformation(String farmInformation) {
		this.farmInformation = farmInformation;
	}

	@Override
	public String toString() {
		return "Melon [farmInformation=" + farmInformation + ", toString()=" + super.toString() + "]";
	}

}
