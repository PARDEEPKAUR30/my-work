package assignment12;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class MyList {
	int age;
	String name;
 public MyList(String name, int age) {
	this.name=name;
	this.age=age;
}
}
 
 class SortByAge implements Comparator<MyList>{
	 public int compare(MyList o1, MyList o2){
		if(o1.age<o2.age) {
			return -1;
			}
			else
				return 1;
		}
 }
 
 class SortByName implements Comparator<MyList>{
	 public int compare(MyList o1, MyList o2){
		return (o1.name.compareTo(o2.name));
		}
 }
 
public class SortstheList {
public static void main(String arg[]) throws IOException{
	ArrayList<MyList> list=new ArrayList<>();
	Scanner scan=new Scanner(System.in);
	String n;
	int a;
	boolean b=true;
try {
	while(b==true) {
		System.out.println("Enter the name: ");
		//n=scan.nextLine();
		n=scan.next();
		System.out.println("Enter the age: ");
		a=scan.nextInt();
	list.add(new MyList(n,a));
	System.out.println("Please enter anyone option from following:");
	System.out.println("1. Enter 'true' if you want to add more data.");
	System.out.println("2. Enter 'false' if you don't want to add more data.");
	b=scan.nextBoolean();

	}}
catch(InputMismatchException in) {
	System.out.println("You entered the wrong data.");
}
catch(Exception e) {
		System.out.println("Error has occured in the code.");
	}
finally {
	
	SortByAge sa=new SortByAge();
	Collections.sort(list, sa);
	System.out.println("Data sorted according to age:");
	for(int i=0;i<list.size();i++) {		
		System.out.println(list.get(i).name+" "+list.get(i).age);
	}
	
	SortByName sn=new SortByName();
	Collections.sort(list, sn);
	System.out.println("Data sorted according to name:");
	for(int i=0;i<list.size();i++) {		
		System.out.println(list.get(i).name+" "+list.get(i).age);
	}}
}}