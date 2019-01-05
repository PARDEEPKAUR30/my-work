import java.util.*;
class tri1{
	int a,b,c;
	Scanner s=new Scanner(System.in);
	void values() {
		System.out.println("Enter the values of 3 angle of triangle");
		 a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
	              }
	void angle() {
		if((a+b+c)==180) {
		if(a==b&&b==c)
			System.out.println("it is an Equilateral triangle");
		else if(a>90||b>90||c>90)
			System.out.println("it is an Obtuse triangle");
		else if(a==90||b==90||c==90)
			System.out.println("it is a Right angle triangle");
		else 
			System.out.println("it is an Acute triangle");
	           }
		else
			System.out.println("Wrong Input");
	}}

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tri1 t1= new tri1();
        t1.values();
        t1.angle();
	}

}
