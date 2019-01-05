//import java.util.Scanner;
class Animal{
	public String picture,location;
	public void make_noise(String n){
	System.out.println(picture+" make a "+n+" pitch noise");	
	}
	public void sleep() {
	System.out.println(picture+" mostly Sleep at night");
	}
   public void eat(String f) {
		System.out.println(picture+" eat to "+f+" as food");
	}  
}
class Cow extends Animal{
	String noise,food;	
}
class Tiger extends Animal{
	String noise,food;
}
public class AnimalCT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner s=new Scanner(System.in);
//Animal a=new Animal();
Cow c=new Cow();
Tiger t=new Tiger();
c.location ="Cow is pat animal";
c.picture="Cow";
c.make_noise("low");
c.sleep();
c.eat("plants");
t.location="Tiger is forest animal";
t.picture="Tiger";
t.make_noise("high");
t.sleep();
t.eat("animal");
	}

}


