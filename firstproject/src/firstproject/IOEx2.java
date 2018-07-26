package firstproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter your name");
		String name=br.readLine();
		System.out.println("Please enter your city");
		String city=br.readLine();
		System.out.println("Welcome "+name);
		System.out.println("You are living in "+city);
	}

}
