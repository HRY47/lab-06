package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks if a city exists in the list
     * @param city
     * This is the city to check
     * @return
     * Return 0 if the city exists, -1 otherwise
     */
    public int hasCity(City city) {
        for (int i = 0; i < cities.size(); i++) {
            if ((cities.get(i).getCityName().equals(city.getCityName()))&&
            (cities.get(i).getProvinceName().equals(city.getProvinceName()))) {
                return 0;
            }
        }
        return 1;
    }
    /**
     * This deletes a city from the list
     * @param city
     * This is the city to delete
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * This returns how many cities are in the list
     * @return number of cities
     */
    public int countCities() {
        return cities.size();
    }
}
