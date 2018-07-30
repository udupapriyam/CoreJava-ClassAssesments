package firstproject;

import java.io.*;

public class FileDemo5 {

	public static void main(String[] args) {
		File f=new File("C:/Users/nexwave/Desktop/ClassroomTraining");
		
		String allFiles[]=f.list();
		for(int i=0; i<allFiles.length; i++) {
			System.out.println(allFiles[i]);
		}
	}

}
