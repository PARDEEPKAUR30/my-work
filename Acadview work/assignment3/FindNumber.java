package assignment3;
public class FindNumber {
public static void main(String arg[]) {
	int A[]= {1,4,6,7,8,9,10};
	boolean b=false;
	for(int i=0;i<7;i++) {
		if(A[i]==Integer.parseInt(arg[0])) {
		System.out.println("Number is present in the given array.");
		b=true;
		}}
	if(b!=true) {
		System.out.println("Number is not present in the given array.");}
}
}
