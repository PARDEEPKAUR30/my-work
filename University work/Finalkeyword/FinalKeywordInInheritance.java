package Finalkeyword;
//final
class Value{
 int f=3;
   int calculation(){
	 return(f*f);
 }
 }
class Number extends Value{
	void display() {
		System.out.println("result is: "+calculation());
	}
}
public class FinalKeywordInInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Number n=new Number();
	n.display();
	}

}
