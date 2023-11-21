package com.tns.daythree;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person obj = new Person();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the person details");
		String name,gender;
		
		name =sc.nextLine();
		gender = sc.next();
		
		int income,age,tax;
		income= sc.nextInt();
	     age = sc.nextInt();
	     tax= sc.nextInt();
	     
	     obj.setName(name);
	     obj.setGender(gender);
	     obj.setIncome(income);
	     obj.setAge(age);
	     obj.setTax(tax);
	     
	     sc.close();
	     
	    
	     
	     TaxCalculation taxx = new TaxCalculation();
	     
	     taxx.calculateTax(obj);
	     
	     System.out.println(obj);
	     
		
		

	}

}
