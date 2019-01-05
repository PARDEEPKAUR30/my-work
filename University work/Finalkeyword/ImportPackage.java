package Finalkeyword;

import arithematicpackage.Addition;
import java.util.*;

public class ImportPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,result;
		boolean loop=true;
		Scanner s=new Scanner(System.in);
		Addition ad=new Addition();
do {		
System.out.println("Enter two integer number to which you want to find addition:");
System.out.print("m= ");
try {
m=s.nextInt();
System.out.print("n= ");
n=s.nextInt();
result=ad.add(m,n);
System.out.print("Sum of "+m+" and "+n+" is: "+result);
loop=false;
}
catch(InputMismatchException ie) {
	s.nextLine();
	System.out.println("You must enter only Integer values. Please try again.");
	}}while(loop);
}

}
