package firstproject;

public class StringExample {

	public static void main(String[] args) {
		String usname="Priyamvada";
		String pswd="Deloitte";
		if(usname.equals(args[0]) && pswd.equals(args[1])) {
			System.out.println("Valid user");
		}
		else {
			System.out.println("Invalid user");
		}
	}

}
