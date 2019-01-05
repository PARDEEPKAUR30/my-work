package assignment8;
import java.io.*;
public class PartB {
public static void main(String arg[]) throws IOException {
	File file=new File("E:/Acadview Assignment Files/Acadview assignment8/abc2.txt");
	FileReader r=null;
	int c;
	try {
		r=new FileReader(file);
		while((c=r.read())!=-1) {
			/*if((char)r.read()==' ') {
				System.out.println();
			}*/
			System.out.print((char)c);}
	}catch(FileNotFoundException f) {
	System.out.println("The given file is not found.");}
	catch(Exception e) {
	
		System.out.println("Error is occured.");}
	finally {
	r.close();
}}

}

