package firstproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		String city;
		do {
			System.out.println("Please enter city");
			city=br.readLine();
			count=count+1;
		}while(!(city.equalsIgnoreCase("STOP")));
		
		count=count-1;
		System.out.println("User entered "+count+" cities.");
	}
}
