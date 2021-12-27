package com.berg.homework1128.Cinema;

import java.util.Comparator;

public class RatingComparator implements Comparator<Film> {
    @Override
    public int compare(Film o1, Film o2) {
        return Double.compare(o1.rating(), o2.rating());
    }
}
