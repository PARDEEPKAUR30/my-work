import java.util.Scanner;

class inputdata {
	int n;
	public void setvalue(int m) {
	n=m;	
	}
	public int getvalue() {
	return n;	
	}
}
public class Mdimarray {

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
inputdata a[][]=new inputdata[2][3];
inputdata b[][]=new inputdata[3][2];
System.out.println("enter a 2*3 matrix");
for(int i=0;i<2;i++) {
	for(int j=0;j<3;j++) {
		
		 a[i][j]=new inputdata();
		int value=s.nextInt();
		a[i][j].setvalue(value);
	 System.out.print(a[i][j].getvalue()+" ");
}
System.out.println();
	}
System.out.println("enter a 3*2 matrix");
for(int i=0;i<3;i++) {
	for(int j=0;j<2;j++) {
		
		 b[i][j]=new inputdata();
		int value=s.nextInt();
		b[i][j].setvalue(value);
	 System.out.print(b[i][j].getvalue()+" ");
}
System.out.println();
	}

s.close();
}}
