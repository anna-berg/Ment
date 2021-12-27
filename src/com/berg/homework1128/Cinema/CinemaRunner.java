package com.berg.homework1128.Cinema;

public class CinemaRunner {

    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.addFilm(new Film(1, 2021, 9, "drama", 6.9));
        cinema.addFilm(new Film(2, 2021, 8, "fantastic", 7.9));
        cinema.addFilm(new Film(2, 2021, 8, "fantastic", 7.9));
        cinema.addFilm(new Film(2, 2021, 8, "fantastic", 7.9));
        cinema.addFilm(new Film(3, 2021, 9, "fantasy", 6.2));
        cinema.addFilm(new Film(4, 2020, 7, "drama", 8.5));
        cinema.addFilm(new Film(5, 2020, 7, "fantastic", 4.1));
        cinema.addFilm(new Film(6, 2020, 6, "fantasy", 6.5));
        cinema.addFilm(new Film(7, 2019, 1, "fantasy", 7.4));
        cinema.addFilm(new Film(8, 2019, 3, "drama", 9.6));
        cinema.addFilm(new Film(9, 2019, 9, "drama", 6.9));
        cinema.addFilm(new Film(10, 2018, 8, "fantastic", 7.9));
        cinema.addFilm(new Film(11, 2018, 9, "fantasy", 6.2));
        cinema.addFilm(new Film(12, 2018, 7, "drama", 8.5));
        cinema.addFilm(new Film(13, 2018, 7, "fantastic", 4.1));
        cinema.addFilm(new Film(14, 2020, 6, "fantasy", 6.5));
        cinema.addFilm(new Film(15, 2021, 1, "fantasy", 7.4));
        cinema.addFilm(new Film(16, 2019, 3, "drama", 9.6));

        System.out.println(cinema.getFilmsByGenre("drama"));
        System.out.println(cinema.getFilmsByYear(2021));
        System.out.println(cinema.getFilmsByMonthAndYear(9, 2021));
        System.out.println(cinema.getTopTenByRating());
    }
}
