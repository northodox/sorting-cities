package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;


public class PopulationComparator implements Comparator<City> {

    @Override
    public int compare(City a, City b) {
        return b.getPopulation() - (a.getPopulation());
    }
}

