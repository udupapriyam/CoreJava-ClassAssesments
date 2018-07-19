/*
 * @Author : Priyamvada  19July2018
 */

package firstproject;

class emp3{
	double salary;
	String name;
	int eid;
	String dept;
	Address add;
	
	emp3(double salary,String name,int eid,String dept,Address add){
		this.salary=salary;
		this.name=name;
		this.eid=eid;
		this.dept=dept;
		this.add=add;
	}
	
	public void printEmpDetails() {
		System.out.println(this.name);
		System.out.println(this.salary);
		System.out.println(this.eid);
		System.out.println(this.dept);
		add.printAddress();
	}
}

class Address{
	int flatno;
	String flatname;
	String main;
	String cross;
	String city;
	long pincode;
	
	public Address(int flatno, String flatname, String main, String cross, String city, long pincode) {
		super();
		this.flatno = flatno;
		this.flatname = flatname;
		this.main = main;
		this.cross = cross;
		this.city = city;
		this.pincode = pincode;
	}
	
	public void printAddress() {
		System.out.println(this.flatno);
		System.out.println(this.flatname);
		System.out.println(this.main);
		System.out.println(this.cross);
		System.out.println(this.city);
		System.out.println(this.pincode);
	}
}

public class HasARealationship {

	public static void main(String[] args) {
		Address a=new Address(112,"SG Nilaya","7th main","8th cross","Mangalore",575008);
		emp3 e=new emp3(20500.00,"Peter",123,"Finance",a);
		e.printEmpDetails();
	}

}
