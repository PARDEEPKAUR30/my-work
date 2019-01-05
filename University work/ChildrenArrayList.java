import java.util.*;

class Children{
	Scanner s=new Scanner(System.in);
	int age;
	String name;
	void setname() {
		System.out.println("enter the name of child");
		String na=s.next();	
		name=na;
	}
	void setage() {
		System.out.println("enter the age of child");
		int ag= s.nextInt();
		age=ag;
	}
	void loop(){
	switch(age)
	{
	case 1:
		System.out.println("weight is 10kg");
		break;
	case 2:
		System.out.println("weight is 12kg");
	    break;
	case 3:
		System.out.println("weight is 15kg");
		break;
	case 4:
		System.out.println("weight is 18kg");
		break;	
	case 5:
		System.out.println("weight is 21.5kg");
		break;	
	case 6:
		System.out.println("weight is 25.3kg");
		break;	
	case 7:
	    System.out.println("weight is 27.2kg");
		break;
	case 8:
		System.out.println("weight is 28.3kg");
		break;
	case 9:
		System.out.println("weight is 30kg");
		break;
	case 10:
		System.out.println("weight is 33.5kg");
		break;
	case 11:
		System.out.println("weight is 35.0kg");
		break;
	case 12:
		System.out.println("weight is 38.0kg");
		break;
		default:
			System.out.println("wrong input for age");
 	}
	}
	
}
public class ChildrenArrayList {

	public static void main(String[] args) {
	Scanner s1=new  Scanner(System.in);	
		ArrayList<Children>c=new ArrayList<Children>();	
	       int i;
		do{
		Children c1=new Children();
		c1.setname();
		c1.setage();
		c.add(c1);
		System.out.println("If you want to enter more recordes enter 1 otherwise enter 0");
		i=s1.nextInt();
		}while(i==1);
		int g=0;
		while(g<c.size()) {
			System.out.println("Name is "+c.get(g).name);
			System.out.println("Age is "+c.get(g).age);
			c.get(g).loop();
		g++;}
	s1.close();
	}

}
