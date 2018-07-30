package firstproject;

class places implements Cloneable{
	String name;
	String country;
	long population;
	
	public places(String name,String country, long population) {
		super();
		this.name=name;
		this.country=country;
		this.population=population;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class CloningDemo {

	public static void main(String[] args) {
		places p1=new places("Mumbai","India",12457896);
		System.out.println(p1);
		
		//how to make a copy
		places p2=null;
		try {
			p2=(places)p1.clone();
		}
		catch(CloneNotSupportedException e) {
			System.out.println("clonning is not available for this object");
			e.printStackTrace();
		}
		
		p1.country="USA";
		System.out.println(p1.country);
		System.out.println(p2.country);
	}

}
