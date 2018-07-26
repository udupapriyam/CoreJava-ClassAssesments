package firstproject;

import java.io.*;

public class FIODemo2 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("file1.txt");
		BufferedReader br=new BufferedReader(fr);
		
		int flag=0;
		String line=br.readLine();
		while(line!=null){
			System.out.println(line);
			if(line.contains("java")) {
				flag=1;
				break;
			}
			
			line=br.readLine();
		}
		System.out.println();
		if(flag==1)
			System.out.println("Success");
		else
			System.out.println("Word not found");
		
		fr.close();
	}

}
