package org.launchcode.comparators;

import org.launchcode.City;
import java.lang.Double;
import java.util.Comparator;

public class AreaComparator implements Comparator<City> {

    @Override
    public int compare(City a, City b) {
        return Double.compare(b.getArea(), a.getArea());
    }
}
