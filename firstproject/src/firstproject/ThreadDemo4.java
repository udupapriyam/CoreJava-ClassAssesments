package firstproject;

class NumberThread implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.print(i+" ");
		}
	}
}

class CharThread implements Runnable{

	@Override
	public void run() {
		for(char c='A'; c<='E';c++) {
			System.out.print(c+" ");
		}
	}
}

public class ThreadDemo4 {

	public static void main(String[] args) {
		Thread nt=new Thread(new NumberThread());
		nt.start();
		
		Thread ct=new Thread(new CharThread());
		ct.start();
	}

}
