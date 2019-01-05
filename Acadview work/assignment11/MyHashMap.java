package assignment11;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
public static void main(String arg[]) {
	Map<Integer,String> ht=new HashMap<>();
	ht.put(1, "Pardeep");
	ht.put(2, "Harneet");
	ht.put(3, "Deep");
	System.out.println("The size of the HashMap is: "+ht.size());
	System.out.println("The values of the HashMap are: "+ht.values());
	System.out.println("Is HashMap contain the key 6: "+ht.containsKey(6));
	System.out.println("Is HashMap contain the value 'Pardeep Kaur': "+ht.containsKey("Pardeep kaur"));
	ht.remove(2);
	System.out.println("The values of the HashMap after removed the key 2 are: "+ht.values());
	ht.replace(3, "Deep", "Kaur");
	System.out.println("The values of the HashMap after replaced the key 3 are: "+ht.values());
}
}
