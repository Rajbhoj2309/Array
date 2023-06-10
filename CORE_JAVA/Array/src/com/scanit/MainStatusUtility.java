package com.scanit;

import java.util.Map;
import java.util.TreeMap;

public class MainStatusUtility {
	
	public static void main(String[] args) {
		TreeMap<String, Integer> sortedMap=new TreeMap<>(StatusUtil.getStatusIndexMap());
		
		for(Map.Entry<String, Integer> entry: sortedMap.entrySet()) {
			System.out.println(entry.getKey() +"  "+entry.getValue());
		}
TreeMap<String, String> sortedMap1=new TreeMap<>(StatusUtil.getStatusItemMap());
		
		for(Map.Entry<String, String> entry: sortedMap1.entrySet()) {
			System.out.println(entry.getKey() +"  "+entry.getValue());
		
	}
	}

}
