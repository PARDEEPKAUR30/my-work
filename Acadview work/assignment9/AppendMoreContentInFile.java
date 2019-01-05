package assignment9;
import java.io.*;

public class AppendMoreContentInFile {
public static void main(String arg[]) throws IOException {
	File file=new File("E:/Acadview Assignment Files/Acadview assignment folder/abcd.txt");
	FileWriter w=null;
	try {
	 w=new FileWriter(file, true);
	 w.append("I am appending more content in the file.");
	}catch(FileNotFoundException f) {
		System.out.println("The given file is not found");
	}
	catch(Exception e) {
		System.out.println("Error has occured in the code");
	}
	finally {
		w.close();
		
	}
}
}
