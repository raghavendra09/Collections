package map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClient {

	public static void main(String[] args) {

		TreeMap tm = new TreeMap();
		tm.put("Name","Raghavendra");
		tm.put("Age",24);
		tm.put("Company","Stigentech");
		tm.put("Designation","Software Engineer");
		tm.put("Salary",10000);
		
		System.out.println(tm);
		
		Set s=tm.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
	    Entry e1=(Entry) itr.next();
	    System.out.println(e1.getKey()+":"+e1.getValue());
		}
	}

}
