package com.array.single;

public class missing2ElementsNonseries {
	public static void main(String[] args) {
		int a[]= {1,3,4,5,6,8,9};//36
		
		int sum=0;
		int n=9;
		int expectedSum=n*((n+1)/2);
		for (int i : a) {
			sum=sum+i;
		}
		
		int missingNumberIs=expectedSum-sum;
		int firstMissingNumber=n-2;
		int secondMissingNumber=missingNumberIs-firstMissingNumber;
//		System.out.println(missingNumberIs);
		System.out.println(firstMissingNumber);
		System.out.println(secondMissingNumber);
	}

}
