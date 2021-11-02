package com.qa.sppd.domain;

import java.util.Arrays;
import java.util.List;

public class SppdCharacter {

    private String name;
    private String deckType;
    private int cost;

    public SppdCharacter(String name, String deckType, int cost) {
        super();
        this.setName(name);
        this.setDeckType(deckType);
        this.setCost(cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeckType() {
        return deckType;
    }

    public void setDeckType(String deckType) {
        List<String> validDeckTypes = Arrays.asList("Adventure", "Fantasy", "Mystical", "Neutral", "Sci-fi", "Superheroes");
        if (validDeckTypes.contains(deckType)) {
            this.deckType = deckType;
        } else {
            System.out.println("Invalid deck type specified: " + deckType);
        }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost > 0 && cost < 8) {
            this.cost = cost;
        } else {
            System.out.println("Invalid cost specified: " + cost);
        }
    }

    @Override
    public String toString() {
        return "SppdCharacter[name='" + name + "', deckType='" + deckType + "', cost=" + cost + ']';
    }
}
