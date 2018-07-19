package firstproject;

public class TestParentChild {

	public static void main(String[] args) {
		Child c=new Child();
		c.m1();
		c.m2();
		c.m3();
		
		Parent p=new Parent();
		p.m1();
		p.m2();
		//p.m3();//not possible
		
		Parent p1=new Child();
		p1.m1();
		p1.m2();
		//p1.m3();//not possible
	}

}
