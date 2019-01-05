package assignment4;

import java.util.Scanner;
public class ElementsInWaveform {
public static void main(String arg[]) {
	int a[]=new int[10];
	int temp;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the 10 integer numbers for the array: ");
	for(int i=0;i<10;i++) {
		a[i]=s.nextInt();
	}
	System.out.println("The elements of the given array are: ");
	System.out.print("a={ ");
	for(int i=0;i<10;i++) {
		System.out.print(a[i]);
		if(i==9) {
			continue;}
		System.out.print(", ");
	}
	System.out.println(" }");
	for(int i=0;i<9;) {
		temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
		i=i+2;
		}
	System.out.println("The elements of the array arranged in a waveform: ");
	System.out.print("a={ ");
	for(int i=0;i<10;i++) {
		System.out.print(a[i]);
		if(i==9) {
			continue;}
		System.out.print(", ");
	}
	System.out.println(" }");
}
}