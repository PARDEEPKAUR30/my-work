package assignment2;

public class BiggestNumber {
public static void main(String  arg[]) {
	int a=7,b=15,c=27;
	if(a>b&&a>c) {
		System.out.println(a +" is biggest number than "+b+" and "+c);}
	else if(b>a&&b>c) {
		System.out.println(b +" is biggest number than "+a+" and "+c);}
	else
		System.out.println(c +" is biggest number than "+a+" and "+b);
}
}
