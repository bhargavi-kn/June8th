package collection_practice;

import java.util.Stack;
//import java.util.Vector;

public class Stack_Practice {

	public static void main(String[] args) {
		Stack v1 = new Stack();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		System.out.println(v1);
		v1.push(5);
		System.out.println(v1);
		v1.pop();
		System.out.println(v1);
		v1.peek();
		System.out.println(v1); 
		System.out.println(v1.search(3));
		
	}
}
