package com.array.single;

import java.util.Iterator;

public class EmployeeHighest3rdSalary {
	public static void main(String[] args) {
		Integer employeeSalary[]= {12500,18451,16500,15748,17981};
		
		for (int i = 0; i < employeeSalary.length; i++) {
			int temp=0;
			for (int j = 0; j < employeeSalary.length-1; j++) {
				
				if (employeeSalary[j] > employeeSalary[j+1]) {
					temp=employeeSalary[j];
					employeeSalary[j] = employeeSalary[j+1];
					employeeSalary[j+1] = temp;
				}
			}
			System.out.println(employeeSalary[i]);
		}
		
	}

}
