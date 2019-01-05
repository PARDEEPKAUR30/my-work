package assignment9;
import java.io.*;

public class UsePrintStream {
public static void main(String arg[]) throws IOException{
	File file=new File("E:/Acadview Assignment Files/Acadview assignment folder/abcd.txt");
	FileOutputStream f=new FileOutputStream("E:/Acadview Assignment Files/Acadview assignment folder/output1.txt");
	PrintStream pout=new PrintStream(f);
	try {
	      pout.println("Here i am using Print Stream.");
	 }
	catch(Exception e) {
		System.out.println("Error has occured in the code");
	}finally {
		pout.close();
	}
}
}
