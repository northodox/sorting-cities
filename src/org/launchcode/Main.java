package org.launchcode;

import org.launchcode.comparators.*;

import javax.naming.Name;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();



        // TODO - Use different comparators here
        //AreaComparator comparator = new AreaComparator();
        //NameComparator comparator = new NameComparator();
        //StateComparator comparator = new StateComparator();
        //PopulationComparator comparator = new PopulationComparator();
        CompoundComparator comparator = new CompoundComparator();
        comparator.add(new StateComparator());
        comparator.add(new AreaComparator());
        comparator.add(new NameComparator());
        cities.sort(comparator);
        printCities(cities);

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
