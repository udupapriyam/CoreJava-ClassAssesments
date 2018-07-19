package firstproject;
//gurumurthy.ramamurthy@gmail.com
public class Student {
	String sname;
	int m1,m2,m3;
	char grade;
	int result;
	
	public char calculateGrade(){
		int avg=(m1+m2+m3)/3;
		char g = 0;
		if(avg>90) {
			g='A';
		}
		else if(avg>=80 && avg<=89) {
			g='B';
		}
		else if(avg>=70 && avg<=79) {
			g='C';
		}
		return g;
	}
	public void display() {
		System.out.println("m1 = "+m1);
	}
}
