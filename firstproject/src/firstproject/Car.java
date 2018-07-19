package firstproject;

public class Car {
	String carName;
	double milage;
	double price;
	boolean luxuryType;
	
	public void setCarDetails(String carName, double milage, double price, boolean luxuryType) {
		this.carName = carName;
		this.milage = milage;
		this.price = price;
		this.luxuryType = luxuryType;
	}
	
	public void printCarDetails() {
		System.out.println(carName);
		System.out.println(milage);
		System.out.println(price);
		System.out.println(luxuryType);
	}
	
	public void chooseMyCar() {
		//for(int i=0; i<5)
	
	}
}
