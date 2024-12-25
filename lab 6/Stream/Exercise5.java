



import java.util.Objects;
import java.util.Optional;

import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

import java.util.Comparator;

public class Exercise5 {

    public static void main(String[] args) 
    {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();

        City mostPopulatedCapital = countryDao.findAllCountries()
            .stream()
            .mapToInt(country -> country.getCapital())  
            .mapToObj(cityId -> cityDao.findCityById(cityId))  
            .filter(Objects::nonNull)  
            .max(Comparator.comparing(City::getPopulation)).get();  

        System.out.println("Most populated capital: " + mostPopulatedCapital.getName());
    }

}