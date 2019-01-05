class Input {
	 int a;
		Input(int a) {
			this.a=a*a;
			System.out.println(a);	
			System.out.println(this.a);	
	}}
public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input i=new Input(10);		
	}}
