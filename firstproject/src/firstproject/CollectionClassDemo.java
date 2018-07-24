package firstproject;

import java.util.*;

public class CollectionClassDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add("apple");
		al.add("mango");
		al.add("grapes");
		al.add("pineapple");
		al.add("strawberry");
		al.add("kiwi");
		al.add("bluberry");
		al.add("banana");
		al.add("green apple");
		al.add("orange");
		al.add(13);
		al.add(true);
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println();
		
		al.add(2, "pomogranate");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println();
		
		al.remove("green apple");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println();
		
		al.remove(4);
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		
	}

}
