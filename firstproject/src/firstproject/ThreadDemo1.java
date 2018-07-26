package firstproject;

class Thread1 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=1; i<=5; i++) {
			System.out.print(i+" ");
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		Thread1 t=new Thread1();
		t.start();
		
	}

}
