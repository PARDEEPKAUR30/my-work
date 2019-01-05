class fib{
	void series() {
		long x=0,y=1,z=1;
		System.out.print(z+" ");
				for(int i=1;i<=50;i++) {
	        z=y+x;
	        x=y;
			y=z;
		System.out.print(z+" ");
		}
			
	}
}
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fib f1=new fib();
f1.series();
	}

}
