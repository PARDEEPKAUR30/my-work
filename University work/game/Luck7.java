package game;

public class Luck7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dice=(int)(Math.random()*10);
int amt=100;
if(dice<7) {
	System.out.println("Dice rolled to "+dice);
	amt=amt*1;
	System.out.println("you get "+amt+" as wining prize");
}
if(dice==7) {
	System.out.println("Dice rolled to"+dice);
	amt=amt*2;
	System.out.println("you get "+amt+" as wining prize");
}
if(dice>7) {
	System.out.println("Dice rolled to"+dice);
	amt=amt*3;
	System.out.println("you get "+amt+" as wining prize");
}
	}

}
