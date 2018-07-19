package firstproject;

public class CommandLinePrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("you passed "+args.length+" arguments");
		System.out.println("Argumnts are");
		for(int i=0; i<args.length; i++) {
			System.out.print(args[i]+" ");
		}
	}

}
