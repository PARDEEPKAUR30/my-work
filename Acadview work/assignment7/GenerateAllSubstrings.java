package assignment7;

public class GenerateAllSubstrings {
public static void main(String arg[]) {
	String str="XYZ";
	int count=1;
	System.out.println("The all possible substrings of '"+str+"'");
	for(int i=0;i<3;i++) {
		for(int j=3;j>=1&&j!=i;j--) {
			System.out.println(count+". "+str.substring(i,j));
			count=++count;
		}
		}
	//System.out.println(str.substring(i,j));
}
}
