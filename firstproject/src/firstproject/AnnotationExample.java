package firstproject;

@interface MyAnnotation {

}

@interface MyAnnotaion2 {
	int empid();
	String empname();
}

public class AnnotationExample {
	@MyAnnotation
	public void method1() {

	}

	@MyAnnotaion2(empid = 101, empname = "Priya")
	public void method2() {

	}

	public static void main(String[] args) {

	}

}
