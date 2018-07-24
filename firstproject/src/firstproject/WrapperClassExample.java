package firstproject;

public class WrapperClassExample {

	public static void main(String[] args) {
		int k=5;
		Integer kw=new Integer(k);
		System.out.println("Highest value of integer is : "+kw.MAX_VALUE);
		
		Double dw=new Double(325.12);
		System.out.println("Highest value  : "+dw.MAX_VALUE);
		System.out.println("Highest value of exponent is : "+dw.MAX_EXPONENT);
		
		//converts object to primitive
		double d;
		d=dw.doubleValue();
		
		int n=875;
		System.out.println(Integer.toHexString(n));
		System.out.println(Integer.toOctalString(n));
	}

}
