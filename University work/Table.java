import java.util.*;
class tab{
	Scanner s=new Scanner(System.in);
	void input() {
	System.out.println("Enter the number, the table of which you want");
	int n=s.nextInt();
	System.out.println("Enter the number upto which you want the table of given number");
	int m=s.nextInt();
			for(int i=1;i<=m;i++) {
		int p=n*i;
		System.out.println(n+"*"+i+"="+p);
		}
	}
}
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
tab t=new tab();
t.input();
	}

}
