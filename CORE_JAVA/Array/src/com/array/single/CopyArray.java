package com.array.single;

public class CopyArray {
	public static void main(String[] args) {
		int A[]= {5,10,7,9,1,2,8,45,24,3,6};
		System.out.println(A.length);
		int B[]=new int [11];
		for (int i = 0; i < B.length; i++) {
			B[i]=A[i];
		}
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i]+",");
		}
		
	}

}
