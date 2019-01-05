import java.util.*;
class Input{
	Scanner s=new Scanner(System.in);
 void matrix() {
	System.out.println("Enter the no. of Row and Column of matrix");
	int row=s.nextInt();
	int column=s.nextInt();
	if(row==column) {
	System.out.println("Enter the element in "+row+"*"+column+" matrix");
	int a[][]=new int[row][column];
	for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			a[i][j]=s.nextInt();}}
	for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			System.out.print(a[i][j]+" ");}
		System.out.println();}
	
	int sum1=0;
			for(int i=0;i<row;i++) {
				int j=i;
				if(j<column) {
			 sum1=sum1+a[i][j];
		}
	}System.out.println("sum of first diagonal is "+sum1);
	int sum2=0;
	int j=column-1;
	for(int i=0;i<row;i++) {
		if(j>=0) {
	 sum2=sum2+a[i][j];
	} j--;
}System.out.println("sum of second diagonal is "+sum2);
int sum=sum1+sum2;
System.out.println("Total sum of both diagonals is "+sum);
	} 
	else
		System.out.println("no. of row and coulmn are not same");
		}}
public class MatrixDiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Input i=new Input();
i.matrix();
	}

}
