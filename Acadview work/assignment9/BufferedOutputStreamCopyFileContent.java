package assignment9;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamCopyFileContent {
public static void main(String arg[]) throws IOException{
   FileInputStream fin;
   FileOutputStream fout;
   BufferedInputStream bin=null;
   BufferedOutputStream bout=null;
   int c;
   
   try {
	  fin=new FileInputStream("E:/Acadview Assignment Files/Acadview assignment folder/abc.txt");
	   bin=new BufferedInputStream(fin);
	   fout=new FileOutputStream("E:/Acadview Assignment Files/Acadview assignment folder/xyz.txt");
	   bout=new BufferedOutputStream(fout);
	   while((c=bin.read())!=-1) {
		   bout.write(c);
	   }
   }catch(FileNotFoundException f) {
	   System.out.println("The given file not found.");
   }catch(Exception e) {
	   System.out.println("Error has occurred");
   }finally {
	   bin.close();
	   bout.close();
   }
   
   try {
   fin=new FileInputStream("E:/Acadview Assignment Files/Acadview assignment folder/xyz.txt");
   bin=new BufferedInputStream(fin);
   System.out.println("The content of the file 'xyz.txt' after copied the content of the file 'abc.txt' in it: ");
  while((c=bin.read())!=-1) {
	   System.out.print((char)c);}
   }catch(FileNotFoundException f) {
	   System.out.println("The given file not found.");
   }catch(Exception e) {
	   System.out.println("Error has occurred");
   }finally {
	   bin.close();
   }
 
}
}
