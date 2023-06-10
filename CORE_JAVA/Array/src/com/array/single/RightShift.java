package com.array.single;

public class RightShift {
	
	public static void main(String[] args) {
		
		int A[]= {7,5,9,1,8,4};
		
		for (int x:A) {
			System.out.print(x+",");
		}
		 int x=4;
		 
		for (int i=5; i>0; i--) {
			A[i]=A[i-1];
		}
		A[0]=x;
		System.out.println();
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+",");
		}
	}

}
