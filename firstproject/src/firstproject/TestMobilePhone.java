package firstproject;

public class TestMobilePhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone mp=new MobilePhone();
		
		mp.brandName="Motorola";
		mp.color="White";
		mp.price=13500;
		mp.resolution=100;
		
		double dis=mp.discount();
		System.out.println(dis);
		
		MobilePhone mp1=new MobilePhone();
		
		mp1.brandName="Samsung";
		mp1.color="White";
		mp1.price=15000;
		mp1.resolution=80;
		
		double dis1=mp1.discount();
		System.out.println(dis1);
	}

}
