package com.neeraj;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTestDemo {

	public static void main(String[] args) {
		// Example of a LinkedList for string

				LinkedList<String> strings = new LinkedList<String>();
				strings.add(new String("Ankush"));
				strings.add(new String("Rajesh"));
				strings.add(new String("Neeraj"));
				strings.add(new String("Series"));

				// Iterating through the String LinkedList using iterator - Insertion order is
				// maintained
				Iterator<String> stringItr = strings.iterator();
				while (stringItr.hasNext()) {
					String string = stringItr.next();
					System.out.println(string.toString());
				}
			
				Collections.sort(strings); // insertion order is dismissed and rearranged in ascending order

				Iterator<String> stringItr1 = strings.iterator();
				while (stringItr1.hasNext()) {
					String string = stringItr1.next();
					System.out.println(string.toString());
				}

				strings.remove(2); // is going to remove element at index 2

				String a1 = strings.get(1); // is going to get element at index 1

				// *********************** Example of a LinkedList for integer

				LinkedList<Integer> integers = new LinkedList<Integer>();
				integers.add(200);
				integers.add(20);
				integers.add(250);
				integers.add(50);
				integers.add(25);

				Iterator<Integer> integerItr1 = integers.iterator();
				while (integerItr1.hasNext()) {
					Integer ctr = integerItr1.next();
					System.out.println(ctr);
				}
				
				Collections.sort(integers);

				Iterator<Integer> integerItr = integers.iterator();
				while (integerItr.hasNext()) {
					Integer ctr = integerItr.next();
					System.out.println(ctr);
				}
				
				integers.remove(2);
				Integer i1 = integers.get(1);
				
				
				//**********************************Example of a LinkedList for User Defined Type like Country
				LinkedList<Country> countries = new LinkedList<Country>();
				countries.add(new Country(10,"India"));
				countries.add(new Country(7,"America"));
				countries.add(new Country(4,"Bangladesh"));
				countries.add(new Country(12,"Russia"));
				
				Iterator<Country> countryItr1 = countries.iterator();
				while(countryItr1.hasNext()) {
					Country ctr = countryItr1.next();
					System.out.println(ctr.name+" "+ctr.population);
				}
				
				/*Collections.sort(countries,new PopulationComparator());
				Collections.sort(countries,new NameComparator());*/
				Collections.sort(countries);
				
				
				
				Iterator<Country> countryItr = countries.iterator();
				while(countryItr.hasNext()) {
					Country ctr = countryItr.next();
					System.out.println(ctr.name+" "+ctr.population);
				}
				
				countries.remove(2);
				Country co = countries.get(1);
	}

}
