package com.tns.dayeight.interfaces;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Student s=new Student(101,"Neha",12000,"C++");
		if (s instanceof Registrable )
		{
			System.out.println("Student is registered for the course");
		System.out.println(s);
		}
		else
			System.out.println("Student is not registered for the course");
			

	}

}
