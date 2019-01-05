package methods;

import java.util.Scanner;
import java.lang.*;
class StringConstructor{ 
	String str;
   StringConstructor(){
System.out.println("The String is NULL");
}
	StringConstructor(String s){
		str=s;
		System.out.println("The String is: "+str);
	}

 StringConstructor (char c[]){
	 str= toString();
	 System.out.println("The String is: "+str);
 }
 String get_string() {
	 return str;
 }
}
 
public class StringMethods {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		char character;
		int answer;
		boolean b;
		String s;
		//String name="Pardeep kaur";
		String name;
StringConstructor obj=new StringConstructor();		
StringConstructor obj1=new StringConstructor("Welcome in JAVA world");
name=obj1.get_string();

character=name.charAt(4);
System.out.println("1. Character at index 4 is: "+character);

char a[]=name.toCharArray();
System.out.print("2. char array  from string is: ");
for(int i=0;i<a.length;i++) {
System.out.println(a[i]);}


 b= name.startsWith("p");
System.out.println("3. Does the string "+name+" start with 'p': "+ b);

b=name.endsWith("kaur");
System.out.println("4. Does the string "+name+" end with 'kaur': "+ b);

String name2="pardeep kaur";
 answer= name.compareTo(name2);
System.out.println("5. Compare to '"+name+"' with '"+name2+"' is: "+answer);

    answer= name.compareToIgnoreCase(name2);
    System.out.println("6. Compare to '"+name+"' with '"+name2+"' with ignore case is: "+answer);
	
     answer=name.indexOf("d");
	System.out.println("7. What is the index of 'd' in '"+name+"' is :"+answer);
	
	answer=name.lastIndexOf(name);
	System.out.println("8. What is the last index of '"+name+"' is :"+answer);
	
	s=name.substring(8);
	System.out.println("9. The substring of '"+name+"' is :"+s);
	
	s=name.substring(3,7);
	System.out.println("10. The substring of '"+name+"' is :"+s);
	 
	s=name.concat(" Mann");
	System.out.println("11. The concatinate of '"+name+"' with 'Mann' is :"+s);
	
	s=name.replace('k', 'K');
	System.out.println("12. The string '"+name+"' after replacement is :"+s);
	
	s=name.replace("Pardeep", "PARDEEP");
	System.out.println("13. The string '"+name+"' after replacement is :"+s);
	
	s=name.trim();
	System.out.println("14. The string '"+name+"' after trim is :"+s);
	
	s= String.valueOf('l');
	System.out.println("15. The value of the string "+name+" is :"+s);
	
	s=name.toLowerCase();
	System.out.println("16. The string '"+name+"' in lower case is :"+s);
	
	s=name.toUpperCase();
	System.out.println("17. The string '"+name+"' in upper case is :"+s);
	
	answer=name.codePointAt(0);
	System.out.println("18. The code point at index 0 of '"+name+"' is :"+answer);
	
	answer=name.codePointBefore(6);
	System.out.println("19. The code point befor index 6 of '"+name+"' is :"+answer);
	
	answer=name.codePointCount(5,7);
	System.out.println("20. The code point count from 5-7 of '"+name+"' is :"+answer);
	
	b=name.contains("t");
	System.out.println("21. Is the string '"+name+"' is contains t: "+b);
	
	b=name.contentEquals("hello");
	System.out.println("22. Is the content of string '"+name+"' is equals to hello: "+b);
	
	b=name.isEmpty();
	System.out.println("23. Is the string '"+name+"' is empty :"+b);
	
	b=name.matches("welcome in java world");
	System.out.println("24. Is the string '"+name+"' is matches with "+name2+" :"+b);
	
	String str[]=name.split(" ");
	System.out.println("25. The string "+name+" is split into: ");
	for(int i=0;i<str.length;i++) {	
		System.out.println(str[i]);}
	
	answer=name.length();
	System.out.println("26. The length of the string '"+name+"' is: "+answer);
	
	
	character=name.charAt(4);
	System.out.println("27. The Character of the string '"+name+"' at index 4 is: "+character);
	
	//s=name.setCharAt(3,'a');
	//s=name.toString();
	}

}
