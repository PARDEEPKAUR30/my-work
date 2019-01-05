abstract class Operations{
	abstract void add();
	abstract void sub();
	abstract void display();}

class Addnsub implements Addition ,Subtraction{
	int m=20,n=10,a,c;
	public void add() {
		a=m+n;}
	 public void sub() {
	c=m-n; 
	 }
	 public void display() {
		 System.out.println("Addition is: "+a);
		 System.out.println("Subtraction is: "+c);	 
	 }
	 }
interface  Addition {
	void add() ;
	 void sub();
	 void display();

}
interface Subtraction{
	void sub();
	void display();
}
public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Subtraction s=new Subtraction();
Addnsub s=new Addnsub();
s.add();
s.sub();
s.display();
	}}


