package firstproject;

public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"sanjana", "priyamvada", "guru", "jijo", "jilu"};
		boolean flag=false;
		int pos=0;
		for(int i=0; i<5; i++) {
			if(a[i].equals("guru")){
				flag=true;
				pos=i;
				break;
			}
		}
		if(flag){
			System.out.println("Position of guru is "+pos);
		}
		else {
			System.out.println("Not found");
		}
	}

}
