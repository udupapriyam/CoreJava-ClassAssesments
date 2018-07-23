package firstproject;

abstract class Person{
	public abstract void whatDoYouDo();
	public boolean doYouSpeak() {
		System.out.println("Yes speaks");
		return true;
	}
}

class Trainer1 extends Person{
	public void whatDoYouDo() {
		System.out.println("Delivers Lectures");
	}
}

class Doctor extends Person{
	public void whatDoYouDo() {
		System.out.println("Cures ill");
	}
}

class Pilot extends Person{
	public void whatDoYouDo() {
		System.out.println("Flies the airplane");
	}
}

public class AbstractEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer1 t=new Trainer1();
		t.doYouSpeak();
		t.whatDoYouDo();
		
		Doctor d=new Doctor();
		d.doYouSpeak();
		d.whatDoYouDo();
		
		Pilot p=new Pilot();
		p.doYouSpeak();
		p.whatDoYouDo();
	}

}
