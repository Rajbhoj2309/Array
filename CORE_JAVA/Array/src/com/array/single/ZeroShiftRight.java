package com.array.single;


public class ZeroShiftRight {
	
	public static void main(String[] args) {
		int arr[]= {0,7,6,0,5,4,7,0,3};
		int s= 0;
		for (int i = 0; i < arr.length; ++i) {
			
			if (arr[i]!=0) {
//				arr[s++]=arr[i];
				arr[s]=arr[i];
				s++;
			}
		}
				while (s<arr.length) {
					arr[s++]=0;
				}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
