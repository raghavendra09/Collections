package TreeMapMethods;

import java.util.TreeMap;

public class TreeMapMethods {

	public static void main(String[] args) {

		TreeMap tm=new TreeMap();
		TreeMap tm1=new TreeMap();
		
		System.out.println("*****TreeMap Methods*****");
		
		tm.put(10,"Raghavendra");
		tm.put(11,"Anudeep");
		tm.put(12,"Kranthi");
		tm.put(15,"Sarath");
		tm.put(18,"Revanth");
		
		tm1.putAll(tm);
		
		tm1.put(25,"Lahari");
		tm1.put(18,"Suresh");
		tm1.put(35,"Abhi");
		tm1.put(46,"Mahesh");
		tm1.put(40,"Sateesh");
		
		
		System.out.println(tm);
		System.out.println(tm1);
		System.out.println(tm1.size());
		
		tm1.remove(40);
		System.out.println(tm1);
		System.out.println(tm1.get(10));
		System.out.println(tm1.get(40));//as key=40 is removed it returns null
		System.out.println(tm.clone());
		
		//containsKey method
		if(tm.containsKey(10)) {
			System.out.println("Found:" +tm.get(13));
		}
		else
		{
			System.out.println("Not found");
		}
		
		//containsValue method
				if(tm.containsValue("Raghavendra")) {
					System.out.println("Found:" +tm.get(10));
				}
				else
				{
					System.out.println("Not found");
				}
				
			
				
				tm.clear();
				System.out.println(tm);
				
				
				System.out.println("*****TreeMap-Sorted Methods*****");
				
				tm1.comparator();
				System.out.println(tm1);
				
				System.out.println(tm.values());
				
				System.out.println(tm1.entrySet());
				
				System.out.println("First Key:" +tm1.firstKey());
				
				System.out.println("Last Key:" +tm1.lastKey());
				
				System.out.println("Keys:" +tm1.keySet());
				
				System.out.println("HeadMap:" +tm1.headMap(35));
				
				System.out.println("SubMap:" +tm1.subMap(18,46));
				
				System.out.println("TailMap:" +tm1.tailMap(35));
				
				
		
				System.out.println("*****TreeMap-Navigable Methods*****");
				
				System.out.println(tm1.ceilingEntry(13));// it will print the key along with value. If  given key is present it will print key and value.  If  given key is not present it will print key and value of next least of greatest key. .
				
				System.out.println(tm1.ceilingKey(13));//if given value is present in the list then returns the actual value given
	
				System.out.println(tm1.floorEntry(13));
	
				System.out.println(tm1.floorKey(13));
	
				System.out.println(tm1.descendingKeySet());
				
				System.out.println(tm1.descendingMap());
				
				System.out.println(tm1.firstEntry());
				
				System.out.println(tm1.lastEntry());
				
				System.out.println(tm1.headMap(11, false));
				
				System.out.println(tm1.headMap(11, true));
				
				System.out.println(tm1.subMap(11,46));

                System.out.println(tm1.tailMap(11, false));
				
				System.out.println(tm1.tailMap(11, true));
	
				System.out.println(tm1.higherEntry(13));
				System.out.println(tm1.higherEntry(12));
				
				System.out.println(tm1.lowerEntry(13));
				System.out.println(tm1.lowerEntry(12));
				
				System.out.println(tm1.higherKey(13));
				System.out.println(tm1.higherKey(12));
				
				System.out.println(tm1.lowerKey(13));
				System.out.println(tm1.lowerKey(12));
				
				System.out.println(tm1.navigableKeySet());
				
				System.out.println(tm1.pollFirstEntry());
				System.out.println(tm1.pollFirstEntry());
				
				System.out.println(tm1.pollLastEntry());
				System.out.println(tm1.pollLastEntry());
				
	}
	

}
