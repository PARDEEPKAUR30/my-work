package exceptionhandling;
import java.lang.*;
class Hello extends Thread{
	 public void run() {
		 System.out.println("Class created by extending Thread class");
	}
}
public class ThreadWithExtendingThreadClass 
{
	public static void main(String[] args) {
		Hello h=new Hello();
		h.start();
		System.out.println("Hello");     
	      }}