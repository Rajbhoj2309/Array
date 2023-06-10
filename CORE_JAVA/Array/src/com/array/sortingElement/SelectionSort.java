package com.array.sortingElement;

public class SelectionSort {
	public static void main(String[] args) {
		int a []= {38,52,9,18,6,62,13};
		
//		for (int i = 0; i < a.length; i++) {
//			int min=i;
//			int temp = 0;
//			for (int j = i+1; j < a.length; j++) {
//				
//				if (a[i]<a[j]) {
//				
//				// swap minimum element with compared element  
//	            temp = a[min]; 
//	            a[min] = a[i]; 
//	            a[i] = a[j];
//	            a[j]=temp;
//				}
//			}
//			
//		}
		for (int i = 0; i < a.length-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < a.length; j++) 
                if (a[j] < a[min_idx]) 
                    min_idx = j; 
   
            // swap minimum element with compared element  
            int temp = a[min_idx]; 
            a[min_idx] = a[i]; 
            a[i] = temp; 
        } 
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}		
	}
}
