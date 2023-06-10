package com.array.single;

public class missingElements11 {
	public static void main(String[] args) {
		int a[]= {12,14,15,13,17,18};//89
		int n=70;
		int arraySum=0;
		for (int i = 0; i < a.length; i++) {
			arraySum=arraySum+a[i];
		}
		System.out.println(arraySum);
		int ExpectedSum=0;
		for (int i =12; i <19 ; i++) {
			ExpectedSum=ExpectedSum+i;
		}
		System.out.println(ExpectedSum);//105
		int missingMissingNumber=ExpectedSum-arraySum;
		System.out.println(missingMissingNumber);
	}

}
