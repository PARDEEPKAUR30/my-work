class  FindArea{
	void area() {
		System.out.println("Are you want to find area?");
	}
	void area(float c) {	
		System.out.println("Area of circle is: "+3.14*c*c);
	}
	void area(float l,float b,float h) {
		System.out.println("Area of rectangle is: "+l*b*h);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FindArea a=new FindArea();
a.area();
a.area(3.0f);
a.area(2.0f,3.0f,1.0f);
	}

}
