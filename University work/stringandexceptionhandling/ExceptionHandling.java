package stringandexceptionhandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling {
	public static int calculation(int n, int d) throws ArithmeticException 
	{
		return n/d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean c_loop=true;
do {
try {		
System.out.println("Please enter an integer numinator: ");
int num=s.nextInt();
System.out.println("Please enter an integer denominator: ");
int den=s.nextInt();
int result=calculation(num,den) ;
System.out.println("Result is: "+result);
c_loop=false;
}
catch(InputMismatchException ie) {
	System.out.println("Exception: "+ie);
	s.nextLine();
	System.out.println("you must enter an integer. Please try again");
}
catch(ArithmeticException ae) {
	System.out.println("Exception: "+ae);
	System.out.println("Zero is an invalid denominator. Please try again");
}
}while(c_loop);
	}

}
