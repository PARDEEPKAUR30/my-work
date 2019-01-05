class Course{
	void marks() {
		System.out.println("you get good marks in this course");
	}}
class Java extends Course{
		void marks() {
			System.out.println("you get good marks in Java");	
		super.marks();
	}}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Java j=new Java();
j.marks();
	}

}
