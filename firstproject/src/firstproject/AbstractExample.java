package firstproject;


	abstract class Person6{
		public boolean deosHeBreath(){
			System.out.println("Every person breaths");
			return true;
		}
		public boolean deosHeSleep(){
			System.out.println("Every person sleeps");
			return true;
		}
		public abstract boolean deosHeDrivesCar();
	}
	abstract class Employee6 extends Person6{
		public abstract boolean deosHeDrivesCar();
	}
	class Driver1 extends Employee6{
		@Override
		public boolean deosHeDrivesCar() {
			System.out.println("Every person sleeps");
			return true;
		}
	}
	public class AbstractExample {
		public static void main(String[] args) {
		Driver1 d=new Driver1();
		System.out.println("breathing? "+d.deosHeBreath());
		System.out.println("sleeping? "+d.deosHeSleep());
		System.out.println("breathing? "+d.deosHeBreath());
		System.out.println("driving? "+d.deosHeDrivesCar());


	}
}
