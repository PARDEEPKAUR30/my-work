class pat3 {
	void loop() {
	for(int i=1;i<=5;i++) {
		for(int j=5;j>i;j--)
			System.out.print(" ");
		for(int k=1;k<=i;k++)
	System.out.print("* ");
	
	System.out.println("");
}}}
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pat3 p3=new pat3();
		  p3.loop();
	}

}
