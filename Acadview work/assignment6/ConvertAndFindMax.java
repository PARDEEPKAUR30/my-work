package assignment6;
import java.util.Scanner;

class FindMaximum{
	String a,b;
	Scanner s=new Scanner(System.in);
	FindMaximum(){
	System.out.println("Enter the two integer numbers: ");
	a=s.nextLine();
	b=s.nextLine();
	}
	int maximum() {
		int a,b;
		a=Integer.parseInt(this.a);
		b=Integer.parseInt(this.b);
		if(a>b) {
			return a;
		}
		else 
			return b;
	}
}

public class ConvertAndFindMax {
public static void main(String arg[]) {
	FindMaximum max=new FindMaximum();
	System.out.println("The maximum number between "+max.a+" and "+max.b+" is: "+max.maximum());
}
}
