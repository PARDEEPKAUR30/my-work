import java.util.Scanner;
public class CalculateBmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		float weight,height,bmi;
System.out.println("Enter the Person's weight in kg: ");
weight=s.nextFloat();
System.out.println("Enter the Person's height in m: ");
height=s.nextFloat();
bmi=weight/(height*height);
System.out.println("The Person's weight in kg is: "+weight);
System.out.println("The Person's height in m is: "+height);
System.out.println("The Person's Body Mass Index is m: "+bmi);
}

}
