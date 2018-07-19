package firstproject;

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary=15000, tax=0, allowance=0, net=0;
		tax=salary*(10/100.0);
		allowance=salary*(15/100.0);
		net=(salary-tax+allowance);
		System.out.println("Net salary = "+net);
	}

}
