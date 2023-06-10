package com.array.single;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Stream;

public class AscendingOrder {
static void bubbleSort(int a[]) {
	int temp = 0;
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length-1; j++) {
			if (a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				 }	
			}
		}
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
	}	}
static void bubbleSortj(int a[]) {
	int temp = 0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length-i -1; j++) {
			if (a[j]>=a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}		} 	}
		System.out.print(Arrays.toString(a));
}

	public static void main(String[] args) {
		int a[]= {5,2,8,7,3,6,4,5,1};
		bubbleSort( a);
		bubbleSortj(a);
		Integer[] numArray = {4, 3, 2, 5, 6, 7, 3, 2, 1, 9, 7, 8, 10, 6, 4, 3, 5, 8, 9};
		System.out.println("second way");
        Arrays.stream(numArray)
                .sorted(Comparator.reverseOrder())
                .forEach(i -> System.out.print(i + " "));
        System.out.println("third way");
        Arrays.stream(numArray).distinct().sorted().forEach(System.out::print);
        //ascending order
        System.out.println("ascending order");
        Stream.of(numArray).sorted((o1 ,o2)-> o1.compareTo(o2)).distinct().forEach(e -> System.out.print(e));
        //descending order
        System.out.println("descending order");
        Stream.of(numArray).sorted((o1 ,o2)-> o2.compareTo(o1)).distinct().forEach(e -> System.out.print(e));
        
	}       

}
