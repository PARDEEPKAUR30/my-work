package assignment10andminiproject;

import java.io.File;
class MyFile1{
void call(String s) {
	
	 File f=new File(s);
	 File fs[];
	 fs=f.listFiles();
	System.out.println(f.getName());
	System.out.println("Files under "+f.getName()+" are:");
	 for(int i=0;i<fs.length;i++) {
	 System.out.println((i+1)+". "+fs[i].getName()+" ;"+fs[i].getPath());}
	 for(int i=0;i<fs.length;i++) {
	 if(fs[i].isDirectory()) {
		 call(fs[i].getPath());}
	 }}}
public class Practice {
public static void main(String arg[]) {
 MyFile1 m=new MyFile1();
 String s="E:\\Software Engineering";
 m.call(s);



 }
}

