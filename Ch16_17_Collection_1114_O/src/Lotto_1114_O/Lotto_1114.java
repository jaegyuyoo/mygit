package Lotto_1114_O;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto_1114 {

	public static void main(String[] args) throws Exception { // *예외던지기  
		// TODO Auto-generated method stub
		
		Random random = new Random(); // 다형적 
		
		Set<Integer> lotto = new TreeSet<>(); // 로또번호 *컬렉션  p.633
		// 정렬하기 위해 TreeSet
		int bonus; // 보너스 번호
		
		System.out.println("로또 번호 생성기");
		for (int i = 0; i < 6; i++) { // 6개수 생성 
			System.out.println(((i + 1) + " 번째 번호 생성"));
			if (!(lotto.add(random.nextInt(45) + 1))) { // 45개 랜덤수 생성 lotto.add
			}
			Thread.sleep(1000);
		}
		System.out.println("\n로또 번호");
		System.out.println(lotto);
		
		do {
			bonus = random.nextInt(45) + 1;
			if (!(lotto.contains(bonus))) {
				break;
			}
 		} while(true); 
		System.out.println("\n보너스 번호");
		System.out.println(bonus);
	}

}
