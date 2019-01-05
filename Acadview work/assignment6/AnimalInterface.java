package assignment6;

interface Animal{
	void speak();
	void eat();
}

class Cat implements Animal{
public void speak(){
System.out.println("The cat speak as 'mmmmnnnnaaaawwwww'.");
}
public void eat(){
	System.out.println("The cat mostly like to eat non-vegetarian food.");
}
}
class Dog implements Animal{
	public void speak() {
		System.out.println("The dog speak as 'bow-wow'.");
	}
	public void eat() {
		System.out.println("The dog eat vegetarian and non-vegetarian food.");
	}
}
public class AnimalInterface {
public static void main(String arg[]) {
	Dog d=new Dog();
	d.speak();
	d.eat();
	Cat c=new Cat();
	c.speak();
	c.eat();
}
}
