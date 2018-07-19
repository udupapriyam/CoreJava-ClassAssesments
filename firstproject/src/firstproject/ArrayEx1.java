package firstproject;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {20,37,12,60,76};
		int s=26;
		boolean flag=false;
		for(int i=0,len=arr1.length; i<len; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int len=arr1.length-1,i=len; i>=0; i--) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i=0,len=arr1.length; i<len; i++) {
			if(arr1[i]==s) {
				flag=true;
				break;
			}
		}
		
		if(flag){
			System.out.println("Element found.");
		}
		else {
			System.out.println("Element not found.");
		}
		
	}

}
