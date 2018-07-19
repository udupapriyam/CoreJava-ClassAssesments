package firstproject;

public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b1[]= {"red", "blue", "yellow", "red"};
		String b2[]= {"red", "blue", "yellow", "green"};
		int count=0;
		for(int i=0; i<b1.length; i++) {
			if(b1[i].equals("red")) {
				count++;
			}
		}
		for(int i=0; i<b1.length; i++) {
			if(b2[i].equals("red")) {
				count++;
			}
		}
		System.out.println("count = "+count);
	}

}
