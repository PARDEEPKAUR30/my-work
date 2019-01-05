import java.util.*;
class fruit{
	Scanner s=new Scanner(System.in);
	void kingfruit() {
		System.out.println("Mango is the king of fruits");
	}
	void mykingfruit(String s) {
		System.out.println("My king fruit is "+s);
	}
	String namefruit() {
		System.out.println("Name a fruit that you don't like");
		String s1=s.next();
		return s1;
	}
	
}
public class Fruittest {

	public static void main(String[] args) {
		fruit f=new fruit();
		f.kingfruit();
		f.mykingfruit("Apple");
		String s2=f.namefruit();
		System.out.println(s2);
		
	}		
}
