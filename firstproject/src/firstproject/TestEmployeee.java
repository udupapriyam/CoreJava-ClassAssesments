package firstproject;

public class TestEmployeee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeee e1=new Employeee(102,"Priyam",7000.00);
		Employeee e2=new Employeee();
//		e1.employeeId=101;
//		e1.employeeName="Priyamvada";
//		e1.employeeSalary=6000.0;
		
		double bonus=e1.calculateBonus();
		double bonus1=e2.calculateBonus();
		System.out.println(bonus);
		System.out.println(bonus1);
		System.out.println(Employeee.getCompnayName());
		System.out.println(e1.getCompnayName());
	}

}
