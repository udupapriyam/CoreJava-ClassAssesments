package firstproject;

import java.util.*;

class cars implements Comparable{
	String color;
	String brand;
	double price;
	public cars(String color, String brand, double price) {
		super();
		this.color = color;
		this.brand = brand;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.color+"-"+this.brand+"-"+this.price;
	}

//	@Override
//	public int compareTo(Object o) {
//		cars cc=(cars)o;
//		int value=0;
//		if(this.price==cc.price)
//			value=0;
//		else if(this.price<cc.price)
//			value=-1;
//		else if(this.price>cc.price)
//			value=1;
//		
//		return value;
//	}
	
	@Override
	public int compareTo(Object o) {
		cars cc=(cars)o;
		return this.color.compareTo(cc.color);
	}
	
	
}

public class SortingUserDefinedObjectsDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		cars c1=new cars("Silver","Audi",735120.00);
		cars c2=new cars("White","Maruthi",52320.00);
		cars c3=new cars("Grey","BMW",7135120.00);
		cars c4=new cars("Blue","Wagnar",55120.00);
		cars c5=new cars("Red","Aulto",65120.00);
		
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		
		System.out.print("Before sorting : "+al);
		Collections.sort(al);
		System.out.println();
		System.out.print("After sorting : "+al);

	}

}



