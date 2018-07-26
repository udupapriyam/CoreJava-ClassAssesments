package firstproject;

class firstThread extends Thread{
	public void run() {
		
		for(int i=1; i<=5; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

class secondThread extends Thread{
	public void run() {
		
		for(int i=15; i<=20; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

public class ThreadDemo3 {

	public static void main(String[] args) {
		
		firstThread ft=new firstThread();
		ft.setName("MyThread1");
		System.out.print(ft.getName()+"--");
		ft.start();
		
		secondThread fs=new secondThread();
		fs.setName("MyThread2");
		System.out.print(fs.getName()+"--");
		fs.start();
	}

}
