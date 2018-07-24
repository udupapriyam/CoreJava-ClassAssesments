package firstproject;

public class EnumExample {
	enum weekday {sunday,monday,tuesday,wednesday,thursday,friday,saturday};
	
	public static void main(String[] args) {
		weekday[] w=weekday.values();
		for(weekday w1:w) {
			System.out.println(w1);
		}
		System.out.println(weekday.sunday);
		
		weekday w2;
		w2=weekday.monday;
		if(w2==weekday.monday) {
			System.out.println("Weekend ends");
		}
		else {
			System.out.println("Weekend comming soon");
		}
	}

}
