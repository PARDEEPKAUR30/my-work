package assignment2;

public class ReverseOfNumber {
public static void main(String arg[]) {
	int number=13457;
	int result=0,r=number;
	for(int i=0;r!=0;i++) {
		result=result*10+r%10;
		r=r/10;
	}
	System.out.println("The reverse of the given number "+number+" is "+result);
}
}
