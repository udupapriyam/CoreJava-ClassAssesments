package firstproject;

public class PasswordValidator {

	public static void main(String[] args) {
		String pswd = "Hr#1444545";
		char carray[] = pswd.toCharArray();
		int up = 0, dg = 0, sp = 0, lw = 0, w = 0;
		for (int i = 0; i < carray.length; i++) {
			char x = carray[i];
			if (Character.isDigit(x))
				dg = dg + 1;
			else if (Character.isUpperCase(x))
				up = up + 1;
			else if (Character.isWhitespace(x))
				w++;
			else if (Character.isLowerCase(x))
				lw = lw + 1;
			else
				sp = sp + 1;
		}
		if (carray.length >= 5 && carray.length <= 10 && up >= 1 && dg >= 1 && sp >= 1 && w==0) {
			System.out.println("Valid password");
		} else {
			System.out.println("Invalid password");
		}
	}

}
