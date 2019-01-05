package exceptionhandling;
import java.util.*;
class UserException extends Exception{
	public UserException(String s) {
		super(s);
	}
}
public class UserDefinedException  {
	public static void display(int n)throws UserException
	{
		System.out.println("Entered integer is : "+n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
Scanner s=new Scanner(System.in);
boolean c_loop=true;
do {
try {		
	System.out.println("Enter an integer: ");
	i=s.nextInt();
	 if(i>10) {
		 throw new UserException("value can't exceed 10");
		 }
 display(i) ;
 c_loop=false;

 }
catch(UserException ae) {
	System.out.println("Exception: "+ae);
	s.nextLine();
	System.out.println("you must enter an integer upto 10 only . Please try again");
}
}while(c_loop);
	}

}
