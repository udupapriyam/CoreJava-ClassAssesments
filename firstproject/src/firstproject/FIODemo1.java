package firstproject;

import java.io.*;

public class FIODemo1 {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("file1.txt");
		int x=f.read();
		while(x!=1) {
			System.out.print((char)x);
			x=f.read();
		}
		
		f.close();
	}

}
