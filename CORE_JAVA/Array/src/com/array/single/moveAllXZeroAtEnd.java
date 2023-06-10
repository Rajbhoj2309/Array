package com.array.single;

public class moveAllXZeroAtEnd {
	public static void main(String[] args) {
		int arr[]= {5, 1, 6, 0, 0, 3, 9, 0, 6, 7, 8, 12, 10, 0, 2,20};
	int count = 0,zero=0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]!=0) {
			arr[count++]=arr[i];
			System.out.println(arr[count]);
		}else
		zero++;
	}
//	System.out.println("dqwe"+count);
//	System.out.println("zero"+zero);
	while(count<arr.length) {
		arr[count++]=0;
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	}
}
