package assignment7;
import java.util.Scanner;

public class CheckOccurrence {
public static void main(String arg[]) {
	String string1, string2, temp;
	boolean b=true;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the string: ");
	string1=s.nextLine();
	System.out.println("Enter the another string for that's you want to check the occurence in previous entered string: ");
	string2=s.nextLine();
	int length=string1.length();
	outer:for(int i=0;i<length;i++) {
	  inner: for (int j=length;j>i;j--){	
		  temp=string1.substring(i,j);
		  if(string2.compareTo(temp)==0) {
			System.out.println("The string '"+string2+"' is occuured in the string '"+string1+"'.");
		    b=false;
		    break outer;}
	   }
	  }
	if (b==true) {
		System.out.println("The string '"+string2+"' is not occuured in the string '"+string1+"'.");
	  }
}
}
