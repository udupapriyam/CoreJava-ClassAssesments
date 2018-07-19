package firstproject;


public class TestClass {

	public static void main(String[] args) {
		MySchool s1=new MySchool();
		s1.nameOfTheSchool="St. Lawrence";
		s1.noOfStudents=100;
		s1.city="Mangalore";
		
		Trainer t1=new Trainer();
		t1.name="Monica";
		//t1.age=60;//cant access private member
		t1.salary=25000.00;
		
		LabTrainer lt=new LabTrainer();
		lt.salary=21000.00;
	}

}
