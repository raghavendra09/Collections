package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterfaces {

	public static void main(String[] args) {
       Map m = new HashMap();
       
       m.put("Key","Value");
       m.put("Name","Raghava");
       m.put("City","Hyderabad");
       m.put("Age",24);
       m.put("Professional","software engineer");
       m.put("Gender","Male");
       
       System.out.println(m);
       System.out.println();
       System.out.println();
       
       
       Set set=m.entrySet();
       
       Iterator itr=set.iterator();  
       while(itr.hasNext()){  
            
           Entry en = (Entry)itr.next();
           System.out.println(en.getKey()+"="+en.getValue());
       }  
       
       System.out.println();
       System.out.println();
       System.out.println("Accessing by key");
       
       Set key=m.keySet();
       
       for(Object o:key) {
    	   System.out.println(o+"="+m.get(o));
       }
       
	}

}
