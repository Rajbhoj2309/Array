package com.array.single;

public class MissingElement {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,6,7,8,9};//40
		int sum=0;
		int n=9;
		int expectedSum=n*((n+1)/2);
		for (int i : a) {
			sum=sum+i;
		}
		
		int missingNumberIs=expectedSum-sum;
		System.out.println(missingNumberIs);
	}

}
