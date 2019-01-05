package assignment2;

public class PrimeNumber {
public static void main(String arg[]) {
int n=137;
boolean b=true;
for(int i=2;i<10;i++) {
	if(n%i==0) {
		System.out.println("The given number "+n+" is not a prime number.");
		b=false;
		break;
		}}
if(b==true)
System.out.println("The given number "+n+" is a prime number.");
}
}	

