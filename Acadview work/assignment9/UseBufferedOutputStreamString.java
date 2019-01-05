package assignment9;
import java.io.*;

public class UseBufferedOutputStreamString {
	public static void main(String arg[]) throws IOException{
		File f=new File("E:/Acadview Assignment Files/Acadview assignment folder/output1.txt");
		FileOutputStream f1=new FileOutputStream(f);
		BufferedOutputStream bout=new BufferedOutputStream(f1);
		String s="hello acadview";
		bout.write(s.getBytes());
		bout.close();
}
}
