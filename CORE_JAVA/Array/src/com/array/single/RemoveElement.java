package com.array.single;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;

public class RemoveElement {
	public static int []removeElement(int arr[],int index) {
		if (arr==null||index<0||index>arr.length) {
			System.out.println("hi");
			return arr;
		}
//		int anotherArray[]=new int [arr.length-1];
//		for (int i = 0,k=0; i < arr.length; i++) {
//			if(i==index) {
//				continue;
//			}
//			anotherArray[k]=arr[i];
//			k++;
//		}
//		return anotherArray;
		//for java8
		return IntStream.range(0, arr.length).filter(i ->i!=index).map(i -> arr[i]).toArray();
	}
	public static void main(String[] args) {
		int	arr[] = { 1, 2, 3,3, 4, 5 };
		int j=2;
		int arrays[]=new int [arr.length-1];
			for (int i = 0,k=0; i < arr.length; i++) {
				if(i!=j) {
					arrays[k]=arr[i];
				k++;
				}
			}
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(arrays));
			arr=removeElement(arr, j);
			System.out.println("final "+Arrays.toString(arr));
	}

}

/*

//	Input: arr[] = { 1, 2, 3, 4, 5 }, index = 2
//			Output: arr[] = { 1, 2, 4, 5}
			//////////////////////////////
			public int [] remodata(int[] arr,int index){

				if(arr==null||index<0||index>=arr.length){
				int[] ano=new int[arr.length-1];
				for(int i=0,k=0;i<arr.length;i++){
				if(i==index){
				continue;
				}
				ano[k++]=arr[i];
				}
				return ano;
			
				}
				return arr;
			}
			///
//			public class Main{
//			    public  int[] remodata(int[] arr,int index){
//			if(arr==null||index<0||index>=arr.length){
//
//			int array []=new int[arr.length-1];
//			for(int i=0,k=0;i<arr.length;i++){
//			if(i==index){
//			continue;
//			}
//			array[k++]=arr[i];
//			}
//			return array;
//			}
//			}
//			}
				public static void main(String[] args) {
					// Write your code here...
				
					RemoveElement main=new RemoveElement();
					int	arr[] = { 1, 2, 3, 4, 5 };
					int index=2;
						for (int i = 0; i < arr.length-1; i++) {
							main.remodata(arr, index);
						}
			}


*/