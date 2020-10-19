package com.neeraj.set;

import java.util.Iterator;
import java.util.HashSet;

import com.neeraj.Country;

public class HashSetDemoTest {
	public static void main(String[] args) {
		HashSet<String> strings = new HashSet<String>();
		strings.add(new String("Ankush"));
		strings.add(new String("Rajesh"));
		strings.add(new String("Rajesh"));
		strings.add(new String("Neeraj"));
		strings.add(new String("Series"));

		//No Specific order maintained
		Iterator<String> stringItr = strings.iterator();
		while (stringItr.hasNext()) {
			String string = stringItr.next();
			System.out.println(string.toString());
		}
	
		strings.remove(new String("Neeraj"));
		strings.contains(new String("Series"));
			

		// *********************** Example of a HashSet for integer

		HashSet<Integer> integers = new HashSet<Integer>();
		integers.add(200);
		integers.add(20);
		integers.add(250);
		integers.add(50);
		integers.add(25);

		//No specifc order is maintained
		Iterator<Integer> integerItr1 = integers.iterator();
		while (integerItr1.hasNext()) {
			Integer ctr = integerItr1.next();
			System.out.println(ctr);
		}
		
		
		integers.remove(50);
		integers.contains(25);
		
		
		//**********************************Example of a HashSet for User Defined Type like Country
		HashSet<Country> countries = new HashSet<Country>();
		countries.add(new Country(10,"India"));
		countries.add(new Country(7,"America"));
		countries.add(new Country(4,"Bangladesh"));
		countries.add(new Country(12,"Russia"));
		
		
		Iterator<Country> countryItr1 = countries.iterator();
		while(countryItr1.hasNext()) {
			Country ctr = countryItr1.next();
			System.out.println(ctr.name+" "+ctr.population);
		}
		
		countries.remove(new Country(20,"India"));
		countries.contains(new Country(20,"India"));
	}
}
