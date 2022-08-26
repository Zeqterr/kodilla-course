package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public final class World {
    private final  List<Continent> continents = new ArrayList<>();
    public World() {
        List<Continent> continents = new ArrayList<>();
        continents.add(new Continent("Asia"));
        continents.add(new Continent("Europe"));
        continents.add(new Continent("America"));
    }
    public List<Continent>getContinents() {
        return new ArrayList<>(continents);
    }
    public BigDecimal getPeopleQuantity() {
        BigDecimal quantity = getContinents().stream()
                .flatMap(s -> s.getCountriesOfEurope().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return quantity;
    }
}
