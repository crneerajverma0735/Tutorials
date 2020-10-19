package com.neeraj;

import java.util.Comparator;

public class PopulationComparator implements Comparator<Country>{

	@Override
	public int compare(Country c1, Country c2) {
		if(c1.population == c2.population){
			return 0;
		}else if(c1.population > c2.population) {
			return 1;
		}else {
			return -1;
		}
	}
	
}
