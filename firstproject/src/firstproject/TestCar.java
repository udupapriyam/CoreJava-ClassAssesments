package firstproject;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		Car c4=new Car();
		Car c5=new Car();
		
		c1.setCarDetails("Aulto", 100, 400000, false);
		c2.setCarDetails("Volkswegan", 200, 1000000, true);
		c3.setCarDetails("Maruthi", 90, 100000, false);
		c4.setCarDetails("Audi", 250, 1100000, true);
		c5.setCarDetails("Wagnar", 110, 500000, true);
		
		c1.printCarDetails();
		c2.printCarDetails();
		c3.printCarDetails();
		c4.printCarDetails();
		c5.printCarDetails();
		
		Car arr[]= {c1,c2,c3,c4,c5};
		double maxPrice=0.0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].price>maxPrice) {
				maxPrice=arr[i].price;
				name=arr[i].carName;
			}
		}
		System.out.println();
		System.out.println(name);
		
	}

}
