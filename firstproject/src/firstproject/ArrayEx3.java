package firstproject;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {12,50,2,5,25};
		int sum=0,sume=0,sumo=0;
		for(int i=0; i<5; i++) {
			sum=sum+arr[i];
			}
		System.out.println("Sum = "+sum);
		
		for(int i=0; i<5; i++) {
			if(arr[i]%2==0) {
				sume=sume+arr[i];
			}
			else {
				sumo=sumo+arr[i];
			}
		}
		System.out.println("Sum of even = "+sume);
		System.out.println("Sum of odd= "+sumo);
	}

}
