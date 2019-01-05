import java.util.Scanner;

class data{
	private int age;
	public void setage(int n) {
	age=n;
	}
	public int getage() {
		return age;
	}
}
public class weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
data a[]= new data[5];
for(int i=0;i<5;i++) {
	a[i]=new data();
	System.out.println("enter the age of child");
	int ag=s.nextInt();
	a[i].setage(ag);
	System.out.println("The age of child is "+a[i].getage());
	if((a[i].getage()>0)&&(a[i].getage()<=12)) {
		if((a[i].getage()>0)&&(a[i].getage()<5))
	  System.out.println("and the weight is 1kg-20kg");
		if((a[i].getage()>=5)&&(a[i].getage()<10))
			  System.out.println("and the weight is 20kg-30kg");
		if((a[i].getage()>=10)&&(a[i].getage()<=12))
			  System.out.println("and the weight is 30kg-40kg");
	}
	else
		System.out.println("wrong input for age");
}s.close();
	}

}
