package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
        Continent continent = new Continent();
        public BigDecimal getPeopleQuantity() {

                BigDecimal quantity = getContinents().stream()
                        .flatMap(euro -> euro.getCountriesOfEurope().stream())
                        .map(Country::getQuantity)
                        .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
                return quantity;
    }
}
