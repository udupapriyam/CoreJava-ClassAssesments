//package firstproject;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double prod1=15.0,prod2=25.2,prod3=63.5;
		if(prod1>prod2) 
		{
			
			if(prod1>prod3) {
				System.out.println(prod1+" is biggest");
			}
			else {
				System.out.println(prod3+" is biggest");
			}
		}
		else {
			if(prod2>prod3) {
				System.out.println(prod2+" is biggest");
			}
			else {
				System.out.println(prod3+" is biggest");
			}
		}
	}
}
