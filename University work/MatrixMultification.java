 import java.util.*;

class matrix{
	int a[][]=new int[2][3];
	int b[][]=new int[3][2];
	int c[][]=new int[2][2];
	Scanner s=new Scanner(System.in);
	void array() {		
System.out.println("Enter a 2*3 matrix");
for(int i=0;i<2;i++) {
	for(int j=0;j<3;j++) {
		int n=s.nextInt();
		a[i][j]=n;
	}	
	}

System.out.println("Enter a 3*2 matrix");

for(int i=0;i<3;i++) {
   for(int j=0;j<2;j++) {
	 int n=s.nextInt();
	  b[i][j]=n;
}
} 
for(int i=0;i<2;i++) {
	for(int j=0;j<3;j++) {
		System.out.print(a[i][j]+ " ");
	}
	System.out.println();
	}

System.out.println("*");
for(int i=0;i<3;i++) {
   for(int j=0;j<2;j++) {
	 System.out.print(b[i][j]+" ");
	 }
   System.out.println();
} 
System.out.println("=");
int sum=0, mul;
for(int i=0;i<2;i++) {
	for(int k=0;k<2;k++) {
       for(int j=0;j<3;j++) {
    	   mul=a[i][j]*b[j][k];
    	    sum=sum+mul;
       }
       c[i][k]=sum;
   	System.out.print(c[i][k]+" ");
       sum=0;
}System.out.println();
}}}
public class MatrixMultification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		matrix m=new matrix();
		m.array();
	}

}
