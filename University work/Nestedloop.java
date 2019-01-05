class loop{
private int i,j,k;
public void forloop(){
	for(i=1;i<=7;i++){
		if(i==6)
			break;
		System.out.print(i);
		for(j=1;j<=5;j++){
			if(j==4)
				continue;
						System.out.print(" *"+j);
			for(k=1;k<=4;k++) {
				if(k==3)
					break;
				System.out.print(" k"+k);
			}						
		}
		
				System.out.println();
		
		}
}
}
public class Nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
loop l=new loop();
l.forloop();
	}

}
