package Exceptions;

import java.util.HashMap;

class CityNotFoundException extends Exception {
    public CityNotFoundException(String message) {
        super(message);
    }

    public void printStackTrace() {
        System.out.println(super.getMessage());
    }
}

class City {
    private HashMap<Integer, String> cityList;

    public City() {
        cityList = new HashMap<>();
        cityList.put(737134, "Singtam");
        cityList.put(193738, "Gangtok");
        cityList.put(737132, "Rangpo");
        cityList.put(855193, "Patna");
    }

    public String findCityByZipCode(int zipCode) throws CityNotFoundException {
        if (cityList.containsKey(zipCode)) {
            return cityList.get(zipCode);
        } else {
            throw new CityNotFoundException("City not found for zip code: " + zipCode);
        }
    }
}


public class TestCity {
    public static void main(String[] args) {
        City city = new City();
        try {
            System.out.println(city.findCityByZipCode(855107));
            System.out.println(city.findCityByZipCode(737134));
        } catch (CityNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/*
Output:

City not found for zip code: 855107
Singtam
*/