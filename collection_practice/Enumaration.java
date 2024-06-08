package collection_practice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;
//Enumaration is only for legacy classes.
public class Enumaration {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(3);
		v.add(45);
		v.add(89);
		v.add(56);
		
		System.out.println(v);
		
		Enumeration<Integer> e =v.elements();
		
		//System.out.println(e);
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
}
