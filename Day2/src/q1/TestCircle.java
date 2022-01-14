package q1;

class Circle{
	private double radius=1.0;
	private String color="red";
	
	Circle(){}
	Circle(double radius){
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return (double)(radius * radius * 3.14);
	}
}
public class TestCircle {
	public static void main(String[] args) {
		Circle circle=new Circle();
		System.out.println("Area : " + circle.getArea());
		System.out.println("Radius : " + circle.getRadius());
	}
}
