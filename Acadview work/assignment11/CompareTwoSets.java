package assignment11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CompareTwoSets {
public static void main(String arg[]) {
	Scanner in=new Scanner(System.in);
	 int element,no,limit=0;	
	 Set<Integer> s1= new HashSet<>();
	 Set<Integer> s2= new HashSet<>();
	Set<Integer> intersect= new HashSet<>();
	
	 System.out.println("Enter the numbers of elemets you want to enter in the set1: ");
		no=in.nextInt();
		if(limit<no) {
			limit=no;}
		System.out.println("Enter the "+no+" Integer elements that you want to enter in the set1: ");
		for(int j=1;j<=no;j++) {
			element=in.nextInt();
		s1.add(element);}
		
		 System.out.println("Enter the numbers of elemets you want to enter in the set2: ");
			no=in.nextInt();
			if(limit<no) {
				limit=no;}
			System.out.println("Enter the "+no+" Integer elements that you want to enter in the set2: ");
			for(int j=1;j<=no;j++) {
				element=in.nextInt();
			s2.add(element);}

   intersect.addAll(s1);
   intersect.retainAll(s2);
   System.out.println("The elements which are same on both sets are: ");
	   System.out.println(intersect);
	   
   }}