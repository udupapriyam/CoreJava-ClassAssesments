package firstproject;

public class ChracterWraperClass {

	public static void main(String[] args) {
		String company="Deloitte works for 9 hours *";
		char carray[]=company.toCharArray();
		for(int i=0; i<carray.length; i++) {
			char x=carray[i];
			if(Character.isDigit(x))
				System.out.println(x+" is digit");
			else if(Character.isLetter(x))
				System.out.println(x+" is letter");
			else if(Character.isWhitespace(x))
				System.out.println(x+" is blank");
			else
				System.out.println(x+" is special character");
		}
	}

}
