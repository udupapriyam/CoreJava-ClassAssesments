package firstproject;

class restaurent{
	public synchronized void TakeLunch(String menu){
		System.out.print("!");
		System.out.print(menu);
		System.out.print("!");
	}
}

class RestThread extends Thread{
	String menu;
	restaurent res;
	public RestThread(String menu, restaurent res) {
		this.menu = menu;
		this.res = res;
	}
	
	public void run() {
		res.TakeLunch(this.menu);
	}
	
}

public class SynchronizedThreadDemo2 {

	public static void main(String[] args) throws InterruptedException {
		restaurent r=new restaurent();
		RestThread rt1=new RestThread("Biriyani",r);
		RestThread rt2=new RestThread("Meals",r);
		
		rt2.start();
		Thread.sleep(5000);
		rt1.start();
	}

}
