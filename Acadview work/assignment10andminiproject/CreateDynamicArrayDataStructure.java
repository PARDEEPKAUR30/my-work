package assignment10andminiproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CreateDynamicArrayDataStructure {
public static void main(String arg[]) throws InputMismatchException,IOException{
	boolean b=true,p=true;
	int element;
	DynamicArray mylist=new DynamicArray();
	try {
		System.out.println("Please enter the 10 integer elements in the arraylist: ");
		for(int i=0;i<10;i++) {
		element=mylist.scan.nextInt();
		mylist.add(element);}
	while(b==true) {	
		System.out.println("1. Enter 'true' if you want to add more element in the arraylist." );
		System.out.println("2. Enter 'false' if you don't want to add more element in the arraylist." );
		System.out.println("Please enter your option: ");
		b=mylist.scan.nextBoolean();
		if(b==true) {
		System.out.println("Enter the element you want to add in the arraylist: ");
		element=mylist.scan.nextInt();
		mylist.add(element);}
		//System.out.println("length of the array now: "+mylist.array.length);
	System.out.println("1. Enter 'true' if you want to print the elements of the arraylist." );
	System.out.println("2. Enter 'false' if you don't want to print the elements of the arraylist." );
	System.out.println("Please enter your option: ");
	p=mylist.scan.nextBoolean();
	//System.out.println("Here you add "+element+" into the arraylist.");
	if(p==true) {
	mylist.printArrayElements();
	}
	}
	System.out.println("Enter the element you want to remove from the arraylist: ");
	element=mylist.scan.nextInt();
	mylist.delete(element);
	mylist.printArrayElements();
}catch(InputMismatchException ie) {
	System.out.println("Please enter the valid data type for given options.");
}
	catch(Exception e) {
		System.out.println("Error has occured in the code.");
	}
	finally{
		System.out.println("The elements of the arraylist are: ");
		mylist.printArrayElements();
	}
}}
