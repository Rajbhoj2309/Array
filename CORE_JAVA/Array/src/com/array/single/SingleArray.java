package com.array.single;

public class SingleArray {
	Integer []arr= {1,2,2,3,4,5,5};
	
	Integer j=0;
	
	public void m1() {
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
			arr[j]=arr[arr.length-1];
			System.out.println(j);
		}
		int sum=0; int temp=0;
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print(",  "+arr[i]);
		//	sum=sum + arr[i];
			
			
			System.out.println();
		//	System.out.println("..."+sum);
			sum=arr[i]+sum;System.out.println("..."+sum);
//			sum=sum+arr[i];System.out.println("./."+sum);
//			++sum;
//			++temp;
		}
		System.out.println("Sum is: " + sum);
//		System.out.println(temp);
	}
	public static void main(String[] args) {
		SingleArray obj=new SingleArray();
		obj.m1();
	}

}
