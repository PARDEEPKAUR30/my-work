import java.util.*;
class Vehicle{
	String m_no,colour;
	double avarage;
	Scanner s=new Scanner(System.in);
	void get_info() {
		System.out.println("Enter Model number: ");
		m_no=s.next();
		System.out.println("Enter Model colour: ");
		colour=s.next();
		System.out.println("Enter Model average: ");
		avarage=s.nextDouble();
	}	
	void information() {
		System.out.println("Model number is: "+ m_no+"\nModel Colour is: "+colour+"\nModel Avarage: "+avarage+" km/h");	
	}
}
class FourWheeler extends Vehicle{
	void tyre() {
		System.out.println("Number of tyre is: 4");
	}
	
}
class Car extends FourWheeler{
	void Shift_gear() {
		System.out.println("shift gears according to speed ");
	}
}
class SportsCar extends Car{
	void brk() {
		System.out.println("Break of sports car is  work very efficiently ");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SportsCar sc=new SportsCar();
sc.get_info();
sc.information();
sc.tyre();
sc.Shift_gear();
sc.brk();
	}

}
