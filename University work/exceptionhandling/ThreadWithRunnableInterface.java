package exceptionhandling;
import java.lang.*;
class display implements Runnable{
	public void run(){
		System.out.println("Class created by implementing Runnable interface");
	}}	


public class ThreadWithRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display d= new display();
		Thread t= new Thread(d);
		t.start();		
		System.out.println("Hi main");
}}
