import java.util.*;
class Inputmatrix{
	Scanner s=new Scanner(System.in);
	void matrix() {
	int row,column;
	System.out.println("Enter the no. of row and column of both matrix to which you want add ");
	 row=s.nextInt();
	 column=s.nextInt();
	int a[][]=new int [row][column];
	int b[][]=new int [row][column];
	int c[][]=new  int [row][column];
		 System.out.println("Enter the element of first "+row+"*"+column+"matrix");
		for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			a[i][j]=s.nextInt();
		}
		}
		 System.out.println("Enter the element of second "+row+"*"+column+"matrix");
		for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			b[i][j]=s.nextInt();
		}
		}
			
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
			c[i][j]=a[i][j]+b[i][j];
				}}	
				for(int i=0;i<row;i++) {
					for(int j=0;j<column;j++) {
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
			}System.out.println("+");
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
		}System.out.println("=");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
 }
	 }}
	

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inputmatrix m=new Inputmatrix();
		m.matrix();
	}

}
