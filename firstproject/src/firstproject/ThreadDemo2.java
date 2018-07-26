package firstproject;

class Thread3 extends Thread{
	public void run() {
		System.out.print(Thread.currentThread().getName()+"--");
		for(int i=1; i<=5; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

class Thread2 extends Thread{
	public void run() {
		System.out.print(Thread.currentThread().getName()+"--");
		for(char c='A'; c<='E';c++) {
			System.out.print(c+" ");
		}
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		Thread3 t1=new Thread3();
		t1.start();
		
		Thread2 t2=new Thread2();
		t2.start();
	}

}
