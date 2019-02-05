package com.example.nowintheather.Models;

import java.io.Serializable;

public class OnShow  implements Serializable {
    private Movie movie;

    public Movie getMovie ()
    {
        return movie;
    }

    public void setMovie (Movie movie)
    {
        this.movie = movie;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [movie = "+movie+"]";
    }
}
