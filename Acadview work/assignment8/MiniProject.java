package assignment8;
import java.io.*;

public class MiniProject {
public static void main(String arg[]) throws FileNotFoundException,IOException{
	File file=new File("E:/Acadview Assignment Files/Acadview assignment8/abc3.txt");
	File file1=new File("E:/New folder");
		String s[]=file1.list();
		outer:for(int i=0;i<s.length;i++) {
			System.out.println(i+1+". "+s[i]+": ");
			 file1=new File(s[i]);
			 String si[]=file1.list();
			 if(si[i]=="null") {
			 inner: for(int j=0;j>=i;j++) {
			       System.out.println(i+1+". "+si[j]+": ");
			       // file1=new File(si[j]);
			      }}
			 else
				 break outer;
			 }}
}