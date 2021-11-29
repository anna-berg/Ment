package com.berg.homework2811.Cinema;

import java.util.*;

public class Cinema {
    private Map<Integer, LinkedHashSet<Film>> filmsByYear = new HashMap<>();

    public void addFilm(Film film) {
        if (filmsByYear.get(film.getYear()) == null) {
            filmsByYear.put(film.getYear(), new LinkedHashSet<>(Set.of(film)));
        } else {
            for (Map.Entry<Integer, LinkedHashSet<Film>> entry : filmsByYear.entrySet()) {
                if (entry.getKey() == film.getYear()) {
                    LinkedHashSet<Film> films = entry.getValue();
                    films.add(film);
                    entry.setValue(films);
                }
            }
        }
    }

    public LinkedHashSet<Film> getFilmsByYear(int year) {
        return filmsByYear.get(year);
    }

    public Set<Film> getFilmsByMonthAndYear(int month, int year) {
        Set<Film> byYear = filmsByYear.get(year);
        Set<Film> result = new LinkedHashSet<>();
        for (Film film : byYear) {
            if (film.getMonth() == month) {
                result.add(film);
            }
        }
        return result;
    }

    public Set<Film> getFilmsByGenre(String genre) {
        Set<Film> result = new LinkedHashSet<>();
        for (Set<Film> filmList : filmsByYear.values()) {
            for (Film film : filmList) {
                if (film.getGenre().equals(genre)) {
                    result.add(film);
                }
            }
        }
        return result;
    }

    public List<Film> getTopTenByRating() {
        List<Film> allFilms = new ArrayList<>();
        for (Set<Film> filmList : filmsByYear.values()) {
            allFilms.addAll(filmList);
        }
        allFilms.sort(new RatingComparator().reversed());
        return allFilms.subList(0, 9);
    }
}
