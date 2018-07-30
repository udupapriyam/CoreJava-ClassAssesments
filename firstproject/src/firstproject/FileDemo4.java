package firstproject;

import java.io.*;

public class FileDemo4 {

	public static void main(String[] args) {
		File f=new File("C:/Users/nexwave/Desktop/ClassroomTraining/MyFile2");
		if(f.isDirectory()) {
			System.out.println("This is a folder");
		}
		else if(f.isFile()) {
			System.out.println("This is a file");
		}
		
		if(f.canRead()) {
			System.out.println("This is a readable file");
		}
		
		if(f.canWrite()) {
			System.out.println("This is a writable file");
		}
		else {
			System.out.println("This is not a writable file");
		}
	}

}
