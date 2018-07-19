package firstproject;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sup1_sale=15000;
		double sup1_prodnum=100;
		
		double sup2_qtycost=75;
		double sup2_prodnum=115;
		double sup2_totsale=sup2_qtycost*sup2_prodnum;
		
		double diff=sup1_sale-sup2_totsale;
		double n=diff/sup2_qtycost;
		
		System.out.println(sup2_totsale);
		System.out.println(n);
		
	}

}
