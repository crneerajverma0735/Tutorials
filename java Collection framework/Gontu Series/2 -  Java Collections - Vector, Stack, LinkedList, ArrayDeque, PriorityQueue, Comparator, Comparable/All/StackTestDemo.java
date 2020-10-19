package com.neeraj;

import java.util.Stack;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class StackTestDemo {
	public static void main(String[] args) {
		Stack<String> strings = new Stack<String>();
		strings.push(new String("Ankush"));
		strings.push(new String("Rajesh"));
		strings.push(new String("Neeraj"));
		strings.push(new String("Series"));

		System.out.println("**Displaying using Iterator**");
		Iterator<String> stringItr = strings.iterator();
		while (stringItr.hasNext()) {
			String string = stringItr.next();
			System.out.println(string.toString());
		}
	
		System.out.println("**Displaing using pop");
		
		int size  = strings.size();
		for(int i=0;i<size;i++) {
			System.out.println(strings.pop());
		}
		
			

		// *********************** Example of a Stack for integer

		Stack<Integer> integers = new Stack<Integer>();
		integers.push(200);
		integers.push(20);
		integers.push(250);
		integers.push(50);
		integers.push(25);

		System.out.println("**Displaying using Iterator**");
		Iterator<Integer> integerItr1 = integers.iterator();
		while (integerItr1.hasNext()) {
			Integer ctr = integerItr1.next();
			System.out.println(ctr);
		}
		
		
		System.out.println("**Displaing using pop");
		
		int size1  = integers.size();
		for(int i=0;i<size1;i++) {
			System.out.println(integers.pop());
		}
		
		
		//**********************************Example of a Stack for User Defined Type like Country
		Stack<Country> countries = new Stack<Country>();
		countries.push(new Country(10,"India"));
		countries.push(new Country(7,"America"));
		countries.push(new Country(4,"Bangladesh"));
		countries.push(new Country(12,"Russia"));
		
		
		System.out.println("**Displaying using Iterator**");
		Iterator<Country> countryItr1 = countries.iterator();
		while(countryItr1.hasNext()) {
			Country ctr = countryItr1.next();
			System.out.println(ctr.name+" "+ctr.population);
		}
		

		System.out.println("**Displaing using pop");
		int size2  = countries.size();
		for(int i=0;i<size2;i++) {
			Country ctr1 = countries.pop();
			System.out.println(ctr1.name+" "+ctr1.population);
		}
		
		
	}
}
