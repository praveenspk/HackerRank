package com.spk.practice.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	
	public static void main(String[] args) {
		
		Map<Object, String> map=new HashMap<Object, String>();
		map.put(null, "alkhf");
		map.put(null, "hfdsa");
		map.put(1, "One");
		map.put(2, "Two");
		map.put(null,"null");
		map.put(null, "value");
		System.out.println(map);


	}

}
