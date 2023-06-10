package com.array.single;

public class Missing2Element {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,7,8,9};//40
		int sum=0;
		int n=9;
		int expectedSum=n*((n+1)/2);
		for (int i : a) {
			sum=sum+i;
		}
		
		int missingNumberIs=expectedSum-sum;
		int firstMissingNumber=missingNumberIs/2;
		int secondMissingNumber=missingNumberIs-firstMissingNumber;
//		System.out.println(missingNumberIs);
		System.out.println(firstMissingNumber);
		System.out.println(secondMissingNumber);
	}
}
