package com.array.sortingElement;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int a []= {38,52,9,18,6,62,13};
		 //print original array
        System.out.println("Original array: " + Arrays.toString(a));
        //iterate over the array comparing adjacent elements
        for (int i = 0; i<a.length-1; i++)
            for (int j = 0; j<a.length-i-1; j++)
                //if elements not in order, swap them    
                if (a[j] < a[j+1])  {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
        //print the sorted array        
        System.out.println("Sorted array: " + Arrays.toString(a));
	}

}
