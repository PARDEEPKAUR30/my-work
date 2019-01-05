package exceptionhandling;
import java.util.*;
class Chained{
	private int a;
	int result;
	Scanner s=new Scanner(System.in);
	void display() {
		try {
			calculation();
			System.out.println("Result: "+result);
		}
		catch(InputMismatchException e){
			System.out.println("The exception catch here");
			System.out.println("Exception "+e);
			//e.printStackTrace();
			System.out.println("The exception handled in display method");
			System.out.println("Please try again");
	}}
	
	void calculation() {
		try {
			input();
			System.out.println("calculation start for find the squareroot");
			result=a*a;
			}
		catch(InputMismatchException e){
			System.out.println("The exception catch here");
			System.out.println("Exception: "+e);
			System.out.println("The exception rethrow from calculation method");
			System.out.println();
			throw (new InputMismatchException(" throw from calculation"));
		}}
	
	
void input(){
		try {
		System.out.println("Enter an integer");
		a=s.nextInt();
		
		}
		catch(InputMismatchException e) {
			System.out.println("The exception catch here");
			System.out.println("Exception "+e);
			System.out.println("The exception rethrow from input method");
			System.out.println();
			throw (new InputMismatchException("throw from input"));
		}}
	

	

	
}
public class ChainedException {

	public static void main(String[] args) throws InputMismatchException{
		// TODO Auto-generated method stub
		
		Chained c=new Chained();
		c.display();

	}}
