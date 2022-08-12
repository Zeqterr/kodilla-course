package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    Continent continent = new Continent();
    public List<String> getContinents() {
        List<String> continents = new ArrayList<>();
        continents.add("Azja");
        continents.add("Afryka");
        continents.add("Ameryka Północna");
        continents.add("Ameryka Południowa");
        continents.add("Antarktyda");
        continents.add("Europa");
        continents.add("Australia");
        return continents;
    }
    /*
    public BigDecimal getPeopleQuantity() {
        BigDecimal quantity = getContinents().stream()
                .flatMap(euro -> euro.getCountriesOfEurope().stream())
                .map(Country::getQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(currnet));
        return quantity;
    }

     */
}