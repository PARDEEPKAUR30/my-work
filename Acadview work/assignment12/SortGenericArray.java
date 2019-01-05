package assignment12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class  Generic<generic> extends ArrayList {
	 //generic e;
	 ArrayList <generic>al;
	 Generic(){
		al=new ArrayList<>();
	 }
	void addElement(generic e){
		al.add(e);
	 }
	
	 void printList(List l) {
		 for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));}
		 }
}




public class SortGenericArray{

	public static void main(String[] args) {
  Generic gint=new Generic();
  gint.addElement(10);
  gint.addElement(7);
  gint.addElement(1);
  gint.addElement(3);
  System.out.println("The elements of integer array before sorting are:");
  gint.printList(gint.al);
Collections.sort(gint.al);
  System.out.println("The elements of integer array after sorting are:");
  gint.printList(gint.al);
  
 Generic gchar =new Generic();
  gchar.addElement('t');
  gchar.addElement('c');
  gchar.addElement('z');
  gchar.addElement('a');
  System.out.println("The elements of character array before sorting are:");
  gchar.printList(gchar.al);
  Collections.sort( gchar.al);
  System.out.println("The elements of character array after sorting are:");
  gchar.printList(gchar.al);  
  
  
  Generic gdouble =new Generic();
  gdouble.addElement(12.0);
  gdouble.addElement(1.04);
  gdouble.addElement(1.00);
  gdouble.addElement(7.50);
  System.out.println("The elements of double type array before sorting are:");
  gdouble.printList(gdouble.al);
  Collections.sort( gdouble.al);
  System.out.println("The elements of double type array after sorting are:");
  gdouble.printList(gdouble.al);  
	
	
	 Generic gfloat =new Generic();
	 gfloat.addElement(2.0f);
	 gfloat.addElement(1.04f);
	 gfloat.addElement(11.00f);
	 gfloat.addElement(5.50f);
	  System.out.println("The elements of float array before sorting are:");
	  gfloat.printList(gfloat.al);
	  Collections.sort( gfloat.al);
	  System.out.println("The elements of float array after sorting are:");
	  gfloat.printList(gfloat.al); 
	  
	  Generic gString =new Generic();
	  gString.addElement("hello");
	  gString.addElement("acadview");
	  gString.addElement("world");
	  gString.addElement("welcome");
		  System.out.println("The elements of string array before sorting are:");
		  gString.printList(gString.al);
		  Collections.sort( gString.al);
		  System.out.println("The elements of string array after sorting are:");
		  gString.printList(gString.al); 
		}

}
