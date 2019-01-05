class pat5 {
	void loop() {
	for(int i=1;i<=6;i++) {
		for(int j=1;j<=12;j++) {
			if(j<=i||j>=13-i)
	System.out.print("*");
			else
			System.out.print(" ");
	}
	System.out.println("");
}}}
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 pat5 p5=new pat5();
		  p5.loop();
	}

}
