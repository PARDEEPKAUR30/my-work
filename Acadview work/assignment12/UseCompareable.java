package assignment12;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class MyList1 implements Comparable<MyList1>{
	int age;
	String name;
public MyList1(String name, int age) {
	this.name=name;
	this.age=age;
}

public int compareTo(MyList1 o) {
	return (this.age-o.age);
}
 }
 
public class UseCompareable {
	public static void main(String arg[]) throws IOException{
		ArrayList<MyList1> list=new ArrayList<>();
		list.add(new MyList1("Pardeep",23));
		list.add(new MyList1("Hardeep",20));
		list.add(new MyList1("Deep",15));
		list.add(new MyList1("Harjit",25));
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).name+" "+list.get(i).age);
		}
		
	}
}
