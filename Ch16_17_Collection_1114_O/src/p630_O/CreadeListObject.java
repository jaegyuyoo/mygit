package p630_O;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreadeListObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> aList1 = new ArrayList<>();
		List<Integer> aList2 = new ArrayList<>(30);
		List<Integer> aList3 = new Vector<>();
		List<Integer> aList4 = new Vector<>(20);
		List<Integer> aList5 = new LinkedList<>(); // (30) 링크드 테스느는 저장용량 지정불가
		
		List<Integer> aList7 = Arrays.asList(1, 2, 3, 4);
		List<String> aList8 = Arrays.asList("안녕", "반가");
		
		aList7.set(1, 7);
		aList8.set(0, "감사");
		
		System.out.println(aList7);
		System.out.println(aList8);
		
	}

}
