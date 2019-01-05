package assignment3;

public class Reverse {
public static void main(String arg[]) {
	int n=Integer.parseInt(arg[0]);
	int r=n,result=0;	
	for(int i=0;r!=0;i++) {
		result=result*10+r%10;
		r=r/10;
		//System.out.println(result);
	}
	System.out.println("The reverse of the given number is "+result);

}
}
