package assignment4;
import java.util.Scanner;

public class SecondLargestNumber {
public static void main(String arg[]) {
	int a[]=new int[10];
	int largest=0,secondl=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the 10 integer numbers for the array: ");
	for(int i=0;i<10;i++) {
		a[i]=s.nextInt();
	}
	
	System.out.println("The elements of the given array are: ");
	System.out.print("a={ ");
	for(int i=0;i<10;i++) {
		System.out.print(a[i]);
		if(i==9) {
			continue;}
		System.out.print(", ");
	}
	System.out.println(" }");
	 largest=a[0];
	 secondl=0;
	for (int i=1;i<10;i++) {
		if(largest<a[i]) {
			secondl=largest;
			largest=a[i];
		}
		else {
			if (secondl<a[i]) 
		secondl=a[i];}
		
		//System.out.println(i +":"+largest +","+secondl);		
		}
	
	
	//System.out.println(largest);
	System.out.println("The second largest number in the given array is: "+secondl);
}
}
