package assignment11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MySets {
	public static void main(String arg[]) {
		Scanner in=new Scanner(System.in);
		 int element,no,limit=0,sn;	
		Set<Integer> intersect= new HashSet<>();
		
		 System.out.println("How many Sets you want to create: ");
		 sn=in.nextInt();
	   for(int i=1;i<=sn;i++) {
			 Set<Integer> si= new HashSet<>();
		 System.out.println("Enter the numbers of elemets you want to enter in the set "+i+": ");
			no=in.nextInt();
			if(limit<no) {
				limit=no;}
			System.out.println("Enter the "+no+" Integer elements that you want to enter in the set "+i+": ");
			for(int j=1;j<=no;j++) {
				element=in.nextInt();
			si.add(element);}
	   }
}}
