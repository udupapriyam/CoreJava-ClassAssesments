package firstproject;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet hs=new TreeSet();
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
