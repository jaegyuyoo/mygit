package p677_O;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparableClass implements Comparator<MyComparableClass> {

	int data1;
	int data2;

	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;

	}

	@Override
	public int compare(MyComparableClass o1, MyComparableClass o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
