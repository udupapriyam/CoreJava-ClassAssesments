package firstproject;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("Java");
		ll.add("C++");
		ll.add("php");
		ll.add("Python");
		ll.add("C#");
		
		System.out.println(ll);
		System.out.println();
		
		for(int i=0; i<ll.size(); i++) {
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
		
		Iterator it= ll.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		//Forward direction
		ListIterator lt=ll.listIterator();
		while(lt.hasNext()) {
			System.out.print(lt.next()+" ");
		}
		System.out.println();
		
		//Backward direction
		while(lt.hasPrevious()) {
			System.out.print(lt.previous()+" ");
		}
	}

}
