package assignment11;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class CreateHashMap {
public static void main(String arg[]) {
	Scanner in=new Scanner(System.in);
	Map<Integer,String> ht=new HashMap<>();
	int n,k;
	String v;
	try {
	System.out.println("how many  keys and values you want to enter: ");
      n=in.nextInt();
	for(int i=0;i<n;i++) {
		System.out.println("Enter the key in integer: ");
		k=in.nextInt();
		System.out.println("Enter the value in String: ");
		in.next();
		v=in.nextLine();
		ht.put(k, v);
		System.out.println(ht.values());
	}
	System.out.println(ht.values());
		//ht.put(1, "pardeep");
		//ht.put(2, "deep");
		//System.out.println(ht.values());
	}
	catch(InputMismatchException ie) {
		System.out.println("Please enter the valid input.");}
	catch(Exception e) {
		System.out.println("Error has occured in the code.");
	}
	}
}
