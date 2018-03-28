package linkedHashMaps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;


public class MapClient {

	public static void main(String[] args) {
		LinkedHashMap lm=new LinkedHashMap();
		lm.put(new MapClass01("Raghavendra","Tirunagari","Ravi Kiran",24),new MapClass02("stigentech","Java Developer","Hyderabad","Male",10000));
		lm.put(new MapClass01("Raghava","Tirunagari","Ravi Kiran",24),new MapClass02("stigentech","Java Developer","Hyderabad","Male",10000));
		lm.put(new MapClass01("Anudeep","Challa","Mallikarjun",24),new MapClass02("stigentech","Java Developer","Hyderabad","Male",10000));
	
		Set s=lm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Entry e1=(Entry)itr.next();
			System.out.println(e1.getKey()+" "+e1.getValue());
	
	}

}
}
