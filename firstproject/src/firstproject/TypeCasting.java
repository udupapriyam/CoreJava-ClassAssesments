package firstproject;

class employee1{
	
}

class HR extends employee1{
	
}

class technical extends employee1{
	
}

class recruiter extends HR{
	
}

class financer extends HR{
	
}

class javaPM extends technical{
	
}

class mainframePM extends technical{
	
}

public class TypeCasting {

	public static void main(String[] args) {
		//upcasting
		technical t1=new technical();
		HR h1=new HR();
		employee1 e1=new employee1();
		employee1 e2=new mainframePM();
		
		//downcasting
		technical t2=new javaPM();
		if(t1 instanceof javaPM) {
			javaPM jp=(javaPM)t1;
		}
	}

}
