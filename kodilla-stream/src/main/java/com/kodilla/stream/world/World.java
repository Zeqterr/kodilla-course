package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class World {
    Continent continent= new Continent();

    public List<String> getContinents() {
        List<String> continents = new ArrayList<>();
        continents.add("Europe");
        continents.add("Asia");
        continents.add("Africa");
        return continents;
    }
}