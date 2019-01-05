package assignment3;

public class Pattern {
public static void main(String arg[]) {
	for(int i=0;i<5;i++) {
		for(int j=4;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
