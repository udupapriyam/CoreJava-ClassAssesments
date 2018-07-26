package firstproject;

class Greeting{
	public synchronized void sayHello(String name) {
		System.out.print("!");
		System.out.print(name);
		System.out.print("!");
	}

}

class GreetingThread extends Thread{
	String name;
	Greeting greeting;
	public GreetingThread(String name, Greeting greeting) {
		this.name = name;
		this.greeting = greeting;
	}
	
	public void run() {
		greeting.sayHello(this.name);
	}
	
}

public class SynchronizedThreadDemo1 {

	public static void main(String[] args) {
		Greeting g=new Greeting();
		GreetingThread gt1=new GreetingThread("Priyam",g);
		GreetingThread gt2=new GreetingThread("Pav",g);
		
		gt1.start();
		gt2.start();
	}

}
