package com.array.single;

public class MinMax {
	public static void main(String[] args) {
		
	int a[]=new int [] {10,20,5,30,4,40};	
		for (int i : a) {
			System.out.print(i+",");
		}
		
		//minimum element of the array
		System.out.println();
		System.out.println("minimum element of the array");
		int min=a[0];
		for (int i = 1; i < a.length; i++) 
		{
			System.out.println("loop = "+i+"   "+"value = "+a[i]);
			if(min>a[i])
				
			{
				System.out.println("previous = "+min +"  "+a[i]);
				min=a[i];
				System.out.println("next = "+min +"  "+a[i]);
			}
		}
		System.out.println("minimum value is "+min);
			// maximum element of the array
		System.out.println("maximum element of the array");
		int max=a[0];
		
		for (int i = 1; i < a.length; i++) 
		{
			System.out.println("loop = "+i+"   "+"value = "+a[i]);
			if(max<a[i])
				
			{
				System.out.println("previous = "+max +"  "+a[i]);
				max=a[i];
				System.out.println("next = "+max +"  "+a[i]);
			}
		}
		System.out.println("maximum value is "+max);

	}
	
}
