package com.array.Double;

public class TwoDimentionalArrayMaxMinValue {
	public static void main(String[] args) {
		int a[][]= {{3,8,5},{4,1,7}};
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (max<a[i][j]) {
					max=a[i][j];
				}
				if (min>a[i][j]) {
					min=a[i][j];
				}
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
