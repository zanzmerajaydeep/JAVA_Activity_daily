package day_8_Ex1;

import java.util.HashMap;
import java.util.TreeMap;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// here String is a key and integer is a value
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("one", 4);// latest update is remain and old remove...HasMap
		
		System.out.println(hm);
		System.out.println(hm.put("raina", 6));
		System.out.println(hm.put("two", 6));
		
		hm.put(null, 7);
		System.out.println(hm);
		
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("one", 1);
		tm.put("two", 2);
		tm.put("three", 3);
		tm.put("one", 4);// latest update is remain and old remove...HasMap
		
		System.out.println(tm);
		
		

	}

}
