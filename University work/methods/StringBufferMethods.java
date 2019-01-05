package methods;
import java.lang.StringBuffer;
public class StringBufferMethods {

	public static void main(String[] args) {
		
 StringBuffer sb=new StringBuffer("Welcome");
 System.out.println(sb);
 
 sb.append(" in java world");
 System.out.println(sb);
 
 sb.insert(8,"student ");
 System.out.println(sb);
 
 sb.replace(8,15,"User");
 System.out.println(sb);
 
 sb.delete(8,15);
 System.out.println(sb);
 
 sb.reverse();
 System.out.println(sb);
 sb.reverse();
 
 System.out.println("capacity is: "+sb.capacity());
 
 sb.ensureCapacity(50);
 System.out.println(" ensure capacity is: "+sb.capacity());
 
 char c=sb.charAt(15);
 System.out.println(" the character at index no.15 is: "+c);
 
 System.out.println(" length is: "+sb.length());
 
 String s=sb.substring(8);
 System.out.println(" substring is: "+s);
 
 String s1=sb.substring(8,13);
 System.out.println(" substring is: "+s1);
 
	}

}
