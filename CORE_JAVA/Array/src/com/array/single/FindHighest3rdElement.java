package com.array.single;

public class FindHighest3rdElement {
	public static void main(String[] args) {
		int[] arr={1,5,4,16,5,8,6,8,6,16,7,8,4,6,16};
		int largest = Integer.MIN_VALUE;
		int li=arr.length;
		int [] positionF = new int [li];
	    int secondLargest = Integer.MIN_VALUE;
	    int []positionS = new int [li];
	    int thirdLargest=Integer.MIN_VALUE;
	    int []positionT = new int [li];
	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i] > largest) {
	        secondLargest = largest;
	        largest = arr[i];
	        positionF[i]=i;
	      }
	      else if (arr[i] > secondLargest && arr[i] != largest) {
		        secondLargest = arr[i];
		        positionS[i]=i;
		      }
	      else if (arr[i] > thirdLargest &&arr[i] != secondLargest && arr[i] != largest) {
	    	  thirdLargest = arr[i];
	        positionT[i]=i;
	      }
	    }
	    
	    if (largest==Integer.MIN_VALUE||secondLargest == Integer.MIN_VALUE) {
	        System.out.println("There is no second highest/largest element in the array");
	      } else {
	    	  for (int i = 0; i < positionF.length; i++) {
	    		  System.out.println("first highest element in array is :" + largest+"  "+positionF[i]);
			}
	    	  for (int i = 0; i < positionF.length; i++) {
	    		  System.out.println("Second highest element in array is :" + secondLargest+"  "+positionS[i]);
			}
	        
	        for (int i = 0; i < positionT.length; i++) {
	        	System.out.println("Third highest element in array is :" + thirdLargest+"  "+positionT[i]);
			}
	      }
	}

}
