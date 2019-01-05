class number{
	int sum=0;
	int i=1;
	void loop() {
	do
	{
		sum=sum+i;
		i++;
	}
	while(i<=50);
	System.out.println("Sum of frist 50 natural number is "+sum);
}}
public class NaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
number n=new number();
n.loop();
	}

}
