package firstproject;

public class Employeee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private static String companyName="Deloitte";
	
	Employeee(){
		this.employeeId=103;
		this.employeeName="Priyam";
		this.employeeSalary=12300.00;
	}
	
	public static String getCompnayName() {
		
		return Employeee.companyName;
	}
	
	Employeee(int eid, String ename, double esal){
		this.employeeId=eid;
		this.employeeName=ename;
		this.employeeSalary=esal;
	}
	
	public double calculateBonus() {
		double bonus=0.0;
		if(this.employeeSalary<=5000) {
			bonus=this.employeeSalary*.2;
		}
		else {
			bonus=this.employeeSalary*.1;
		}
		return bonus;
	}
}
