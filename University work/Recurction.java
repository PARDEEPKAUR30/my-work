import java.util.*;
class Fabonacci{
	int n;
	Scanner s=new Scanner(System.in);
  int get_length() {
	System.out.println("Enter the number upto which you want to display Fabonacci Series");
      n=s.nextInt();
	return n;}
	int fab(int n) {
		if(n==1||n==2)
			return 1;
		else 
		return(fab(n-1)+fab(n-2));}
	void loop() {
	for(int i=1;i<=n;i++) {
		System.out.print(fab(i)+" ");}
			
}}
public class Recurction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Fabonacci f=new  Fabonacci();
		 int n=f.get_length();
		 f.fab(n);
		 f.loop();
	}

}
