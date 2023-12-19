package p670_O;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethod_O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		TreeSet<Integer> treeSet = new TreeSet<>();

/*
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);
		}
		System.out.println(treeSet.toString());
	
		// 1. first()
		System.out.println(treeSet.first());
		
		// 2. last()
		System.out.println(treeSet.last());
				
		// 3. lower(E)
		System.out.println(treeSet.lower(26));

		// 4. higher(E)
		System.out.println(treeSet.higher(26));
		
		// 5. floor (E)
		System.out.println(treeSet.floor(25));
		System.out.println(treeSet.floor(26));
		
		// 6. ceiling (E)
		System.out.println(treeSet.ceiling(25));
		System.out.println(treeSet.ceiling(26));
		System.out.println();
		
		// 7. pollFirst()
		int treeSetiSize = treeSet.size();
		System.out.println(treeSetiSize);
		for (int i = 0; i < treeSetiSize; i++) {
			System.out.print(treeSet.pollFirst() + " ");
		}
		System.out.println();
		System.out.println(treeSet.size());
		
		// 8. pollLast()
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);			
		}
		treeSetiSize = treeSet.size();
		for (int i = 0; i < treeSetiSize; i++) {
			System.out.print(treeSet.pollLast() + " ");
		}
		System.out.println();
		System.out.println(treeSet.size());
	}
*/
		// 9. SortedSet<E> headSet (E)
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);
		}
		SortedSet<Integer> sSet = treeSet.headSet(20);
		System.out.println(sSet.toString());

		// 10. NavigableSet
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);
		System.out.println(nSet.toString());
		nSet = treeSet.headSet(20, false);
		System.out.println(nSet.toString());
		
		// 11. SortedSet
		sSet = treeSet.tailSet(20);
		System.out.println(sSet.toString());
		// 12. NavigableSet
		nSet = treeSet.tailSet(20, true);
		System.out.println(sSet.toString());
		nSet = treeSet.tailSet(20, false);
		System.out.println(nSet.toString());
		
		// 13. Sorted subSet 
		sSet = treeSet.subSet(10, 20);
		System.out.println(sSet.toString());
		
		// 14
		nSet = treeSet.subSet(10, true, 20, false);
		System.out.println(nSet.toString());
		nSet = treeSet.subSet(10, false, 20, true);
		System.out.println(nSet.toString());
		
		// 15 
		System.out.println(treeSet);
		NavigableSet<Integer> descendSet = treeSet.descendingSet();
		System.out.println(descendSet);
		descendSet=descendSet.descendingSet();
		System.out.println(descendSet);
		
	}
}
