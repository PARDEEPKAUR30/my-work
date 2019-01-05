abstract class Operations1{
	abstract void add();
	abstract void sub();
	abstract void display();}
abstract class Addition1 extends Operations1 {
	int m=20,n=10,a,c;
	void add() {
		a=m+n;};
	 void display() {
	 System.out.println("Addition is: "+a);
       }
	 abstract void sub();
}
class Addnsub1 extends Addition1 implements Subtraction1{
	
	 public void sub() {
	c=m-n; 
	 } 
	 public void display() {
		 super.display();
		 System.out.println("Subtraction is: "+c);	 
	 }
	 }
  
interface Subtraction1{
	void sub();
	void display();
}
public class MutipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addnsub1 s=new Addnsub1();
		s.add();
		s.sub();
		s.display();
	}

}
