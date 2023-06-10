package com.array.single;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfElements {
	public static void main(String[] args) {
		int a[]= {5,2,8,7,3,6,4,5,1};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		int total=IntStream.of(a).sum();
		System.out.println("total = "+total);
		
		int total1=Arrays.stream(a).sum();
		System.out.println("total1 = "+total1);
	}

}
