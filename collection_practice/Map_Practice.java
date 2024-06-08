package collection_practice;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.*;

public class Map_Practice {

	public static void main(String[] args) {
		Map<Integer,String> M = new LinkedHashMap<>();
		     
		M.put(123,"Bhargavi");
		M.put(12, "Satheesh");
		M.put(3, "Vijaysai");
		M.put(4, "Lucky kutti");
		
		System.out.println(M);
		
	 
		Set<Integer> k=M.keySet();
		System.out.println(k);
		for(Integer Keysnumbers:k) {
			System.out.println(Keysnumbers);
		}
		Collection<String> V = M.values();
		//System.out.println(V);
		for(String Valueofset:V) {
			System.out.println(Valueofset);
		}
		//M.remove(123);
		//System.out.println(M);
		System.out.println(M.containsKey(123));
		System.out.println(M.containsValue("Satheesh"));
		
		M.putIfAbsent(143, "Bharu");
		System.out.println(M);
		System.out.println(M.hashCode());
		
		Set<Entry<Integer,String>> enrypairofvalues=M.entrySet();
		System.out.println("Entryset values are :"+enrypairofvalues);
		System.out.println("Keyset values are :"+M.keySet());
		
	}
}
