package firstproject;

import java.util.*;


public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap hm=new LinkedHashMap();
		hm.put("1", "Apple");
		hm.put("3", "Orange");
		hm.put("2", "Grapes");
		hm.put("4", "Cherry");
		
		System.out.println(hm);//Ordering is based on user entered order of the key
		
		System.out.println(hm.get("3"));
		System.out.println(hm.get("1"));
		//iterating LinkedHashMap
		
		Set keys=hm.keySet();
		Iterator it=keys.iterator();
		
		while(it.hasNext()) {
			String key=(String)it.next();
			System.out.println(key);
		}
	}

}
