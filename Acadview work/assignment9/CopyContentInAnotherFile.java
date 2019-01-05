package assignment9;
import java.io.*;


public class CopyContentInAnotherFile {
public static void main(String arg[]) throws IOException{
	File file=new File("E:/Acadview Assignment Files/Acadview assignment folder/abc.txt");
	FileInputStream fin=null;
	try {
	fin=new FileInputStream(file);
	}catch(FileNotFoundException f) {
		System.out.println("The given file is not found");
	}
	catch(Exception e) {
		System.out.println("Error has occured in the code");
	}
	finally {
		fin.close();
		
	}
}
}

