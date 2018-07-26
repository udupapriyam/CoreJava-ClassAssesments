package firstproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter number");
		int num=Integer.parseInt(br.readLine());
		if(num%3==0) {
			System.out.println("Divisible by 3");
		}
		else {
			System.out.println("Not divisible by 3");
		}
	}

}
