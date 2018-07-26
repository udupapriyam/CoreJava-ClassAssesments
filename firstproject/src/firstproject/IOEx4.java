package firstproject;

import java.io.*;

public class IOEx4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int max=0;
		int n=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<5;i++){
			System.out.println("Please enter number");
			n=Integer.parseInt(br.readLine());
			if(n>max) {
				max=n;
			}
		}
		System.out.println("max = "+max);
	}

}
