package Task1.comparable;

import java.util.ArrayList;
import java.util.Collections;

import Task.comparator.Student;

public class list1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Student(15,"Raghava",20));
		al.add(new Student(18,"Raghava",24));
		al.add(new Student(10,"Raghavendra",23));
		al.add(new Student(30,"Rajesh",19));
		al.add(new Student(40,"Raghavendra",17));
		al.add(new Student(20,"Babloo",20));
		Collections.sort(al);
		for(Object x:al) {
		System.out.println(x);
		}
	}
}