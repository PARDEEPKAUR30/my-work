package assignment3;
import java.lang.Math;
public class ArmstrongNumber {
public static void main(String arg[]) {
	int number=Integer.parseInt(arg[0]);
	int count=0,r=number;
	int array[];
	for(int i=0;r%10!=0;i++) {
		count=++count;
		r=r/10;
	   }
	array=new int [count];
	r=number;
	int result=0;
	for(int j=0;j<count;j++) {		
		array[j]=r%10;
		r=r/10;
	array[j]=(int)Math.pow((double)array[j],(double)count);
	result=result+array[j];
	}
	if(result==number) {
  System.out.println("The given number "+number+" is an armstrong number.");}
	else
		System.out.println("The given number "+number+" is not an armstrong number.");
}
}
