package com.example.nowintheather.Models;

import java.io.Serializable;

public class CastingShort  implements Serializable {
    private String actors;

    private String directors;

    public String getActors ()
    {
        return actors;
    }

    public void setActors (String actors)
    {
        this.actors = actors;
    }

    public String getDirectors ()
    {
        return directors;
    }

    public void setDirectors (String directors)
    {
        this.directors = directors;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [actors = "+actors+", directors = "+directors+"]";
    }
}
