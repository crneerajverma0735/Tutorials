package com.neeraj;

import java.util.Comparator;

public class NameComparator implements Comparator<Country>{

	@Override
	public int compare(Country c1, Country c2) {
		return c1.name.compareTo(c2.name);
	}
	
}
