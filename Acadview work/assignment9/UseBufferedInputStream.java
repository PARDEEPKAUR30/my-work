package assignment9;
import java.io.*;

public class UseBufferedInputStream {
public static void main(String arg[]) throws IOException{
	FileInputStream f=new FileInputStream("E:/Acadview Assignment Files/Acadview assignment folder/abcd.txt");	
	BufferedInputStream bin=null;
	
    int c;
    try {
		bin= new BufferedInputStream(f,4);
		while((c=bin.read())!=-1) {
			System.out.print((char)c);
			}
	}catch(FileNotFoundException fn) {
		System.out.println("The given file is not found");
	}
	catch(Exception e) {
		System.out.println("Error has occured in the code");
	}
	finally {
		bin.close();
		
	}
	
}
}
