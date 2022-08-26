package com.kodilla.stream.world;

import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.world.Continent;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Country {
    private String countryName;
    private BigDecimal peopleQuantity;
    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }
    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }
}


