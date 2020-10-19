package com.neeraj;

public class Country implements Comparable<Country>{
	public int population;
	public String name;
	
	public Country(int p,String n) {
		this.name = n;
		this.population = p;
	}

	/*@Override
	public int compareTo(Country c2) {
		Country c1 = this;
		if(c1.population == c2.population){
			return 0;
		}else if(c1.population > c2.population) {
			return 1;
		}else {
			return -1;
		}
	}*/
	
	@Override
	public int compareTo(Country c2) {
		Country c1 = this;
		return c1.name.compareTo(c2.name);
	}
}
