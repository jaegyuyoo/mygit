package Completed_4ch_condition_pdf;

public class MultiplicationTable {

	public static void main(String[] args) {

		System.out.println("구구단");
		System.out.println();

		for (int j = 2; j < 10; j++) { // N구구단
			System.out.println(j + "단");

			for (int i = 1; i < 10; i++) { // 구구단계산
				System.out.println(j + " * " + i + " = " + (j * i));
			}
			System.out.println(); // 단 별로 한칸띄운다
		}
	}
}
