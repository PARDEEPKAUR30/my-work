package assignment12;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
}
public class InputDate {
public static void main(String arg[]) throws MyException {
	Scanner s=new Scanner(System.in);
	int d=1,m=1,y=2018,temp;
	String dy[]= {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
			"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty",
			"Twenty-One","Twenty-Two","Twenty-Three","Twenty-Four","Twenty-Five","Twenty-Six","Twenty-Seven","Twenty-Eight","Twenty-nine","Thirty","Thirty-One"};
	String mh[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
	
	
	Map<Integer,String> day=new TreeMap<>();
	for(int i=0;i<31;i++) {
		day.put(i+1,dy[i]);
	}
	Map<Integer,String> month=new TreeMap<>();
	for(int i=0;i<12;i++) {
		month.put(i+1,mh[i]);
	}
	
	String first[]= {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
			"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	String second[]= {"Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety", "Hundred"};
    //String third[]= {"Thousand"};
    
Map<Integer,String> year=new TreeMap<>();
int z=0;
int x=30;
  for(int i=1;i<100;) {
	  if(i<20) {
	  year.put(i, first[i-1]);
	  i=i+1;}
	 /* else {
		  //if((i%10)!=0) {
		 if(i==20||i==30||i==40||i==50||i==60||i==70||i==80||i==90){ 
				// System.out.println("** "+(i%10));	
					 if(z<9) {
						  year.put(i,second[z]);
						  System.out.println(i+": "+year.get(i));
						 z =z+1;
						 i=i+1;}}*/
		  else {
		  for(int j=0;j<8;j++) {
			  if(i==20||i==30||i==40||i==50||i==60||i==70||i==80||i==90){ 
				  if(z<9) {
				  year.put(i,second[z]);
				 // System.out.println(i+": "+year.get(i));
				 z =z+1;
				 i=i+1;}}
				for(int k=0;k<9;k++) {
					year.put(i,second[j]+" "+first[k]);
					i=i+1;}
				//break;
				//}
		  }
	    }
	  }
	
 /*for(int i=0;i<100;i++) {
	  System.out.println(i+": "+year.get(i));
  }*/
  Boolean b;
  
  do {
  try {
	  b=false;
   System.out.println("Enter the month in integer: ");
	m=s.nextInt();
	if((m<=0)||(m>12)) {
		throw new MyException("You can enter the value from 1 to 12 only.");	
	}}
  catch(MyException mex) {
	  System.out.println("Exception: "+mex);
	  System.out.println("Please renter the value for month:");
	  //System.out.println(mex.getMessage());
	  b=true;
  }}while(b==true);
  
  do {
	  try {
		  b=false;
		  System.out.println("Enter the day in integer: ");
	d=s.nextInt();
	if(d<=0||d>31) {
		throw new MyException("You can enter the value from 1 to 31 only.");}
	  }
	 catch(MyException mex) {
		  System.out.println("Exception: "+mex);
		  System.out.println("Please renter the value for day:");
		  //System.out.println(mex.getMessage());
		  b=true;
	  }}while(b==true);
	
  
  do {
	  try {
		  b=false;
	System.out.println("Enter the year in integer : ");
	y=s.nextInt();
	if(y<=1100||y>9999) {
		throw new MyException("You can enter the value from 1100 to 9999 only.");}
	}
	catch(MyException mex) {
		  System.out.println("Exception: "+mex);
		  System.out.println("Please renter the value for year:");
		  //System.out.println(mex.getMessage());
		  b=true;
	  }}while(b==true);
	

	System.out.println("Entered value for date is: "+m+"/"+d+"/"+y);
	
	temp=y;
	 int ye[]=new int[2];
	 temp=y;
		 ye[0]=temp/100;
		 ye[1]=temp%100;
		 
		 System.out.println("The given date in the english is: ");
         System.out.print(month.get(m)+"/"+day.get(d)+"/");
		 
	 if((ye[0]%10)==0) {
		 System.out.print(year.get(ye[0]/10)+" Thousand ");
	 }
	 
	 else {
		 System.out.print(year.get(ye[0])+" Hundred ");
	 }
	
   if(ye[1]==00) {
	  // System.out.print(" Hundred");
   }
   
   else {
	   System.out.print("and "+year.get(ye[1]));
   }
	
	//for(int i=0;i<2;i++) {
  	//System.out.print(year2.get(ye[i])+" ");}
}}