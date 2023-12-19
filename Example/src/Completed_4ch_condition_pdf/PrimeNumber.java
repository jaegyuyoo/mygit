package Completed_4ch_condition_pdf;

public class PrimeNumber {

	public static void main(String[] args) {

		final int NUMBER_OF_RPIMES = 50; // 소수의 최대갯수
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // 각행에 10개씩
		int count = 0; // 소수의 갯수
		int number = 2; // 소수의 테스트 초기숫자를 2로 설정
		
		System.out.println("50개의 소수를 출력하는 프로그램");
		
		// 반복적으로 소수찾기
		while (count < NUMBER_OF_RPIMES) {
			//숫자가 소수라고 가정
			boolean isPrime = true; // 현재 숫자를 소수라 한다.
			
			//숫자가 소수인지 테스트
			for (int divisior = 2; divisior <= number; divisior++) {
				if (number % divisior == 0) {
					isPrime = false; // isPrime을 fales로 설정
					break;
				}
			}
			// 소수를 출력하고 개수를 늘인다.
			if (isPrime) {
				count++;
				
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// 소수가 10번째가 되면 출력하고 새 줄로 이동
					System.out.println(number + ",");
				} else {
					// 소수가 10번재가 안되었을 때 출력
					System.out.println(number + " : ");

				}
			}
			// count를 1씩증가
			number++;
		}
	}

}
