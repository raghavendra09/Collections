package TreeSetMethods;

import java.util.TreeSet;

public class TreeSetClient {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(11);
		ts.add(3);
		ts.add(1);
		ts.add(9);
		ts.add(7);
		ts.add(5);
		
		for(Object x:ts) {
			System.out.println(x);
		}
System.out.println("......Sorted Set Methods....");
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet(9));
		System.out.println(ts.tailSet(3));
		System.out.println(ts.subSet(3, 9));
		
System.out.println("......Navigable Set Methods....");
		System.out.println(ts.ceiling(3));//if given value is present in the list then returns the actual value given
		System.out.println(ts.ceiling(4));
		System.out.println(ts.floor(7));
		System.out.println(ts.floor(6));
		System.out.println(ts.headSet(11, false));
		System.out.println(ts.headSet(11, true));//it also includes the given value
		System.out.println(ts.tailSet(3, false));
		System.out.println(ts.tailSet(3, true));
		System.out.println(ts.pollFirst());
		//it removes after retrieving the first element
		System.out.println(ts.pollFirst());		
		System.out.println(ts.pollLast());
		//it removes after retrieving the last element
		System.out.println(ts.pollLast());
		System.out.println(ts.higher(5));
		System.out.println(ts);
		System.out.println(ts.lower(7));
		
		


	}

}
