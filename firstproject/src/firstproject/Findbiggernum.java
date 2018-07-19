package firstproject;

public class Findbiggernum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=50;
		if(a==0 && b==0) {
			System.out.println("Both cannot be zero");
		}
		else {
			if(a>b) {
				System.out.println("Largest number is : "+a);
			}
			else {
				if(b>a) {
					System.out.println("Largest number is : "+b);

				}
				else {
					System.out.println("Both numbers are equal");
				}
			}
		}
	}

}
