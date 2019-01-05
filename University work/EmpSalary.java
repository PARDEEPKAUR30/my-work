import java.util.*;
class bonus{
	Scanner s1=new Scanner(System.in);
	int s=10000,sale;
	void sale() {
		System.out.println("Enter the number of sales");
				sale=s1.nextInt();
	}
	void salary() {
		if (sale<=5) {
			System.out.println("No Bonus");
			}
			else if(sale>=5&&sale<=10) {
				s=s+s*5/100;
				System.out.println("Salary is "+s);
		     }
			else if(sale>=11&&sale<=15) {
				s=s+s*10/100;
				System.out.println("Salary is "+s);
			}
			else {
				s=s+s*15/100;
				System.out.println("Salary is "+s);
			}
		}
	}
public class EmpSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bonus b=new bonus();
b.sale();
b.salary();
	}

}
