package stringandexceptionhandling;
import java.util.*;
public class ReThrowingException {     
	static void divide() { 
		 Scanner s=new Scanner(System.in);
    int n,d,r; 
    try { 
       System.out.println("Enter the numenator: "); 
       n=s.nextInt() ; 
       System.out.println("Enter the denominator: "); 
       d =s.nextInt(); 
       r = n/d ; 
       System.out.println("Result is: "+r);
       } 
    catch(InputMismatchException ie) {
   	 System.out.println("Exception Caught in Divide()"); 
        System.out.println("You cannot enter any other value rather than Integer"); 
        throw ie; // Rethrows an exception 
     }
     catch(ArithmeticException e) { 
      System.out.println("Exception Caught in Divide()"); 
      System.out.println("Cannot Divide by Zero in Integer Division"); 
      throw e; // Rethrows an exception 
     } 
   } 

	public static void main(String[] args) {
		     
		  System.out.println("Start of main()"); 
          try 
          { 
              divide(); 
           } 
          catch(InputMismatchException ie) 
          { 
              System.out.println("Rethrown Exception Caught in Main()"); 
              System.out.println(ie); 
          } 
         catch(ArithmeticException e) 
         { 
             System.out.println("Rethrown Exception Caught in Main()"); 
             System.out.println(e); 
         } 
   } 
} 
	
