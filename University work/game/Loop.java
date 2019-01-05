package game;
import java.util.*;
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int l=0;
		int i=0;
		int a=0;
		char c[]=new char[10];
		for(int j=9;j>0;j--) {
			System.out.println("Chances are left:"+ j);
				System.out.println("Guess the character");	
				char character=s.next().charAt(0);
				a=0;
				       for(i=0;i<l;i++){
					if (c[i]==character) {
					 System.out.println("Charcater is repeated");
					a=1;
					}}
				     if(a==0) {
				    c[i]=character; 
				System.out.println(c[i]);
				System.out.println(i);
				System.out.println("wao");
				i++;}l=i;
	}}

}
