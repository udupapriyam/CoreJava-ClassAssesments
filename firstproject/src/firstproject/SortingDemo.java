package firstproject;

import java.util.*;

public class SortingDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Orange");
		al.add("Mango");
		al.add("Apple");
		al.add("Chikku");
		al.add("Kiwi");
		
		System.out.print("Before sorting : "+al);
		Collections.sort(al);
		System.out.println();
		System.out.print("After sorting : "+al);
		
		System.out.println();
		
		System.out.print("Before shuffeling : "+al);
		Collections.shuffle(al);
		System.out.println();
		System.out.print("After shuffeling : "+al);
		
		System.out.println();
		
		System.out.print("Before shuffeling : "+al);
		int i=Collections.binarySearch(al, "Chikku");
		System.out.println();
		System.out.print(i);
	}

}
