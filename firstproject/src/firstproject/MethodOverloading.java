package firstproject;

class Cot{
	double price;
}
class Chair{
	double price;
}
class DinningTable{
	double price;
}

class Furniture{
	public double calculateDiscount(Cot c) {
		return c.price*0.10;
	}
	public double calculateDiscount(Chair cc) {
		return cc.price*0.10;
	}
	public double calculateDiscount(DinningTable d) {
		return d.price*0.10;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cot c=new Cot();
		c.price=1200.00;
		Furniture f=new Furniture();
		double cotDis=f.calculateDiscount(c);
		System.out.println("cot discount = "+cotDis);
	}

}
