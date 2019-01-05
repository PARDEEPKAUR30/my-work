import java.util.*;
class inputi{
	Scanner sc=new Scanner(System.in);
String name[]=new String[5];
int age[]=new int[5];
float weight[]=new float[5];
void name() {
	System.out.println("enter the name and age of  5 children");
	for(int i=0;i<5;i++) {
		System.out.println(i+1+".");
	name[i]=sc.next();
	age[i]=sc.nextInt();
	//weight[i]=sc.nextFloat();	
	if((age[i]>0)&&(age[i]<=12)) {
	     if(age[i]>0&&age[i]<5)
		System.out.println(" weight is 1kg-20kg");
	    if(age[i]>=5&&age[i]<10)
		System.out.println(" weight is 20kg-30kg");
	   if (age[i]>=10&&age[i]<=12)
	    System.out.println(" weight is 30kg-40kg");}
	else
		System.out.println("wrong input for age");
	}
}}
public class Nameagecondition {

	public static void main(String[] args) {
		inputi n=new inputi();
		n.name();
		
   
	}

}
