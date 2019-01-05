package assignment10andminiproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class DynamicArray extends ArrayList{
		static Scanner scan=new Scanner(System.in);
		int array[]=new int[10];
		public int length=array.length;
		int temp[];
			
		public int increasingLength() {
			int l=(int)((array.length)*1.5);
			return l;
		}
		
	public void add(int a) {
		outer:for (int i=0;i<array.length;i++) {
			 if((array[i]!=0)&&(i==array.length-1)) {
				 length=array.length;
				 temp=new int[array.length];
				 for(int j=0;j<array.length;j++) {
						temp[j]=array[j];}
				 array=new int[increasingLength()];
					System.out.println("**Now length of the array after increasing by 1.5 is: "+array.length);
				    for(int j=0;j<length;j++) {
							array[j]=temp[j];
							//System.out.println(array[j]);
							}
				    array[length]=a;
				    //System.out.println("length:"+length+"new added element: "+a);
				    break outer;}
		
			 if(array[i]==0) {
		    	array[i]=a;
		    	break outer;}
				 
	}}
	public void delete(int r) {
		temp=new int[array.length];
		int j=0;
		for(int i=0;i<array.length;i++) {
			 if(array[i]==r) {
				 i=i+1;
				 temp[j]=array[i];
				 j=++j;
				 
			 }else {
				 
				 temp[j]=array[i];
			 j=++j;}}
		for(int i=0;i<array.length;i++) {
				 array[i]=temp[i];
		}
	}

	void printArrayElements() {
		//System.out.print("Here i am printing the elements of the array: ");
		System.out.print("[");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		if(i==array.length-1) {
			continue;
			}
		System.out.print(", ");}
		System.out.println("]");
		}
	}

