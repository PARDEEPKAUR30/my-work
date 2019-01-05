package assignment12;

import java.util.Scanner;

class GenericPrint<print>{
	print obj;
	public GenericPrint(print value) {
		obj=value;
	}
   void PrintFunction() {
		System.out.println(obj);
	}
}
public class GenericPrintFunction {
public static void main(String arg[]) {
Scanner scan=new Scanner(System.in);
	GenericPrint p=new GenericPrint(1);
	p.PrintFunction();
	GenericPrint p1=new GenericPrint(1.56f);
	p1.PrintFunction();
	GenericPrint p2=new GenericPrint(567.98);
	p2.PrintFunction();
	GenericPrint p3=new GenericPrint("Hello Acadview");
	p3.PrintFunction();
	GenericPrint p4=new GenericPrint('c');
	p4.PrintFunction();
	System.out.println("Please enter the data that you want to print:");
	String st=scan.nextLine();
	GenericPrint g=new GenericPrint(st);
	g.PrintFunction();
}
}
