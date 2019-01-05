import java.util.Scanner;
public class DisplayDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int number,n,sum=0, div=100;
System.out.print("Enter a number between 100and 999:");
	 number=s.nextInt();
	 System.out.print("The three digits in the number are: ");
	 do {
	n=number/div;
	sum=sum+n;
	System.out.print(n+" ");
    number=number%div;
    div=div/10;}while(div>=1);
	 System.out.print("\nThe sum of the three digits is: "+sum);
	 
}
}
