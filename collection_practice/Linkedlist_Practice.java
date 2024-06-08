package collection_practice;

import java.util.LinkedList;

public class Linkedlist_Practice {
public static void main(String[] args) {
	LinkedList L1 = new LinkedList();
	L1.add(1);
	L1.add(1, 4);
	System.out.println(L1);
	L1.addFirst("Bhargavi");
	L1.addLast("Satheesh");
	System.out.println(L1);
	L1.clone();
	System.out.println(L1);
}
}
