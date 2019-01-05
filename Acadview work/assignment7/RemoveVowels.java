package assignment7;
import java.util.Scanner;

public class RemoveVowels {
public static void main(String arg[]) {
	Scanner s=new Scanner(System.in);
	StringBuffer string=new StringBuffer("Hello Acadview ");
	StringBuffer vowels=new StringBuffer("AEIOUaeiou");
	char a,b;
	int length=string.length();
	System.out.println("The string before removing is: "+ string);
	
	for(int j=0;j<vowels.length();j++) {
	for(int i=0;i<length;i++) {
			a=string.charAt(i);
			b=vowels.charAt(j);
		if(a==b) {
			string=string.deleteCharAt(i);
			length=string.length();
		}
	}
	}
	System.out.println("The string after removing all vowels is: "+ string);
}
}
