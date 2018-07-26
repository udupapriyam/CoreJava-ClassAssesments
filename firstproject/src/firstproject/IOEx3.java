package firstproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter 1st number");
		int num1=Integer.parseInt(br.readLine());
		System.out.println("Please enter 2nd number");
		int num2=Integer.parseInt(br.readLine());
		System.out.println("Please enter 3rd number");
		int num3=Integer.parseInt(br.readLine());
		System.out.println("Please enter 4th number");
		int num4=Integer.parseInt(br.readLine());
		System.out.println("Please enter 5th number");
		int num5=Integer.parseInt(br.readLine());
		
		int avg=(num1+num2+num3+num4+num5)/5;
		
		System.out.println("Average = "+avg);
	}

}
