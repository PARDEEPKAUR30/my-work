package assignment9;
import java.io.*;

public class UseBufferedOutputStreamAsciiCode {
	public static void main(String arg[]) throws IOException{
		File f=new File("E:/Acadview Assignment Files/Acadview assignment folder/output.txt");
		FileOutputStream f1=new FileOutputStream(f);
		BufferedOutputStream bout=new BufferedOutputStream(f1);
		byte[]b= {97,98,99,100};
		bout.write(b);
		bout.close();
}
}
