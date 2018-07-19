package firstproject;

public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country[]= {"India", "Afghanisthan", "Albania"};
		String capital[]= {"Dheli", "Kabul", "Tirana"};
		int pos=0;
		String cap;
		for(int i=0; i<country.length; i++) {
			if(country[i].equals("Albania")) {
				pos=i;
			}
		}
		System.out.println("Capital is "+capital[pos]);
	}

}
