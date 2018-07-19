package firstproject;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary=55555.55;
		double tax=salary*(20/100.0);
		double bonus=salary*0.15;
		double bill=salary*0.15;
		double food=salary*(50/100.0);
		double savings=salary-tax+bonus-bill-food;
		System.out.println(savings);
	}

}
