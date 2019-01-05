import java.util.*;
class digit{
	Scanner s= new Scanner(System.in);
	void loop() {
		System.out.println("Enter a number");
		int n=s.nextInt();
		int sum=0;
		while(n!=0) {
			sum= sum+n%10;
			n=n/10;
		}
		System.out.println("Sum if digit of given number is "+sum);
	}
}
public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		digit d=new digit();
			d.loop();

	}

}
