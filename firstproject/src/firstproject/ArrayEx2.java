package firstproject;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,50,2,5,25};
		int big=arr[0];
		for(int i=0; i<5; i++) {
			if(arr[i]>big) {
				big=arr[i];
			}
		}
		System.out.println("Big = "+big);
		
		int small=arr[0];
		for(int i=0; i<5; i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("Small = "+small);
	}

}
