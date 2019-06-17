package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class StateComparator implements Comparator<City> {

    @Override
    public int compare(City a, City b) {
        return a.getState().compareTo(b.getState());
    }
}
