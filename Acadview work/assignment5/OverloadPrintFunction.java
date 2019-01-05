package assignment5;

class PrintFunction{
	void print() {
		System.out.println("The Print() with Null arguments.");
	}
	void print(int n) {
		System.out.println("The Print() with one integer argument and given integer is: "+n);
	}
	void print(float f) {
		System.out.println("The Print() with one float argument and given float is: "+f);
	}
}
public class OverloadPrintFunction {
	public static void main(String arg[]) {
		PrintFunction p=new PrintFunction();
		p.print();
		p.print(17);
		p.print(34.6f);
		}
}
