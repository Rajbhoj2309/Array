package com.array.single;

public class ReturnParameterType {
	
	static void m1(int a[]) 
	{
		for (int x:a) {
			System.out.print(x+",");
		}
		System.out.println();
	}
	static int [] m2()
	{
		System.out.println("method m2 invoked");
		return new int [] {100,200,300};
		
	}
	
	public static void main(String[] args) {
		ReturnParameterType.m1(new int [] {10,20,30,40,50});
		int []x=ReturnParameterType.m2();
		for (int i : x) {
			System.out.print(i+",");//100,200,300
			
		}
		System.out.println();
	}

}
