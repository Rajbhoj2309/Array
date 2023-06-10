package com.array.single;

import java.util.Iterator;

public class leftShift {
	
	public static void main(String[] args) {
		
		int A[]= {1,9,4,7,8,2,3,6,5,0};
		
		for(int z:A) {
			System.out.print(z+",");
		}
		
		int temp=A[0];
		for (int i = 1; i < A.length; i++)
		{
			A[i-1]=A[i];
		}
		A[A.length-1]=temp;
		System.out.println();
		for(int x:A) {
			System.out.print(x+",");
		}
		 			
	}

}
