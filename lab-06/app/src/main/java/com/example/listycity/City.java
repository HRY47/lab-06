package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<Object>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * This method returns the city name.
     * @return The city name.
     */
    String getCityName(){
        return this.city;
    }
    /**
     * This method returns the province name.
     * @return The province name.
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This method compares two cities.
     * @return 0 if the cities are the same, 1 if the first city is greater than the second city.
     * @param o The object to compare to.
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        if (this.city.equals(city.getCityName())){
            return 0;
        }
        return 0;
    }

}
