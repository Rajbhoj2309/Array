package com.array.sortingElement;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		
		int a []= {38,52,9,18,6,62,13};
		 //apply insertion sort algorithm on the array
	    for(int i=1; i<a.length-1; i++)   {  
	        int temp = a[i];  
	        int j= i-1;  
	        while(j>=0 && temp <= a[j])   {  
	            a[j+1] = a[j];   
	            j = j-1;
	        }
	        a[j+1] = temp;  
	    }  
	    //print the sorted array
	    System.out.println("Sorted Array:" + Arrays.toString(a));
	}

}
