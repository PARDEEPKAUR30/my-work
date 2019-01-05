package assignment9;
import java.io.*;

public class UseFileInputAndOutputStream {
public static void main (String arg[]) throws IOException{
	File file=new File("E:/Acadview Assignment Files/Acadview assignment folder/abcd.txt");
	File file1=new File("E:/Acadview Assignment Files/Acadview assignment folder/xyz.txt");
	FileInputStream fin =null;
	FileOutputStream fout=null;
	int c;
	try {
		fin=new FileInputStream(file);
		fout=new FileOutputStream(file1);
		System.out.println("Avialable characters before read the file: "+fin.available());
		while((c=fin.read())!=-1) {
			System.out.print((char)c);
			fout.write(c);
			}
		System.out.println();
		System.out.println("Avialable characters before read the file: "+fin.available());
	}catch(FileNotFoundException f) {
		System.out.println("The given file is not found");
	}
	catch(Exception e) {
		System.out.println("Error has occured in the code");
	}
	finally {
		fin.close();
		fout.close();
		
	}
	
}
}
