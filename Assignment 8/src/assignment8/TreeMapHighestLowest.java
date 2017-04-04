package com.corejava.assignment8;

import java.util.TreeMap;

public class TreeMapHighestLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap tm = new TreeMap();
tm.put("1", "hi");
tm.put("2", "hello");
tm.put("3", "bye");
tm.put("4", "what");
tm.put("5", "how are you");
tm.put("0", "hey");
System.out.println(" lowest key in given treemap is:" + tm.firstKey());
System.out.println(" lowest key in given treemap is:" + tm.lastKey());
	}

}
