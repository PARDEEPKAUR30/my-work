package exceptionhandling;
import java.util.*;
class InputData{
	Scanner s=new Scanner(System.in);
	private String name;
	private int age;
	int l;
	InputData(){
		do {l=0;
			try {
		System.out.println("Enter your Name: ");
		String n=s.next();
		name=n;
		System.out.println("Enter your Age: ");
		int i=s.nextInt();
		age=i;
		//throw new InputMismatchException("Input Mismatch");
		
		//throw new InputMismatchException("Input Mismatch");
		}
			catch(InputMismatchException e) {
				System.out.println("Exception: "+e);
				System.out.println("You entered the wrong input.");
				System.out.println("Please make sure that enter NAME in string and AGE in integer.");
				System.out.println("Please try again.");
				l=1;
				s.nextLine();
				//throw e;
			}}while(l==1);
	}
	void display() {
		System.out.println("Your Name is: "+name);
		System.out.println("Your Age is: "+age+"y");
	}
}

public class TryCatchBlock {

	public static void main(String[] args)throws InputMismatchException 
	{
		// TODO Auto-generated method stub
InputData id=new InputData();
id.display();
	}

}
