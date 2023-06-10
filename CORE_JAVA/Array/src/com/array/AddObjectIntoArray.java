package com.array;

public class AddObjectIntoArray {
	
	
	public static void main(String[] args) {
		/*
		int a []=new int [5];
		a[0]=111;
		for(int x:a) {
			System.out.println(x);
		}
		Emp e1=new Emp(111,"ratan");
		Emp e2=new Emp(222,"madan");
		Emp e3=new Emp(333,"suman");
		Emp [] e=new Emp[5];
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		
		for (Emp emp : e) {
			System.out.println(emp);
		}
		*/
		//			solution    //
		
		Emp [] e=new Emp[5];
		e[0]=new Emp(111,"ratan");
		e[1]=new Emp(222,"madan");
		e[2]=new Emp(333,"suman");
	//	e[3]=new Emp(0,"");
		
		for (Emp ee : e) {
			if (ee instanceof Emp)
			{
				Emp eee=(Emp) ee;
				System.out.println(eee.eid +"   "+eee.ename);
			}
			if(ee==null) 
			{
				System.out.println(ee);
			}
		}
	}

}
