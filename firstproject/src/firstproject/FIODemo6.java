package firstproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FIODemo6 {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\nexwave\\Desktop\\ClassroomTraining\\File5.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("First line");
		bw.newLine();
		bw.write("Second line");
		bw.newLine();
		bw.write("Third line");
		bw.newLine();
		bw.write("Fourth line");
		
		bw.close();
		fw.close();
		
		System.out.println("File created");
	}

}
