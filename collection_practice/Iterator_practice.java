package collection_practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_practice {
public static void main(String[] args) {
	ArrayList<String> a = new ArrayList<>();
	
	a.add("Mukkalathur");
	a.add("Bangalore");
	a.add("Kothakota");
	
	System.out.println(a);
	 Iterator<String> i = a.iterator();
	
	 while(i.hasNext()) {
		 System.out.println(i.next());
	 }
	 i.remove();
	 System.out.println(a);
}
}
