package collection_practice;

import java.util.Vector;
import java.util.*;
public class Vector_Practice {
public static void main(String[] args) {
	Vector v1 = new Vector();
	v1.add("Bhargavi");
	v1.add("Satheesh");
	v1.add(0,"SAI");
	v1.add(1,"Lucky");
	
	System.out.println(v1);

	v1.set(2, "Satheesh");
	System.out.println(v1);
v1.setElementAt("Satheesh", 3);
System.out.println(v1);

System.out.println(v1.firstElement());
//System.out.println(v1.capacity());
//System.out.println(v1.size());

}
}
