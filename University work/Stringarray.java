import java.util.*;
class array{
	String a[]=new String[5];
	Scanner s=new Scanner(System.in);
	void input(){
				System.out.println("Enter the five names");
		for(int i=0;i<5;i++)
		{
			a[i]=s.next();
					}
			}
	void display() {
		for(int i=0;i<5;i++) {
			System.out.println(i+1+". "+a[i]);
		}
	}
		
}
public class Stringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
array a1=new array();
a1.input();
a1.display();
	}

}
