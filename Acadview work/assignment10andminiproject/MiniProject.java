package assignment10andminiproject;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

class MyFile{
void call(String s) {
	 File f=new File(s);
	 File fs[];
	// System.out.println(s); 
	 fs=f.listFiles();
	System.out.println("* "+f.getName()+ "; "+f.getPath());
	System.out.println("Files under "+f.getName()+" are:");
	 for(int i=0;i<fs.length;i++) {
	 System.out.println((i+1)+". "+fs[i].getName()+";  "+fs[i].getPath());}
	 for(int i=0;i<fs.length;i++) {
	 if(fs[i].isDirectory()) {
		 call(fs[i].getPath());}
	 }}}



public class MiniProject{
public static void main(String arg[]) throws IOException {
	File file=null;
	FileInputStream fin=null;
	BufferedInputStream bin=null;	
	try {
		MyFile m=new MyFile();
		 String s="E:\\Acadview Assignment Files\\mini project folders\\abc.txt";
		 file=new File(s);
		//file=new File("E:\\Acadview Assignment Files\\mini project folders\\abc.txt");
	fin=new FileInputStream(file);
    bin=new BufferedInputStream(fin);
    InputStreamReader isr=new InputStreamReader(fin);
    BufferedReader r=new BufferedReader(isr);
   // int c,p=0;
   s="";
   // String s=null;
  
   /* while((c=bin.read())!=-1) {
     s=s+(char)c;
    }
    System.out.println("The content of the given file 'abc.txt' is:");
    System.out.println(s);
    
    s="";*/
   /* while((c=bin.read())!=-1){	
             if(c!=10){
    	       s=s+(char)c; 
    	      // System.out.println(s);
    	        p=++p;}
  	           else {
  	           bin.mark(p);
  	            System.out.println("1. Path1 is:"+s);
  	           // m.call("E:\\Software Engineering");
  	            if(s!=null) {
  	            m.call(s);}
                   s="";
                   bin.reset();
  	           } }
    	 System.out.println("2. Path2 is: "+s);
    	// m.call("E:\\New folder");
         if(s!=null) {
  	      m.call(s);}*/
   while(s!=null) {
	  s=r.readLine();
	   if(s!=null) {
	   System.out.println(s);
		   m.call(s);}
	   //file=new File(r.readLine());
	  // m.call(file.getPath());
	   //}
			   
   }
    	 
    	 }catch(FileNotFoundException fe) {
		System.out.println("File is not found.");
	}catch(Exception e) {
		System.out.println("Error has occurred in the code.");}
	finally {
		fin.close();
		bin.close();
		
		//bout.close();
	}
}
}
