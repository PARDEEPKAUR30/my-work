package assignment5;
import java.util.Scanner;
class CreateStaticBlock{
	Scanner s= new Scanner(System.in);
	static int a;
	int b,sum;
	CreateStaticBlock(){
		System.out.println("Enter the integer value for a static variable a: " );
		a=s.nextInt();
		System.out.println("Enter the integer value for variable b: " );
		b=s.nextInt();
	    }
	
	void sum() {
		System.out.println("The Sum of a and b is Sum=: "+ (a+b));
		}
	static {
		System.out.println("The static block starts here.");
		System.out.println("Here initialize the value of the static variable a.");
		a=10;
		System.out.println("The value of the static variable a is: a="+a);
		System.out.println("The static block ends here.");
		}
}
public class StaticBlocks {
public static void main(String arg[]) {
	CreateStaticBlock stat=new CreateStaticBlock();
	stat.sum();
	CreateStaticBlock stat2=new CreateStaticBlock();
	stat2.sum();
	
}
}
