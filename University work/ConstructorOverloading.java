import java.util.*;
class Fruit{
	String name;
	Scanner s=new Scanner(System.in);
	Fruit(){
		System.out.println("Enter the name of friut, you like the most:");
		name=s.next();
		System.out.println(" I like the "+name+" most");
	}	
	Fruit(String n){
		System.out.println("I also like the "+n );
	}
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fruit f=new Fruit();
Fruit f1=new Fruit("Grapes");
	}

}
