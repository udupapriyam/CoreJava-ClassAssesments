package firstproject;

import java.io.*;

public class FIODemo5 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo=new FileOutputStream("C:\\Users\\nexwave\\Desktop\\ClassroomTraining\\File4.txt");
		DataOutputStream dos=new DataOutputStream(fo);
		dos.writeBytes("Hello\n");
		dos.writeBytes("Welcome to my file");
		System.out.println("File created");
	}

}
