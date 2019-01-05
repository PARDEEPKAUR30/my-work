package assignment5;
import java.util.Scanner;
class Animal{
	Scanner s=new Scanner(System.in);
	String breed,color;
	Animal(){
	System.out.println("What is the breed of the animal: ");
	breed=s.nextLine();
	System.out.println("What is the color of the animal: ");
	color=s.nextLine();
	System.out.println("The breed of the animal is: "+breed);
	System.out.println("The color of the animal is: "+color);
	}
	void speak() {
		System.out.println("How the animal speak ?");
	}
}

class Dog extends Animal{
	void speak() {
		System.out.println("The dog bark as 'bow-wow'.");
	}
}
class Cat extends Animal{
	void speak() {
		System.out.println("The cat speak as 'mmmnnawwww'.");
	}
}

public class OverrideSpeakFunction {
	public static void main(String arg[]) {
Dog d=new Dog();
d.speak();
Cat c=new Cat();
c.speak();
}}
