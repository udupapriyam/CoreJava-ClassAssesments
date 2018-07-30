package firstproject;
import java.io.*;
public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:/Users/nexwave/Desktop/ClassroomTraining/MyFile2");
		if(f.exists()) {
			System.out.println("File Exists");
			boolean dstatus=f.delete();
			if(dstatus) {
				System.out.println("File deleted successfully");
			}
			else {
				System.out.println("Somebody deleted the file");
			}
		}
		else {
			System.out.println("File does not exist");
			boolean cstatus=f.createNewFile();
			if(cstatus) {
				System.out.println("File created successfully");
			}
			else {
				System.out.println("File not created");
			}
		}
	}

}
