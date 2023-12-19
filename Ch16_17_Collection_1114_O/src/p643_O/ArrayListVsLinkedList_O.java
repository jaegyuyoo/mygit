package p643_O;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList_O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 데이터 추가 시간 비교
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		long startTime = 0, endTime = 0;
				
		
		// 1-1. ArrayList 데이터 추가 시간 
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.add(0, i);
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 데이터 추가 시간 = " + (endTime - startTime) + " ns");
		
		
		// 1-2 LikedList 데이터 추가 시간 
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.add(0, 1);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 데이터 추가 시간 = " + (endTime - startTime) + " ns");

		// 2-1. ArrayList 데이터 검색 시간 
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.get(i);
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 데이터 검색 시간 = " + (endTime - startTime) + " ns");
		
		
		// 2-2 LikedList 데이터 검색 시간 
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 데이터 검색 시간 = " + (endTime - startTime) + " ns");

		
		// 3-1. ArrayList 데이터 제거 시간 
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.remove(0);
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 데이터 제거 시간 = " + (endTime - startTime) + " ns");
		
		
		// 2-2 LikedList 데이터 제거 시간 
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 데이터 제거 시간 = " + (endTime - startTime) + " ns");

		
	}	


}
