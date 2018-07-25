package firstproject;

import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("1", "Apple");
		hm.put("2", "Orange");
		hm.put("3", "Grapes");
		hm.put("4", "Cherry");
		
		System.out.println(hm);//Ordering is based on hashcode value of the key
		
		System.out.println(hm.get("3"));
		System.out.println(hm.get("1"));
		//iterating hashmap
		
		Set keys=hm.keySet();
		Iterator it=keys.iterator();
		
		while(it.hasNext()) {
			String key=(String)it.next();
			System.out.println(key);
		}
		
	}

}
