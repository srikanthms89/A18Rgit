package com.tnsif.dayone;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		String name = sc.nextLine();
		System.out.println("Enter student USN");
		String usn = sc.nextLine();
		System.out.println("Enter student Contact number");
		int contact = sc.nextInt();
		System.out.println("The student details are");
		System.out.println("Name "+ name);
		System.out.println("USN "+ usn);
		System.out.println("Contact "+ contact);
		
	}

}
