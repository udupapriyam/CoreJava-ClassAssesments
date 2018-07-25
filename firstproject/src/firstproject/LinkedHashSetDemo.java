package firstproject;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("Peter");
		hs.add("James");
		hs.add("Peter"); //doesn't allow duplicate, it replaces 1st one
		
		System.out.println(hs);
		
		System.out.println(hs.add("Sham"));
		System.out.println(hs.add("Ram"));
		System.out.println(hs.add("Sham"));
		
		System.out.println(hs);
	}

}
