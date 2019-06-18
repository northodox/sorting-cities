package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class CompoundComparator implements Comparator<City> {

    public List<Comparator<City>> comparators = new ArrayList<>();

    public void add(Comparator<City> comparator) {
        this.comparators.add(comparator);
    }

    @Override
    public int compare(City a, City b) {
        int comparison = 0;
        int index = 0;

        while (comparison == 0) {
            comparison = this.comparators.get(index).compare(a, b);
            index++;
            if(index > comparators.size());{
                return 0;
            }
        }
        return comparison;
    }
}
