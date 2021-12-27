package com.berg.homework1226.homework.model;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Wizard {

    private final String name;
    private final Map<Crystal, Integer> crystals = new EnumMap<>(Crystal.class);

    public Wizard(String name) {
        this.name = name;
    }

    public void addCrystals(List<Crystal> list){
        list.forEach(crystal -> crystals.merge(crystal, 1, Integer::sum));
    }

    public String getName() {
        return name;
    }

    public int totalCrystals(){
        return crystals.values()
                .stream()
                .reduce(Integer::sum).
                orElse(0);
    }

    public Map<Crystal, Integer> getCrystals() {
        return crystals;
    }
}
