import java.util.*;
class student{
	Scanner s1=new Scanner(System.in);
	 private String name;
	 private int age;
	 private int rollno;
	public void setname(String n) {
	//System.out.println("Enter the name");
	//n=s1.nextChar();
		name=n;
	}
	public void setage(int a) {
		//System.out.println("Enter the age");
		//a=s1.nextInt();
		if(a<=0||a>30)
			System.out.println("wrong input");
		else 	
		age=a;
	}
	public void setrollno(int r) {
		//System.out.println("Enter the Roll No.");
		//r=s1.nextInt();
		rollno=r;
	}
	public String getname() {
		return name;
	}
	public int getage(){
		return age;
	}
	public int getrollno() {
		return rollno;
	}
}
public class Studentdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s=new student();
s.setname("Pardeep kaur");
String x=s.getname();
s.setage(22);
int y=s.getage();
s.setrollno(1159);
int z=s.getrollno();
System.out.println("Student name is "+x);
System.out.println("Student age is "+y);
System.out.println("Student roll no. is "+z);
	}

}
