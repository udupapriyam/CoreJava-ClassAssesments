package firstproject;

class Animal   {
	public   void speak() {
		System.out.println("No   specified souud available...");
	}
}

class Cat extends Animal {
	@Override
	public void speak() {
		System.out.println("  Meowww");
	}
}

class Dog extends Animal {
	@Override
	public void speak() {
		System.out.println("Barks");
	}
	
	public static void main() {
		
	}
}

