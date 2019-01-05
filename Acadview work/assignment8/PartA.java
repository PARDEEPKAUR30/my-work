package assignment8;
import java.io.*;
public class PartA {
public static void main(String arg[]) throws IOException  {
	File file=new File("/E:/Acadview Assignment Files/Acadview assignment8/abc.txt");
	FileReader r=null;
	int c;
	
	try {
		r=new FileReader(file);
		while((c=r.read())!=-1) {
System.out.print((char)c);}
}
	catch(FileNotFoundException f) {
	System.out.println("The given File is not found.");
    }
	catch(Exception e) {
	System.out.println("Error is occured.");}
	finally {
		r.close();
	}
}
}
