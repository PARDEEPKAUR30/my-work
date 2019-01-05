package assignment9;
import java.io.*;

public class UseFileInputStraem {
	public static void main (String arg[]) throws IOException{
		File file=new File("E:/Acadview Assignment Files/Acadview assignment folder/abcd.txt");
		FileInputStream fin =null;
		int c;
		try {
			fin=new FileInputStream(file);
			System.out.println("Avialable characters before read the file: "+fin.available());
			while((c=fin.read())!=-1) {
				System.out.print((char)c);
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
			
		}
}}
