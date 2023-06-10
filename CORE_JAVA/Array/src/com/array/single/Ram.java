package com.array.single;

import java.util.Arrays;

public class Ram {
	
	public static void main(String[] args) {
//		String str="sEpTeBer";
		int a[]= {7,8,1,2,7,3,1};
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i -1; j++) {
				if (a[j]>=a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}		} 	}
			System.out.print(Arrays.toString(a));
			for (int i = 0; i < a.length-1; i++) {
				if(a[i]!=a[i+1])
				System.out.println(a[i]);
			}
			}
	
		
		
	}


