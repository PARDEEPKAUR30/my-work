package assignment4;
import java.util.Scanner;
public class Complex {
	Scanner s=new Scanner(System.in);
	int real,imaginary;
	Complex(){
		System.out.println("Enter the Integer value for the real part of the Complex number: ");
	real=s.nextInt();
	System.out.println("Enter the Integer value for the imaginary part of the Complex number: ");
	imaginary=s.nextInt();}

Complex(int real,int imaginary){
	this.real=real;
	this.imaginary=imaginary;
	}
void Display(){
	System.out.println("The given Complex number is: "+real+"+"+imaginary+"i");	
}
}