package Exam1110.Product_O;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String name; // 이름
		double price; // 가격
		double discount; // 할인율
		double discountPrice = 0; // 할인된 가격
		
		Product product = new Product();
		
		System.out.println("이름: ");
		name = input.next();
		product.setName(name);
		
		System.out.println("가격: ");
		price = input.nextDouble();
		product.setPrice(discountPrice);
		
		System.out.println("할인율(%): ");
		discount = input.nextDouble();
		product = new DiscountPrice(name, price, discount);
	
		// product.discountPrice();
		
		System.out.println(product); // to string부분이 나오는거
	}
	
		

}
