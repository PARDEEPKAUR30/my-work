package Finalkeyword;
class Course {
	  //final
	void totalMarks(int m) {
		 int marks=m;
		System.out.println("Total marks of the course is: "+marks);
	}}

class Java extends Course{
	void totalMarks( int m1) {
		 int marks=m1;
		System.out.println("Total marks of the Java is: "+marks);
	}}

public class FinalKeywordInMethodOverriding {

	public static void main(String[] args) {
		
		Course c=new Course();
		Java j=new Java();
		c.totalMarks(600);
		j.totalMarks(100);
	}

}
