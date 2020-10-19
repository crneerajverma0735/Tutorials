package com.neeraj.map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.HashMap;

import com.neeraj.Country;

public class HashMapDemoTest {
	public static void main(String[] args) {
		HashMap<String,String> strings = new HashMap<String,String>();
		strings.put(new String("Ankush"),new String("HI i am apple"));
		strings.put(new String("Rajesh"),new String("Hi I am Orange"));
		strings.put(new String("Neeraj"),new String("Hi I am Banana"));
		strings.put(new String("Series"),new String("HI I am Lion"));

		//No Specific order maintained
		Iterator<Entry<String, String>> stringItr = strings.entrySet().iterator();
		while (stringItr.hasNext()) {
			Entry<String, String> entry = stringItr.next();
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
	
		strings.remove(new String("Rajesh"));	
		strings.get(new String("Series"));
		
		// *********************** Example of a HashMap for integer

		HashMap<Integer,String> integers = new HashMap<Integer,String>();
		integers.put(2,new String("HI i am apple"));
		integers.put(20,new String("HI i am orange"));
		integers.put(10,new String("HI i am banana"));
		integers.put(5,new String("HI i am lion"));
		

		//No specifc order is maintained
		Iterator<Entry<Integer,String>> integerItr1 = integers.entrySet().iterator();
		while (integerItr1.hasNext()) {
			Entry<Integer,String> entry = integerItr1.next();
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
		
		
		integers.remove(10);
		integers.get(5);
		
		
		//**********************************Example of a HashMap for User Defined Type like Country
		HashMap<Country,String> countries = new HashMap<Country,String>();
		countries.put(new Country(10,"India"),new String("HI i am apple"));
		countries.put(new Country(7,"America"),new String("HI i am orange"));
		countries.put(new Country(4,"Bangladesh"),new String("HI i am banana"));
		countries.put(new Country(12,"Russia"),new String("HI i am lion"));
		
		
		Iterator<Entry<Country,String>> countryItr1 = countries.entrySet().iterator();
		while(countryItr1.hasNext()) {
			Entry<Country,String> entry= countryItr1.next();
			System.out.println(entry.getKey().population+" "+entry.getValue());
		}
		
		countries.remove(new Country(10,"India"));
		countries.get(new Country(4,"Bangladesh"));
	}
}
