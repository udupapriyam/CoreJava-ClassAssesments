package firstproject;

import java.util.*;
import java.util.Collections;
import java.util.Vector;

public class CollectionClassMethodsDemo {

	enum e1{a1,a2,a3,a4};
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("1");
		al.add("21");
		al.add("16");
		al.add("8");
		al.add("12");
		
		int i=Collections.binarySearch(al,"16");
		System.out.println();
		System.out.println("binary search result = "+i);
		
		System.out.println("Before swapping = "+al);
		Collections.swap(al, 2, 4);
		System.out.println("Swapped result = "+al);
		
		System.out.println("Minimum = "+Collections.min(al));
		
		Collections.reverse(al);
		System.out.println("Result after reversing = "+al);
		
		ArrayList al2=new ArrayList();
		al2.add("1");
		al2.add("21");
		al2.add("16");
		al2.add("8");
		al2.add("8");
		al2.add("12");
		Collections.copy(al2, al);
		System.out.println("list after copying = "+al2);
		
		Collections.reverse(al);

		Collections.fill(al, "13");
		System.out.println("Result after filling = "+al);
		
		Collections.replaceAll(al, "13", "7");
		System.out.println("Result after replacing all = "+al);
		
		Vector v=new Vector();
		v.add(1);
		v.add(2);
		
		ArrayList al3=new ArrayList();
		Enumeration e=v.elements();
		al3=Collections.list(e);
		System.out.println("Result after using enumeration = "+al3);
		
		
		
	}

}
