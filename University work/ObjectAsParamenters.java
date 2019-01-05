class Product{
	int a,b;
	void get_value(int a,int b) {
	this.a=a;
	this.b=b; }
	int display(Product p1) {
		return(p1.a*p1.b);
	}
	}
public class ObjectAsParamenters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product p=new Product();
p.get_value(10,10);
int d=p.display(p);
System.out.println("Product is: "+d);
	}

}
