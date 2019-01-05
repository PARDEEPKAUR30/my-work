import java.util.*;
class Result{	
	
	float get_marks(){
		Scanner s=new Scanner(System.in);
		float marks=s.nextFloat();
		return marks;
	}
	void display_marks(float m){
		System.out.println("Total marks get in Semester are: " +m);
	}
}
class MSTResult extends Result{
	void dispaly_marks(float n) {
		System.out.println("Total  marks get in MST are: " +n);
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Result r=new Result();
MSTResult r1=new MSTResult();
System.out.println("Enter get Marks in Semester: ");
float marks=r.get_marks();
r.display_marks(marks);
System.out.println("Enter get Marks in MST: ");
float marks1=r1.get_marks();
r1.dispaly_marks(marks1);
	}

}
