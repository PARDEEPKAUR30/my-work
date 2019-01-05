package assignment9;
import java.io.*;
public class UseFileWriter {
public static void main(String arg[]) throws IOException{
	File file=new File("E:/Acadview Assignment Files/Acadview assignment folder/abcd.txt");
	FileWriter out=null;
	try {
		out=new FileWriter(file);
	out.write("Here i am writting content in file using 'File Writer'.");}
	catch(FileNotFoundException f) {
		System.out.println("The given file is not found");
	}
	catch(Exception e) {
		System.out.println("Error has occured in the code.");
	}
	finally {
		//out.flush();
		out.close();}
}
}
