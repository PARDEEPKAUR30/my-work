package assignment3;

public class EvenNumbers {
public static void main(String arg[]) {
	int number=Integer.parseInt(arg[0]);
	System.out.println("The all Even numbers upto "+number+"are: ");
	for(int i=1;i<=number;i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
	}
}
}
