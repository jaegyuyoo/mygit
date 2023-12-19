package Completed_4ch_condition_pdf;

public class MultiplicationTable2 {

	public static void main(String[] args) {
		System.out.println("구 구 단");
		System.out.println();

		for (int j = 2; j < 10; j++) { // N구구단
			System.out.print(j + "단 \t\t");
		}

		System.out.println();
		
		for (int i = 1; i < 10; i++) { // N구구단
			for (int j = 2; j < 10; j++) { // 구구단계산
				System.out.print(j + " * " + i + " = " + (j * i) + "\t");
			}
			System.out.println(" "); // 행을 다음행으로 
		}

	}
}