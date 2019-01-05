import java.util.*;
class fill { 
	int x,y;
Scanner s=new Scanner(System.in);
void loop() {
	System.out.println("Enter the 1 for Right Shift and 2 for Left Shift");
	int n=s.nextInt();	
switch(n) {
case 1:
	System.out.println("Enter the number to which you want Right Shift");
	int a=s.nextInt();
	System.out.println("Enter the number to how many time you want Right Shift of "+a);
	int m=s.nextInt();
	x=a>>m;
	System.out.println("Right Shift of "+a+" is "+x);
	break;
case 2:
	System.out.println("Enter the number to which you want Left Shift");
	int b=s.nextInt();
	System.out.println("Enter the number to how many time you want Left Shift of "+b);
	int o=s.nextInt();
	y=b<<o;
	System.out.println("Left Shift of "+b+" is "+y);
	break;
default:
	System.out.println("Wrong Input");		
}
}}
public class Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fill f=new fill();
f.loop();
	}

}
