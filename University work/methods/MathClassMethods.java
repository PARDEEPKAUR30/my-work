package methods;
import java.lang.Math;
public class MathClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int abs =Math.abs(-5);
int abs1=Math.abs(5);
System.out.println("abs(-5)= "+abs);
System.out.println("abs(5)= "+abs1);

double ceil=Math.ceil(2.15);
System.out.println("ceil(2.15)= "+ceil);
	
double floor=Math.floor(2.15);	
System.out.println("floor(2.15)= "+floor);
	
double roundd=Math.round(2.3);
double roundu=Math.round(2.5);
System.out.println("round(2.3)= "+roundd);
System.out.println("round(2.5)= "+roundu);

int max=Math.max(5, 10);
System.out.println("max(5,10)= "+max);

int min=Math.min(5, 10);
System.out.println("min(5,10)= "+min);

double exp=Math.exp(0);
double exp1=Math.exp(4);
System.out.println("exp(0)= "+exp);
System.out.println("exp(4)= "+exp1);
   
double pow=Math.pow(3,5);
System.out.println("pow(3,5)= "+pow);

double sqrt=Math.sqrt(10);
System.out.println("sqrt(10)= "+sqrt);

double sin=Math.sin(45);
System.out.println("sin(45)= "+sin);

double cos=Math.cos(45);
System.out.println("cos(45)= "+cos);

double tan=Math.tan(45);
System.out.println("tan(45)= "+tan);

double asin=Math.asin(0.1);
System.out.println("asin(0.1)= "+asin);

double acos=Math.acos(0.1);
System.out.println("acos(0.1)= "+acos);

double atan=Math.atan(1.0);
System.out.println("atan(1.0)= "+atan);

	}}
