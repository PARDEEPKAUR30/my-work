package assignment6;
import java.util.Scanner;

abstract class Animals{
	String name,color,breed;
	Scanner s=new Scanner(System.in);
	Animals(){
		System.out.println("Enter the name of the animal: ");
		name=s.nextLine();
		System.out.println("Enter the breed of the animal: ");
		breed=s.nextLine();
		System.out.println("Enter the color of the animal: ");
		color=s.nextLine();
		System.out.println("I have a "+color+" dog name '"+name+"' of breed '"+breed+"'.");
	}
	abstract void eat();
	void speak() {
		System.out.println(name+" is starting to speak.");
}}

class Dogs extends Animals{
	void eat() {
		System.out.println(name+" like to eat biscuit.");
	}
}

public class AbstractAnimals {
public static void main(String arg[]) {
	Dogs d=new Dogs();
	d.speak();
	d.eat();
}
}
