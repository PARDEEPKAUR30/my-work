import java.util.*;
class na{
	Scanner s=new Scanner(System.in);
	String name;
	int age;
	String inputname() {
		name=s.next();
		return name;}
	int inputage() {
		age=s.nextInt();
	    return age;
		}
	void displayname(String n) {
		System.out.print("Name: "+n+",");
	}
	void displayage(int a) {
		System.out.println(" Age: "+a);
	}
}
public class Nameage {

	public static void main(String[] args) {
		String name[]=new String[5];
		int age[]=new int[5];
		na n1=new na();
		System.out.println("Enter the name and age of five persons");
				for(int i=0;i<5;i++) {
					System.out.println(" name and age of "+(i+1)+" person:");	
	                 name[i]=n1.inputname();
	                   age[i]=n1.inputage();
	                    }
				for(int i=0;i<5;i++) {
					n1.displayname(name[i]);
					n1.displayage(age[i]);
				}
	}
}
