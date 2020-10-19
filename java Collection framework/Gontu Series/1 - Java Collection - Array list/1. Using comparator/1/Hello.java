package com.neeraj;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hello {
	public static void main(String args[]) throws IOException {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		ArrayList<Integer> arrayInteger = new ArrayList<Integer>();
		arrayInteger.add(200);
		arrayInteger.add(20);
		arrayInteger.add(250);
		arrayInteger.add(50);
		arrayInteger.add(25);
		
		Collections.sort(arrayInteger);
		
		Iterator<Integer> integerItr = arrayInteger.iterator();
		while(integerItr.hasNext()) {
			Integer ctr = integerItr.next();
			System.out.println(ctr);
		}
		
		
		ArrayList<Country> arrayCountry = new ArrayList<Country>();
		arrayCountry.add(new Country(10,"India"));
		arrayCountry.add(new Country(7,"America"));
		arrayCountry.add(new Country(4,"Bangladesh"));
		arrayCountry.add(new Country(12,"Russia"));
		
		Collections.sort(arrayCountry,new PopulationComparator());
		
		Iterator<Country> countryItr = arrayCountry.iterator();
		while(countryItr.hasNext()) {
			Country ctr = countryItr.next();
			System.out.println(ctr.name+" "+ctr.population);
		}
		
		
	}
	
}
