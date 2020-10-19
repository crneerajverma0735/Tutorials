package com.neeraj.set;

import java.util.Iterator;
import java.util.TreeSet;

import com.neeraj.Country;
import com.neeraj.PopulationComparator;

public class TreeSetDemoTest {
	public static void main(String[] args) {
		TreeSet<String> strings = new TreeSet<String>();
		strings.add(new String("Ankush"));
		strings.add(new String("Rajesh"));
		strings.add(new String("Neeraj"));
		strings.add(new String("Series"));

		//guranteed ascending order maintained
		Iterator<String> stringItr = strings.iterator();
		while (stringItr.hasNext()) {
			String string = stringItr.next();
			System.out.println(string.toString());
		}
	
		strings.remove(new String("Ankush"));
		strings.floor(new String("Neeraj"));
		strings.ceiling(new String("Neeraj"));
		strings.first();
		strings.last();

		// *********************** Example of a TreeSet for integer

		TreeSet<Integer> integers = new TreeSet<Integer>();
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
		
		
		integers.remove(200);
		integers.floor(50);
		integers.ceiling(50);
		integers.first();
		integers.last();
		
		
		//**********************************Example of a TreeSet for User Defined Type like Country
		//TreeSet<Country> countries = new TreeSet<Country>(new PopulationComparator());
		TreeSet<Country> countries = new TreeSet<Country>();
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
		countries.floor(new Country(4,"Bangladesh"));
		countries.ceiling(new Country(4,"Bangladesh"));
		countries.first();
		countries.last();
	}
}
