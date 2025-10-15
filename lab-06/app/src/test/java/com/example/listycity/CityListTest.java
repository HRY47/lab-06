package com.example.listycity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CityListTest {
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
        // This line checks if the first city in the cityList (retrieved by cityList.getCities().get(0))
        // is the same as the city returned by mockCity()
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        // This pushes down the original city
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);
        // Now the original city should be at position 1

        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    void testhascity() {
        CityList cityList = mockCityList();
        City city1 = new City("Regina", "Saskatchewan");
        City city2 = new City("Edmonton", "Alberta");
        assertEquals(1, cityList.hasCity(city1));
        assertEquals(0, cityList.hasCity(city2));
    }

    @Test
    void testdeletecity() {
        CityList cityList = new CityList();
        City city1 = new City("Regina", "Saskatchewan");
        City city2 = new City("Edmonton", "Alberta");
        cityList.add(city1);
        cityList.add(city2);
        cityList.delete(city2);
        assertEquals(1, cityList.getCities().size());
    }

    @Test
    void testdeleteexception() {
        CityList cityList = mockCityList();
        City city1 = new City("Regina", "Saskatchewan");
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(city1);
        });
    }

    @Test
    void testcountCities() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());
    }
}
