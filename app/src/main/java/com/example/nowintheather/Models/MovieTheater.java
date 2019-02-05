package com.example.nowintheather.Models;

import java.io.Serializable;

public class MovieTheater  implements Serializable {
    private Place place;
    private MovieShowTime[] movieShowtimes;

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public MovieShowTime[] getMovieShowtimes() {
        return movieShowtimes;
    }

    public void setMovieShowtimes(MovieShowTime[] movieShowtimes) {
        this.movieShowtimes = movieShowtimes;
    }

}
