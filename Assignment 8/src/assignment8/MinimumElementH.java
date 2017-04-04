package com.corejava.assignment8;
import java.util.HashSet;
import java.util.Collections;
public class MinimumElementH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet MySet = new HashSet();
		MySet.add(new Long("12"));
		MySet.add(new Long("21"));
		MySet.add(new Long("1"));
		MySet.add(new Long("2"));
		MySet.add(new Long("122"));
		MySet.add(new Long("10"));
		MySet.add(new Long("0"));
		Object ob = Collections.min(MySet);
		System.out.println("min. element:" + ob);
			}
	}
