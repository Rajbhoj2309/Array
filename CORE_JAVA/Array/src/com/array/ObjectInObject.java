package com.array;

public class ObjectInObject {
	public static void main(String[] args) {
		
		Object a[]=new Object [6];
		a[0]=new Emp(111,"ratan");
		a[1]=new Emp(222,"sadan");
		a[2]=new Student(101,"madan");
		a[5]=new Student(102,"madan");
		a[3]=new Integer(25);
		a[4]=new Integer(50);
		
		for (Object obj : a) {
			if(obj instanceof Emp)
			{
				Emp ee=(Emp) obj;
				System.out.println(ee.eid+" <<==>> "+ee.ename);
			}
			if(obj instanceof Student)
			{
				Student std=(Student) obj;
				System.out.println(std.sid+" <<==>> "+std.sname);
			}
			if(obj instanceof Integer)
			{
				System.out.println(obj);
			}
			if(obj==null)
			{
				System.out.println("There are no element in this array"+obj);
			}
		}
	}

}
