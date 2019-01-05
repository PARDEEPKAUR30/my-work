import java.util.Scanner;
class poly{
	Scanner s= new Scanner(System.in);
	void loop() {
		System.out.println("Enter a number");
		int n=s.nextInt();
				int m=0;
				int q=n;
				while(q!=0) {
			int r= q%10;
			q=q/10;
			 m=m*10+r;
		}
				if(n==m)
		System.out.println("The given number is a Polydrom");
				else
					System.out.println("The given number is not a Polydrom");
	}
}
public class Polydrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
poly p=new poly();
p.loop();
	}

}
