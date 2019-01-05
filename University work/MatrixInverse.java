import java.util.*;
class Matrixinput{
	Scanner s=new Scanner(System.in);
 void matrix() {
	System.out.println("Enter the no. of Row and Column of matrix");
	int row=s.nextInt();
	int column=s.nextInt();
	System.out.println("Enter the element in "+row+"*"+column+" matrix");
	int a[][]=new int[row][column];
	for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			
			a[i][j]=s.nextInt();
		}
	}
	int b[][]=new int[column][row];
	for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			b[j][i]=a[i][j];
			
	       }}
	System.out.println("inverse of ");
	for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			System.out.print(a[i][j]+" ");

		}System.out.println();
	}System.out.println(" is");
	for(int i=0;i<column;i++) {
		for(int j=0;j<row;j++) {
			System.out.print(b[i][j]+" ");
		}
		System.out.println();}
	}
}
public class MatrixInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Matrixinput m=new Matrixinput();
m.matrix();
	}

}
