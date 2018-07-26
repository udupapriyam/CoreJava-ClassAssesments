package firstproject;
import java.io.*;
public class FIODemo3 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo=new FileOutputStream("C:\\Users\\nexwave\\Desktop\\ClassroomTraining\\File2.txt");
		fo.write('h');
		fo.write('e');
		fo.write('l');
		fo.write('l');
		fo.write('o');
		fo.close();
		System.out.println("File created");
	}

}
