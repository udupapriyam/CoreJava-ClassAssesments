package firstproject;

public class TestBand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Band b1=new Band();
		Band b2=new Band();
		
		String[] singers= {"a","b","c"};
		String[] guitarists= {"a1","b1","c1"};
		b1.setBandDetails("Solo", singers, guitarists, "Gov", "Balram");
		b1.printBandDetails();
		
		String[] singers1= {"e","f","g"};
		String[] guitarists1= {"e1","f1","g1"};
		b1.setBandDetails("Roll", singers1, guitarists1, "Fun", "XYZ");
		b1.printBandDetails();
		
		System.out.println("Total members = "+b1.countNoArtists());
	}
 
}
