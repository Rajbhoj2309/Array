package com.Examples;

public class Duplicate {
	public static void main(String[] args) {
		int ar []= {1,2,3,4,5,8,7,8,9,1,10};
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j<ar.length; j++) {
				if (ar[i]==ar[j]) {
					System.out.print(ar[j]+" ");
				}
			}
		}
	}
}
