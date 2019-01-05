import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
class vehicle{
	int no_of_tyres,no_of_gears,speed=0;
	float fuel=1.5f;
	void start() {
		System.out.println("vehicle Started");
		no_of_gears++;
	}
	void accelerate(int a) {
		speed=speed+a;
	}
	int speedometer() {
	return speed;
	}
	float fuelindicator(float f) {
		fuel=(float)(fuel+f);
		return fuel;
	}
}
public class Vehicledriver {
		public static void main(String[] args) throws IOException{
			Scanner s = new Scanner(System.in);
			int speed1;
			float fuel1;
	System.out.println("Enter the speed");
speed1=s.nextInt();
System.out.println("Enter the fuel");
//fuel1=s.nextFloat();
BufferedReader s1= new BufferedReader(new InputStreamReader(System.in));
String s2= s1.readLine();
fuel1=Float.parseFloat(s2);
System.out.println(fuel1);
vehicle v=new vehicle();
v.start();
v.accelerate(speed1);
int fspeed=v.speedometer();
float ffuel=v.fuelindicator(fuel1);
System.out.println("Speed is "+fspeed);
System.out.println("Fuel is "+ffuel);
System.out.println("Current gear is "+v.no_of_gears);
s.close();
}

}
