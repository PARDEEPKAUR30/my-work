package assignment4;
import java.util.Scanner;
public class Rectangle {
	Scanner s=new Scanner(System.in);
double l,b;
Rectangle(){
	System.out.println("Enter the length of the rectangle: ");
	l=s.nextDouble();
	System.out.println("Enter the breath of the rectangle: ");
	b=s.nextDouble();
}
Rectangle(double l,double b){
	this.l=l;
	this.b=b;
}
Rectangle(double v){
	this.l=this.b=v;
}

double CalculateArea(){
 return (l*b);
}
}
