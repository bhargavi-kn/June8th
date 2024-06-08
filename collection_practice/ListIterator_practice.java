package collection_practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator_practice {

	public static void main(String[] args) {
		LinkedList<Integer> L = new LinkedList<>();
		L.add(5);
		L.add(8);
		L.add(9);
		
		System.out.println(L);
		 ListIterator<Integer> Li = L.listIterator();
		 
		 while (Li.hasNext()) {
			 System.out.println(Li.next());
		 }
		 while(Li.hasPrevious()) {
			 System.out.println("Previous details "+Li.previous());
		 }
		 Li.add(3);
		 System.out.println(L);
		 
	}
}
