package collection_practice;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Arraylist_practice {

	public static void main(String[] args) {
	ArrayList A1 = new ArrayList();
	A1.add(1);
	A1.add(2);
	A1.add(3);
	//System.out.println(A1);
	A1.add(0,4);
	//System.out.println(A1);

	A1.remove(1);
	//System.out.println(A1);

	A1.set(1, 5);
	//System.out.println("Set of "+A1);

	A1.get(2);
	//System.out.println(A1);

	//System.out.println(A1.contains(5));
	for(int i=0;i<A1.size();i++)
	{
		System.out.println("for loop "+A1.get(i));
	}
	}

	
}
