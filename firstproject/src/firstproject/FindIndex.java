package firstproject;

public class FindIndex {

	public static void main(String[] args) {
		String name="Sanjayaauua";
//		for(int i=0; i<name.length(); i++) {
//			if(name.charAt(i)=='a') {
//				System.out.println(i);
//			}
//		}
		int index=name.indexOf('a', 0);
		for(int i=0; i<name.length(); i++) {
			if(index==-1) {
				break;
			}
			System.out.println(index);
			index++;
			index=name.indexOf('a', index);
		}
	}

}
