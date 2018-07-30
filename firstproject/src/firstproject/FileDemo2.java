package firstproject;
import java.io.*;
public class FileDemo2 {

	public static void main(String[] args) {
		File f=new File("C:/Users/nexwave/Desktop/ClassroomTraining/MyFolder1");
		boolean created=f.mkdir();
		if(created==true) {
			System.out.println("Folder created succesfully");
		}
		else {
			System.out.println("Folder not created");
		}
	}

}
