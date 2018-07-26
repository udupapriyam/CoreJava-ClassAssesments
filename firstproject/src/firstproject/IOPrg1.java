package firstproject;
import java.io.*;
public class IOPrg1 {

	public static void main(String[] args) throws IOException {
		// Reading character
		System.out.println("Please enter a character");
		int x=System.in.read();
		System.out.println("You have entered : "+(char)x);
	}

}
