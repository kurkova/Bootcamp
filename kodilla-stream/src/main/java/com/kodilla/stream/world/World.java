package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> theContinent = new ArrayList<>();

    public void addContinent(Continent continent) {
        theContinent.add(continent);
    }
}
