package com.corejava.assignment8;

import java.util.HashMap;

public class HashMapKeyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashMap H = new HashMap();
 H.put(1, "arun");
 H.put(2, "teja");
 H.put(10, 'T');
 H.put(13, "assksdakka");
 System.out.println("Key 13 exists:" + H.containsKey(13));
 System.out.println("value arunteja exists:" +H.containsValue("arunteja"));
	}

}
