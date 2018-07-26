package firstproject;

import java.io.*;

public class IOPrg2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter your name");
		String name=br.readLine();
		System.out.println("Please enter your age");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Welcome : "+name+" you are "+age+" years old.");
	}

}
