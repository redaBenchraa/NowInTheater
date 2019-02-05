package com.example.nowintheather.Models;

import java.io.Serializable;

public class Release  implements Serializable {
    private String releaseDate;

    public String getReleaseDate ()
    {
        return releaseDate;
    }

    public void setReleaseDate (String releaseDate)
    {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [releaseDate = "+releaseDate+"]";
    }
}
