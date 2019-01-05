package assignment3;

public class PrimeNumbers {
public static void main(String arg[]) {
	int number=Integer.parseInt(arg[0]);
	boolean b;
	System.out.println("The all Prime numbers upto "+number+" are:");
	for(int i=3;i<=number;i++) {
		 b=true;
	inner:for(int j=2;j<10;j++) {
			if((i%j==0)&&(i!=j)) {
				b=false;
				break inner;}
		}
		if(b==true)
			System.out.print(i+" ");
		}
	}
}
