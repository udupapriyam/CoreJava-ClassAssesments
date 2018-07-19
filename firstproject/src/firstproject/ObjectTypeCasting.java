package firstproject;

class A{
	int a=55;
	public int returna() {
		return this.a;
	}
}

class B extends A{
	int b=25;
	int a=5;
}

class C extends B{
	int c=75;
}
public class ObjectTypeCasting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1=new C();
		System.out.println(c1.a);
		System.out.println(c1.returna());
		System.out.println(((A)c1).a);
	}

}
