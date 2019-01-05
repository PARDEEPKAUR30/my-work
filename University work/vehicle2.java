import java.util.*;
class vehi{
	int notyres,nogears;
	float speed=0.0f;
	float fuel=1.5f;
	void start() {
		System.out.println("vehicle is start");
	}
	void acc(float a) {
	speed=speed+a;
	nogears++;
	
	}
	float smeter() {
	return speed;
	}
	float findi(float a1) {
		fuel=fuel+a1;
		return fuel;
	}
}
public class vehicle2 {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//useLocale(Locale.US);
	vehi v=new vehi();
	v.start();
	System.out.println("enter no. of tyres");
	v.notyres=sc.nextInt();
	if(v.notyres>1){
	System.out.println("enter the value of speed you want to accelerate");
	float sp=sc.nextFloat();
	v.acc(sp);
	float sp1=v.smeter();
	System.out.println("Enter the value of filled fuel");
	float f1=sc.nextFloat();
	float f2=v.findi(f1);
	System.out.println("Current speed of the vehicle is" +sp1);
	System.out.println("current vale of fuel is "+f2);
	System.out.println("Current gear of the vehicle is" +v.nogears);
	}
	sc.close();
	}
}
