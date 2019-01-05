package assignment7;
import java.util.Scanner;

public class CountNoOfWords {
public static void main(String arg[]) {
	Scanner s= new Scanner(System.in);
	String string;
	char temp;
	int count=1;
	System.out.println("Enter the string: ");
	string=s.nextLine();
	
	for(int i=0;i<string.length();i++) {
		temp=string.charAt(i);
		if(temp==' ') {
			count=++count;
		}
	}
	System.out.println("The total number of words in the given sentence are: "+count);
}
}
