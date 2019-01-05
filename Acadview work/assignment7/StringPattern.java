package assignment7;

public class StringPattern {
public static void main(String arg[]) {
	//StringBuffer string= new StringBuffer("a");
	String string="abcd";
	char[]array=new char[4];
	for(int i=0;i<string.length();i++) {
	string.getChars(i, i+1, array, i);
	for(int j=0;j<=i;j++) {
	   System.out.print(array[j]);
	    }
	  System.out.println();
	 }
	
}
}
