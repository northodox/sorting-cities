package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class CompoundComparator implements Comparator<City> {

    private List<Comparator<City>> comparators = new ArrayList<>();

    public String add(Comparator<City> x) {
        comparators.add(x);
        return x.toString();
    }

    @Override
    public int compare(City a, City b) {
        if(comparators.size() <= 1) {
            System.out.println("You need at least two comparators!");
        }
        else {
            for (int i = 0; i < comparators.size(); i++) {
                while (comparators.get(i).compare(a, b) != 0) {
                    return comparators.get(i).compare(a, b);
                }
            }
            //return compare(a, b);
        }
        return compare(a,b);
    }
}
