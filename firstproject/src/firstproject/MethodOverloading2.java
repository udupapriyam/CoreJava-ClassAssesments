package firstproject;

class Circle{
	double radius;
}
class Triangle{
	double base,height;
}
class Square{
	double side;
}

class Shape{
	public double calculateArea(Circle c) {
		return 3.14*c.radius*c.radius;
	}
	public double calculateArea(Triangle t) {
		return 0.5*t.base*t.height;
	}
	public double calculateArea(Square s) {
		return s.side*s.side;
	}
}

public class MethodOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sh=new Shape();
		
		Circle c=new Circle();
		c.radius=21;
		
		Triangle t=new Triangle();
		t.base=10;
		t.height=15;
		
		Square s=new Square();
		s.side=5;
		
		System.out.println("Area of circle = "+sh.calculateArea(c));
		System.out.println("Area of triangle = "+sh.calculateArea(t));
		System.out.println("Area of square = "+sh.calculateArea(s));
	}

}
