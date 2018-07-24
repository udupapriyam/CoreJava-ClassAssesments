package firstproject;

public class CMDargProgram {

	public static void main(String[] args) {
		String s=args[0];
		int count=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='C' || s.charAt(i)=='c') {
				count=count+1;
			}
		}
		System.out.println("Frequency = "+count);
	}

}
