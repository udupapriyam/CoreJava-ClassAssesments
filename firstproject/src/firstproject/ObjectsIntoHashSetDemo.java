package firstproject;

import java.util.*;

class mobilee{
	String mname;
	int price;
	public mobilee(String mname, int price) {
		super();
		this.mname = mname;
		this.price = price;
	}
	@Override
	public String toString() {
		return this.mname+"-"+this.price;
	}
	
	@Override
	public boolean equals(Object obj) {
		mobilee mm=(mobilee)obj;
		if(this.mname.equals(mm.mname) && this.price==(mm.price)) {
			return true;
		}
		else	
			return false;
	}
	
	@Override
	public int hashCode() {
		return this.price*5;
	}
}

public class ObjectsIntoHashSetDemo {

	public static void main(String[] args) {
		mobilee m1=new mobilee("Motorola",15000);
		mobilee m2=new mobilee("Motorola",15000);
		mobilee m3=new mobilee("Motorola",15500);
		
		HashSet hs=new HashSet();
		hs.add(m1);
		hs.add(m2);
		hs.add(m3);
		
		System.out.println(hs);
		
	}

}
