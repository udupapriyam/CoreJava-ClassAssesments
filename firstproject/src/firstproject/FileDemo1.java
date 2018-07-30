package firstproject;

import java.io.*;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:/Users/nexwave/Desktop/ClassroomTraining/MyFile1");
		boolean created=f.createNewFile();
		if(created==true) {
			System.out.println("File created succesfully");
		}
		else {
			System.out.println("File not created");
		}
	}

}
