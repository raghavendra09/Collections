package treeMap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClient {

	public static void main(String[] args) {

		TreeMap tm = new TreeMap();
		tm.put(new EmpDetails(2123,"Raghavendra",8790596864l),new TeamLeader("Software Engineer","Nagarjuna"));
		tm.put(new EmpDetails(2124,"Sarath",9848368284l),new TeamLeader("Software Engineer","Nagarjuna"));
		tm.put(new EmpDetails(2125,"Anudeep",9700489109l),new TeamLeader("Software Engineer","Nagarjuna"));
		tm.put(new EmpDetails(2126,"Kranthi",9948469094l),new TeamLeader("Software Engineer","Nagarjuna"));
		
		
		
		
		Set s=tm.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
	    System.out.println(itr.next());
		}
	}

}
