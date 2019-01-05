package assignment2;

public class Palindrome {
public static void main(String arg[]) {
	int n=13831;
	int p=0,r=n;
	for(int i=0;r!=0;i++) {
		p=p*10+r%10;
		r=r/10;
		//System.out.println(p);
		}
	if(n==p) {
		System.out.println("The given number "+n+" is a palindrome.");}
	else
		System.out.println("The given number "+n+" is not a palindrome.");
}
}
