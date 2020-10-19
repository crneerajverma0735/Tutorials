package com.neeraj;

import java.util.Iterator;
import java.util.ArrayDeque;

public class ArrayDequeTestDemo {

	public static void main(String[] args) {
		ArrayDeque<String> strings = new ArrayDeque<String>();
		strings.add(new String("Ankush"));
		strings.add(new String("Rajesh"));
		strings.add(new String("Neeraj"));
		strings.add(new String("Series"));

		System.out.println("**Displaying using Iterator**");//No specific order is maintained
		Iterator<String> stringItr = strings.iterator();
		while (stringItr.hasNext()) {
			String string = stringItr.next();
			System.out.println(string.toString());
		}
	
		System.out.println("**Displaing using poll");
		
		int size  = strings.size();
		for(int i=0;i<size;i++) {
			//System.out.println(strings.poll());
			System.out.println(strings.pollLast());
		}
		
			

		// *********************** Example of a ArrayDeque for integer

		ArrayDeque<Integer> integers = new ArrayDeque<Integer>();
		integers.add(200);
		integers.add(20);
		integers.add(250);
		integers.add(50);
		integers.add(25);

		System.out.println("**Displaying using Iterator**");
		Iterator<Integer> integerItr1 = integers.iterator();
		while (integerItr1.hasNext()) {
			Integer ctr = integerItr1.next();
			System.out.println(ctr);
		}
		
		
		System.out.println("**Displaing using poll");
		
		int size1  = integers.size();
		for(int i=0;i<size1;i++) {
			System.out.println(integers.poll());
		}
		
		
		//**********************************Example of a ArrayDeque for User Defined Type like Country
		ArrayDeque<Country> countries = new ArrayDeque<Country>();
		countries.add(new Country(10,"India"));
		countries.add(new Country(7,"America"));
		countries.add(new Country(4,"Bangladesh"));
		countries.add(new Country(12,"Russia"));
		
		
		System.out.println("**Displaying using Iterator**");
		Iterator<Country> countryItr1 = countries.iterator();
		while(countryItr1.hasNext()) {
			Country ctr = countryItr1.next();
			System.out.println(ctr.name+" "+ctr.population);
		}
		

		System.out.println("**Displaing using poll");
		int size2  = countries.size();
		for(int i=0;i<size2;i++) {
			Country ctr1 = (Country)countries.poll();
			System.out.println(ctr1.name+" "+ctr1.population);
		}

	}

}
