package com.array.single;

public class Merge2in1Array {
	public static <arr1> void main(String[] args) {
		
		 // initialize the required array.
//	    int arr1[] = new int[50];
//	    int arr2[] = new int[50];
//	    int merge[] = new int[100];
	    
	    int arr1[] = new int[10];
	    arr1[0]=1;arr1[1]=2;arr1[2]=3;arr1[3]=4;arr1[4]=5;arr1[5]=6;
	    int arr2[] = new int[5];
	    arr2[0]=11;arr2[1]=12;arr2[2]=13;arr2[3]=14;
	    int mergeSize=arr1.length+arr2.length;
	    int merge[] = new int[mergeSize];
	    int count=0;
	    for (int i = 0; i < arr1.length; i++) {
	    	if(arr1[i]!=0) {
	        merge[i] = arr1[i];
	    	count++;}
	      }

	      
	    int count1=0;
	      for (int i = 0, k = arr1.length-count+2; k <mergeSize-5 && i < arr2.length; i++, k++) {
	        
	        if(arr1[i]!=0) {
	        	merge[k] = arr2[i];
		    	count1++;}
	      }
	      
	      int total=count+count1;
	      System.out.print("New array after merging is :\n");
	      for (int i = 0; i < total; i++) {
	        System.out.print(merge[i] + "  ");
	      }

	}

}
