package assignment4;

public class RectangleFunction {
public static void main(String arg[]) {
	Rectangle r=new Rectangle();
	//double area=r.CalculateArea();
	System.out.println("The area of the rectangle is: "+r.CalculateArea());	
	Rectangle r1=new Rectangle(4.0,5.0);
	System.out.println("The area of the rectangle is: "+r1.CalculateArea());
	Rectangle r2=new Rectangle(9.5);
	System.out.println("The area of the rectangle is: "+r2.CalculateArea());
}
}
