import java.util.*;
abstract class Shape{
	abstract void area();	
}
class Rectangle extends Shape{
	double l,b,h;
	void get_dimenisions() {
		Scanner s=new Scanner(System.in);
		System.out.println("Give length,breadth and hight:");
		l=s.nextDouble();
		b=s.nextDouble();
		h=s.nextDouble();
	}
	void area() {
		System.out.println("Area of Rectangle is "+l*b*h);
	}
}
public class ConcreetAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r=new Rectangle();
r.get_dimenisions();
r.area();
	}

}
