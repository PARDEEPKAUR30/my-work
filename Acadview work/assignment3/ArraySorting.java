package assignment3;

public class ArraySorting {
public static void main(String arg[]) {
	int A[]= {1,1,1,1,0,0,1,0};
	int B;
	for(int i=0;i<8;i++) {
		for(int j=i+1;j<8;j++) {
			if(A[i]>A[j]) {
				B=A[i];
				A[i]=A[j];
				A[j]=B;
				}}
		}
	System.out.println("The sorted array is: ");
	System.out.print("A={");
	for(int z=0;z<8;z++) {
		System.out.print(A[z]);
		if(z==7) {
		continue;}
		System.out.print(", ");}
	System.out.println("}");
}
}
