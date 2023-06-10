package com.array.single;

public class SecondLargestElement {
	public static void main(String[] args) {
		Integer arr[] = {30,55,10, 55,35,48,20,48,42,55};
		int position = 0;
		int largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;
	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i] > largest) {
	        secondLargest = largest;
	        largest = arr[i];
	        position=i;
	      } else if (arr[i] > secondLargest && arr[i] != largest) {
	        secondLargest = arr[i];
	        position=i;
	      }
	    }
	    
	    if (secondLargest == Integer.MIN_VALUE) {
	        System.out.println("There is no second highest/largest element in the array");
	      } else {
	        System.out.println("Second highest element in array is :" + secondLargest+"  "+position);
	      }
	   
	}
}
