package p636_O;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> aList1 = new ArrayList<>();
		
		// 1. add (E)
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println(aList1.toString());
		System.out.println();
		
		
		// 2. add (int index, E)
		aList1.add(1, 6);
		System.out.println(aList1.toString());
		System.out.println();
		
		// 3. add all (또 다른 리스트 삭제)
		List<Integer> aList2 = new ArrayList<>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1);
		System.out.println(aList2);
		System.out.println();
		
		// 4.ADD ALL (int index, 또 다른 리스트 삭제)
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(1);
		aList3.add(2);
		aList3.addAll(1, aList3);
		System.out.println(aList3);
		System.out.println();
		
		// 5. set (int index, E)
		aList3.set(1, 5);
		aList3.set(3, 6);
		// 인덱서 넘으면 오류
		System.out.println(aList3);
		System.out.println();
		
		// 6. remove(int index)
		aList3.remove(1);
		System.out.println(aList3);
		System.out.println();
		
		//  7. remove (object o)
		aList3.remove(new Integer(2));
		System.out.println(aList3);
		System.out.println();
		
		// 8. clear()
		aList3.clear();
		System.out.println(aList3);
		System.out.println();
		
		// 9 isEmpty()
		System.out.println(aList3.isEmpty());
		System.out.println();
		
		// 10.size()
		System.out.println(aList3.size());
		
		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		
		System.out.println(aList3);
		System.out.println(aList3.size());
		System.out.println();
		
		
		// 11. get (int index)
		System.out.println("0번째: " + aList3.get(0));
		System.out.println("1번째: " + aList3.get(1));
		System.out.println("2번째: " + aList3.get(2));
		
		for (int i = 0; i < aList3.size(); i++) { // *for each 문 해보기 
			System.out.println(i + "번째: " + aList3.get(i));
		}
		System.out.println();
		
		// 12. toArray() List -> Array 
		Object[] object = aList3.toArray();
		System.out.println(Arrays.toString(object));
		System.out.println();
		
		// 13-1 toArray(T[] t) List -> T[]
		Integer[] interger1 = aList3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(interger1));
		System.out.println();
		
		// 13-2 toArray(T[] t) List -> T[]
		Integer[] interger2 = aList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(interger2));
		System.out.println();
		System.out.println();
		
	}
	

}
