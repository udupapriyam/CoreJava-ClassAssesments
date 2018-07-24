package firstproject;

class product{
	double price;
	String pname;
	public product(double price, String pname) {
		super();
		this.price = price;
		this.pname = pname;
	}
	public product() {
		
	}
	
}

public class ArrayObjectExample {

	public static void main(String[] args) {
		product p1=new product(250.0,"Pen");
		product p2=new product(150.0,"Pencil");
		System.out.println(p1.pname);
		System.out.println(p1.price);
		System.out.println(p2.pname);
		System.out.println(p2.price);
		System.out.println();
		product p[]=new product[3];
		for(int i=0; i<p.length; i++) {
			p[i]=new product();
		}
		for(int i=0; i<p.length; i++) {
			System.out.println(p[i].pname);
			System.out.println(p[i].price);
		}
		
	}

}
