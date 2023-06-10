package com.array.single;

public class MoveZerosAtEnd {
	public static void main(String[] args) {
		int[] arr = { 5, 1, 6, 0, 0, 3, 9, 0, 6, 7, 8, 12, 10, 0, 2};
		 int size = arr.length;
		    int nonZeroElement = 0;
		    int zeroElement=0;
		    // access all array elements.
		    for (int i = 0; i < size; i++) {
		      if (arr[i] != 0) 
		        arr[nonZeroElement++] = arr[i];
		      else 
		    	  zeroElement++;
		    }
		    System.out.println("nonZeroElement"+nonZeroElement);
		    System.out.println("zeroElement"+zeroElement);
		    while (nonZeroElement < size)
		      arr[nonZeroElement++] = 0;
		    for (int i :arr)
			      System.out.print(i + " ");
		  }
	
}
