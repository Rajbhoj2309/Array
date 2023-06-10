package com.array.single;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementin2Array {
	public static void main(String[] args) {
		Integer[] aa= {1,8,2,6,3,4,12,8};
		Integer[] bb= {12,2,6,5,7,12};
		
		List<Integer> list1 =new ArrayList<Integer>( Arrays.asList(aa));
		List <Integer>list2 = new ArrayList<Integer>( Arrays.asList(bb));
//		list1.retainAll(list2);
//		System.out.println(list1.retainAll(list2));
		System.out.println(list1);
		//
		List<Integer>finalIst=list1.stream().filter(item ->list2.contains(item)).collect(Collectors.toList());
		System.out.println("finalIst " +finalIst);
		
		Set<Integer> collect = list1.stream().filter(e->Collections.frequency(list1, e)>1).collect(Collectors.toSet());
		System.out.println(collect);
		
	}
}
