package Exam1107_print;

public class Stock {

	private String name; // 종목명(회사명)
	private double proviousClosingPrice; // 어제의 종가
	private double currentPrice; // 현재가
	private double getChangePercent;
	
	// 1-1 Generate Constructor using Fields
	public Stock() {
		super();
	}

	// 1-1 Generate Constructor using Fields
	public Stock(String name, double proviousClosingPrice, double currentPrice, double getChangePercent) {
		super();
		this.name = name;
		this.proviousClosingPrice = proviousClosingPrice;
		this.currentPrice = currentPrice;
		this.getChangePercent = getChangePercent;
	}

	// 2. Generate Getters and Setters
	// 종목명 반납
	public String getName() {
		return name;
	}
	// 종목명 변경
	public void setName(String name) {
		this.name = name;
	}
	// 어제종가 반납
	public double getProviousClosingPrice() {
		return proviousClosingPrice;
	}
	// 어제종가 변경
	public void setProviousClosingPrice(double proviousClosingPrice) {
		this.proviousClosingPrice = proviousClosingPrice;
	}
	// 현재가 반납
	public double getCurrentPrice() {
		return currentPrice;
	}
	// 현재가 변경
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	// 변동율 반납
	public double getGetChangePercent() {
		return getChangePercent;
	}
	// 변동율 변경
	public void setGetChangePercent(double getChangePercent) {
		this.getChangePercent = getChangePercent;
	}

	@Override
	public String toString() {
		return "Stock [name=" + name + ", proviousClosingPrice=" + proviousClosingPrice + ", currentPrice="
				+ currentPrice + ", getChangePercent=" + getChangePercent + "]";
	}
	
	
}
