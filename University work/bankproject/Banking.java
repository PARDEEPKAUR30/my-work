package bankproject;
import java.util.*;
class Details{
	Scanner input=new Scanner(System.in);
String F_NAME,L_NAME,S_NAME,GENDER;
int day,month,year;
long Mobile_no; 
int loop,l;
	Details(){
System.out.println("Welcome to PNB Bank!");
System.out.println("Kindely enter your details for creating the new Bank Account");}
void loop(){

	do {
		l=0;
		try {
System.out.println("FIRST NAME: " );
F_NAME=input.next();
System.out.println("LAST NAME: " );
L_NAME=input.next();
System.out.println("SURNAME: " );
S_NAME=input.next();
System.out.println("DATE OF BIRTH: DD/MM/YYYY" );
do {l=0;
System.out.println("DAY: ");
day=input.nextInt();
if(day<0||day>31)
{System.out.println("You entered wrong input. Please try again:");
l=1;}
}while(l==1);
do {l=0;
System.out.println("MONTH: ");
month=input.nextInt();
if(month<0||month>12)
{System.out.println("You entered wrong input. Please try again:");
l=1;}
}while(l==1);
do {l=0;
System.out.println("YEAR: ");
year=input.nextInt();
if(year<1930||year>2018)
{System.out.println("You entered wrong input. Please try again:");l=1;}
}while(l==1);
do {l=0;
System.out.println("GENDER: " );
System.out.println("Please enter /n 1. F for FEMALE/n 2. M for MALE: " );
 GENDER=input.next();
 switch(GENDER){
 case "F":
	 GENDER="Female";
	 break;
 case "f":
	 GENDER="Female";
	 break;
 case "M":
	 GENDER="male";
	 break;
 case "m":
	 GENDER="male";
	 break;
	 default:
		 System.out.println("Please reenter again: ");
		l=1;
		break;
 }}while(l==1);
System.out.print("MOBILE NUMBER: +91" );
Mobile_no=input.nextLong();
System.out.println("Your detail is: ");
System.out.println("FIRST NAME: "+F_NAME );
System.out.println("LAST NAME: "+L_NAME );
System.out.println("SURNAME: "+S_NAME );
System.out.println("DATE OF BIRTH: "+day+"/"+month+"/"+year );
System.out.println("GENDER: "+GENDER );
System.out.println("MOBILE NUMBER: +91"+Mobile_no );
System.out.println("Kindely check your detail and select your desire action:");
do {loop=0;
System.out.println("1.Enter 1 to finalise your detail and\n2.Enter 2 to refill your detail\n3.Enter 3 for exit");
l=input.nextInt();
if(l!=1&&l!=2&&l!=3) {
	System.out.println("You entered the wrong input for action. Please enter again");
	loop=5;
}
if(l==3) {
	System.out.println("Thank you");}
if(l==1) {
	System.out.println("Welcome "+F_NAME+" "+L_NAME+" "+S_NAME+" to PNB(Punjab National Bank) Bank!");
}

if(year>2000) {
System.out.println("sorry we can not create Bank Account for a person below 18 years");
l=0;}}while(loop==5);}
catch(InputMismatchException i) {
	System.out.println("Please reenter your detail and make sure you enter information in right datatype in  ");
	System.out.println("Please refill your information:");
	l=2;
	input.nextLine();
}
}while(l==2);
}}


class Account extends Details{
	int type,amount,a_no[],password;
int a=0;
	void type() {
		if(l==1) {
			do {
				try {type=0;	
		System.out.println("What type of Account you would like to create:");
		System.out.println("1.Enter 1 for single user Account\n2.Enter 2 for joint Account\n Kindley enter your option: ");
		type=input.nextInt();
		if(type==1)
		System.out.println("You are interested for ceating  Single User Account");
		else if (type==2)
		System.out.println("You are interested for ceating  Single User Account");
		else
			System.out.println("You entered an invalid option. Kindly choose a valid option");}
		catch(InputMismatchException i) {
			System.out.println("Please reenter your option and make sure you enter information in right datatype in  ");
			type=0;
			input.nextLine();}}while(type!=1&&type!=2);
		do {
			try {
			System.out.println("What type of Account you would like to create:");
			System.out.println("1.Enter 1 for Saving Account\n2.Enter 2 for Current Account\n Kindley enter your option: ");
			type=input.nextInt();
			switch(type) {
		    case 1:
			System.out.println("You are interested for ceating a Saving Account");
			System.out.println("With what Amount you would like to start your account?\n Please enter the Amount: ");
			do{l=1;
				amount=input.nextInt();
			if(amount<500) {
				System.out.println("The amount should be atleast 500 INR. Please reenter the amount:");
				l=0;
			}}while(l==0);
			System.out.println("Your Saving Account is ceated.");
			a=1;
			break;
			case 2:  
			System.out.println("You are interested for ceating a Current Account");
			System.out.println("With what Amount you would like to start your account?\n Please enter the Amount: ");
			do {l=1;
			amount=input.nextInt();
			if(amount<1000) {
				System.out.println("The amount should be atleast 1000 INR. Please reenter the amount:");
				l=0;
			}}while(l==0);
			System.out.println("Your Current Account is ceated.");
			a=1;
             break;
			default:
				System.out.println("You entered an invalid option. Kindly choose a valid option");
			}}
			catch(InputMismatchException i) {
				System.out.println("Please reenter your option and make sure you enter information in right datatype in  ");
				type=0;
				input.nextLine();}
		}while(type!=1&&type!=2);
		}}
	
	long acc=0;	
	void accountNumber() {	
		if(a==1) {
		a_no=new int[10];
		//if(type==2||type==3) {
		System.out.println("Your Account Number is: ");
		for(int i=0;i<10;i++)	{
		a_no[i]=(int)(Math.random()*10);
		acc=acc*10+a_no[i];		
		}
		System.out.println("\n"+acc);}}
		
	void password() {
		if(a==1) {
		int l1=0;
		//if(type==2||type==3) {
		System.out.print("\nPlease set Password for your Account:\nKindely enter a 4 digit Password: ");
		do{
			l1=0;try {
			password=input.nextInt();}
		catch(InputMismatchException i) {
			System.out.println("Please reenter the password and make sure you enter Password in Integer datatype.  ");
			l1=1;
			input.nextLine();}
		if(password<0000||password>9999) {
			System.out.print("\nYou entered wrong Password.:\nKindely reenter a 4 digit Password: ");	
		l1=1;}}while(l1==1);
	}}}
	
class  BankingActions extends Account{
	
	void verification() {
		if(a==1) {
		int l2;
	System.out.println("Please enter your Account number and password for using Banking actions.");
	System.out.print("Kindely enter your Account number: ");
	try{
		do {l2=0;
	long acn=input.nextLong();
	if(acn!=acc) {
		System.out.println("You entered wrong Account Number.\nPlease reenter the Account Number: ");
	l2=1;
	}}while(l2==1);
	System.out.print("Kindely enter your Password: ");
	do {l2=0;
	int pass=input.nextInt();
	if(pass!=password) {
		System.out.println("You entered wrong Password.\nPlease reenter the Password: ");
	l2=1;
	}}while(l2==1);}
		catch(InputMismatchException i) {
			System.out.println("Please reenter your option and make sure you enter information in right datatype in  ");
			l2=0;
			input.nextLine();}
		}}
	void actions() {
		if(a==1) {
		int l4,l6,l7;
		int action;
		System.out.println("Welcome "+F_NAME+" "+L_NAME+" "+S_NAME+" to PNB(Punjab National Bank) Bank!");
		
			do {	action=0;
			try{
		System.out.println("What would you like to do: ");
		do {
			l6=0;
		System.out.println("1. Enter 1 for Check Balance");
		System.out.println("2. Enter 2 for Add amount");
		System.out.println("3. Enter 3 for Withdraw amount");
		System.out.println("4. Enter 4 for exit");
		System.out.println("Kindley enter your option: ");
	      action=input.nextInt();
		switch(action){
		case 1:
			System.out.println("Your Balance is: "+amount);
			break;
		case 2:
			System.out.println("How much amount you want to add into your account : ");
		   int rupess=input.nextInt();
		   amount=amount+rupess;
		   System.out.println("Your new Balance is: "+amount);
		   break;
		case 3:int l5;
			do {l5=0;
			System.out.println("What type of Account you have:");
			System.out.println("1.Enter 1 for Saving Account\n2.Enter 2 for Current Account\n Kindley enter your option: ");
		   int l3=input.nextInt();
			System.out.println("How much amount you want to withdraw from your account : ");
			   do{ l4=0;
				   rupess=input.nextInt();		
			   switch(l3) {
			   case 1:
				   if(rupess>amount||rupess<0) {
					   System.out.println("Sorry you cannot Withdraw amount more than "+amount);
					   System.out.println("Kindely rerender the withdraw amount :");
					   l4=1;
					   break;
				   }
			   amount=amount-rupess;
			   System.out.println("Your new Balance is: "+amount);
			   break;
			   case 2:
				   if(rupess>amount-1000||rupess<0) {
					   System.out.println("Sorry you cannot Withdraw amount more than "+(amount-1000));
					   System.out.println("Kindely rerender the withdraw amount :");
					   l4=1;
					   break;
				       }  
				   amount=amount-rupess;
				   System.out.println("Your new Balance is: "+amount);
				   break;
				   default:
					   System.out.println("You enterd the wrong option. Please reenter the option: ");
					   l5=1;
					   
	                 }
			   }while(l4==1);
			   }while(l5==1);
			break;
		case 4:
			System.out.println("Thank you!");
			break;
			default:
			System.out.println("You enterd the wrong option. Please reenter the option: ");
			
			   l6=1;}}while(l6==1);
		//System.out.println("What you want to do next:");	
			}catch(InputMismatchException i) {
				System.out.println("Please reenter your option and make sure you enter information in right datatype in  ");
				type=0;
				input.nextLine();
				action=0;}}while(action!=4);}
		
				}
	
}


public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankingActions d=new BankingActions();
d.loop();
d.type();
d.accountNumber();
d.password();
d.verification();
d.actions();
	}

}
