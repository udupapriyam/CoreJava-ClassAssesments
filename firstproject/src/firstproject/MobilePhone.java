package firstproject;

public class MobilePhone {
	String brandName;
	double price;
	String color;
	int resolution;
	
	public void mankeACall()
	{
		System.out.println("Please wait..call connecting");
	}
	
	public void receiveACall()
	{
		System.out.println("Please wait..receiving a call");
	}
	
	public void sendAText()
	{
		System.out.println("Please wait..Sending text");
	}
	
	public double discount()
	{
		double discount=0.0;
		if(this.brandName.equals("Samsung")) {
			discount=this.price*0.10;
		}
		else if(this.brandName.equals("Motorola")) {
			discount=this.price*0.15;
		}
		return discount;
		
	}
}
