package firstproject;

import java.io.*;
public class FIODemo4 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo=new FileOutputStream("C:\\Users\\nexwave\\Desktop\\ClassroomTraining\\File3.txt");
		byte a[]= {'h','i'};
		fo.write(a);
		System.out.println("File created");
	}

}
