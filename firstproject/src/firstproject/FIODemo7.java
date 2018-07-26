package firstproject;

import java.io.*;

public class FIODemo7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fo=new FileOutputStream("C:\\Users\\nexwave\\Desktop\\ClassroomTraining\\File6.txt");
		DataOutputStream dos=new DataOutputStream(fo);
		
		String line=null;
		System.out.println("Enter a line");
		line=br.readLine();
		
		while(!(line.equalsIgnoreCase("STOP"))) {
			dos.writeBytes(line+"\r\n");
			System.out.println("Enter a line");
			line=br.readLine();
		}
		System.out.println("File created");
		
	}

}
