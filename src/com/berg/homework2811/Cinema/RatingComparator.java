package com.berg.homework2811.Cinema;

import java.util.Comparator;

public class RatingComparator implements Comparator<Film> {
    @Override
    public int compare(Film o1, Film o2) {
        return Double.compare(o1.getRating(), o2.getRating());
    }
}
