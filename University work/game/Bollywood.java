package game;
import java.util.*;
public class Bollywood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String []string= {"don","ironman","student of the year","tiger back again","frozen","sardar mahomand","vivah","kuch kuch hota hai","mujh se dosti karogi","hum saath saath hai"};
int option;
int r;
Scanner s=new Scanner(System.in);
do {
	String s2;
	int i=0,x=0,l=0,v=0,u=0;
	char c[]=new char[26];
r=(int)(Math.random()*10);
char ch[]= new char[string[r].length()];
char fs[]=new char[string[r].length()];
for(int z=0;z<string[r].length(); z++)
{
	if(string[r].charAt(z)==' ')
	System.out.print("  ");
else
	System.out.print("_ ");
	}
for(int j=9;j>0;j--) {
	int value=j;
	System.out.println("Chances are left:"+ j);
		System.out.println("Guess the character");	
		char character=s.next().charAt(0);
		int a=0;
		  for(i=0;i<l;i++){
			if (c[i]==character) {
			 System.out.println("Charcater is repeated");
			a=1;
			j=value+1;
			}}
        if(a==0) {
	      c[i]=character;
       for(int k=0;k<string[r].length();k++) {	
	    if( string[r].charAt(k)==c[i]) {	
		ch[x]=c[i];
		while(j<=value) {
		j++;	
		} v=x;}
	    }
	    }i++;
	      l=i;
	int b;
	for(int g=0;g<string[r].length();g++)
     { b=0;
		for(x=0;x<=v;x++) {
	if(string[r].charAt(g)==ch[x]) {
		System.out.print(ch[x]);
		fs[g]=ch[x];
		b=1;
		}}
	 if(string[r].charAt(g)==' ') {
		System.out.print("  ");
		fs[g]=' ';
		b=1;}
	if(b==0)
		System.out.print("_ ");
	}
	s2=String.valueOf(fs);
	
	if(string[r].equals(s2)) {
		System.out.println();
		System.out.println("you won the Game");
		u=1;j=0;}
	}
if(u==0) {
	System.out.println();
    System.out.println("you loss the Game");
    System.out.println("Given name is: "+string[r]);
    System.out.println("Game over");}
    System.out.println("Enter 1 if you want to play again");
    System.out.println("Enter 0 if you want to exit");
    option=s.nextInt();
}while(option==1);
s.close();}}


