package clockproject;

import java.text.SimpleDateFormat;

import java.util.*;
import java.lang.*;


interface Display{
	void display();
}


class TimeLimit extends Exception{
  public TimeLimit(String s) {
  super(s);
}}


class AutoClock implements Display{
	Calendar calendar=Calendar.getInstance();
    SimpleDateFormat f = new SimpleDateFormat("a");
	public void display() {
		//System.out.println(calendar.getTime());
		System.out.print(calendar.get(Calendar.HOUR)+ ":");
		System.out.print(calendar.get(Calendar.MINUTE)+ ":");
		System.out.print(calendar.get(Calendar.SECOND)+" ");
		System.out.println(f.format(new Date()));
	}}


abstract class SetTime {
	private int H,M,S;
	Scanner input=new Scanner(System.in);
	int i;
	boolean loop;
	int setHour() {
		do{
			loop=false;		
			try {
		System.out.println("Set the Hour:");
		i=input.nextInt();
		if(i>24||i<0) {loop=true;
		 throw new TimeLimit(" Hours value can't less than 0 and more than 24");
		 }
		H=i;
		}
	catch(TimeLimit tt) {
		System.out.println("Exception: "+tt);
		input.nextLine();
		System.out.println("you can enter an integer upto 24 only . Please try again");		
	}
		catch(InputMismatchException ie) {
			System.out.println("Exception: "+ie);
			input.nextLine();
			System.out.println("you can enter an integer value only . Please try again");}
	finally{
		return H;}}while(true);
	}
		
	int setMinute() {
		do{
			loop=false;
			try {
		System.out.println("Set the Minute:");
		i=input.nextInt();
		if(i>60 ||i <0) {
			loop=true;
			 throw new TimeLimit("minute value can't less than 0 and more than 60");  }
		M=i;
			}
		catch(TimeLimit tt) {
			
			System.out.println("Exception: "+tt);
			input.nextLine();
			System.out.println("you can enter an positive integer upto 60 only . Please try again");			
		}
			catch(InputMismatchException ie) {
				System.out.println("Exception: "+ie);
				input.nextLine();
				System.out.println("you can enter an integer value only . Please try again");}
		finally{
			return M;}}while(loop);
		}
	
	
	int setSecond() {
		do{
			loop=false;
		try {	
		System.out.println("Set the Second:");
		i=input.nextInt();
		if(i>60 ||i<0) {loop=true;
			 throw new TimeLimit(" Second value can't less than 0 and more than 60");  }
		S=i;
			}
		catch(TimeLimit tt) {
			System.out.println("Exception: "+tt);
			input.nextLine();
			System.out.println("you can enter an positive integer upto 24 only . Please try again");
			
		}
			catch(InputMismatchException ie) {
				System.out.println("Exception: "+ie);
				input.nextLine();
				System.out.println("you can enter an integer value only . Please try again");}
		finally{	
		return S;}}while(loop);
	}}
	


abstract class SetClock extends SetTime implements Runnable,Display{
	  int hour,minute,second;
	 public synchronized void run(){
		 hour=setHour();
		minute=setMinute();
		second=setSecond();}
	public void display(){
		 System.out.println(hour+":"+minute+":"+second);
	}
 }


class DigitalClock extends SetClock 
{
	void increment(){
		 try {
		  Thread.currentThread().sleep(1000);
	 }catch(InterruptedException ie) {}
	second++;
	if(second==60) {
		second=0;
		minute++;
	}
	if(minute==60) {
		minute=0;
		hour++;}
	if(hour==25) {
		hour=0;
	}
	 
		}
	 public void display() {
		 System.out.println(hour+":"+minute+":"+second);
	}
}



class DigitalTimer extends SetClock 
{
	void decrement(){
		 try {
		  Thread.currentThread().sleep(1000);
	 }catch(InterruptedException ie) {}
	second--;
	if(second==0||second<0) {
		second=60;
		minute--;
	}
	if(minute==0||minute<0) {
		minute=60;
		hour--;
	}
	if(hour<0) {
		hour=24;
		
	}
		}
	 public void display() {
		 System.out.println(hour+":"+minute+":"+second);
	}
}

 class Option{
	 Scanner input=new Scanner(System.in);
	 int option;
	 boolean loop,l;
	 
	 Option(){
		 do {loop=true;
	 System.out.println(" Please enter your option");
	 System.out.println("1 for Auto Clock");
	 System.out.println("2 for Clock");
	 System.out.println("3 for Timer");
	 System.out.println("4.for Exist");
	 option=input.nextInt();
	 switch(option) {
	 case 1:
		 AutoClock ac=new AutoClock();
		 ac.display();
		 break;
	 case 2: 
		 DigitalClock dc=new DigitalClock();
		 Thread c=new Thread(dc);
		 c.start();
			try {
			c.join();}
			catch(InterruptedException ie) {}
			do {
			dc.display();
			dc.increment();
			}while(true);
	 case 3:
		 DigitalTimer dt=new DigitalTimer();
			Thread t=new Thread(dt);
			t.start();
			try {
			    t.join();}
			   catch(InterruptedException ie) {}
			do {
				l=true;
			  dt.display();
			  dt.decrement();
			  }while(l);
	 case 4:
		 System.out.println("You Exist!");
		 loop=false;
		 break;
	    default:
	    	  System.out.println("You entered the wrong option please try again:");
	           loop=false;
			}}while(loop);
 }}

 
 
public class ClockTimer {

		public static void main(String[] args) throws TimeLimit,InputMismatchException,InterruptedException{
			Option p=new Option();
			}}

