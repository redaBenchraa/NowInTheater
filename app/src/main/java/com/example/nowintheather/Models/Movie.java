package com.example.nowintheather.Models;

import java.io.Serializable;

public class Movie  implements Serializable {
    private CastingShort castingShort;

    private Trailer trailer;

    private String code;

    private Release release;

    private Genre[] genre;

    private Link[] link;

    private String runtime;

    private String title;

    private Poster poster;

    private String trailerEmbed;

    private Statistics statistics;

    public CastingShort getCastingShort ()
    {
        return castingShort;
    }

    public void setCastingShort (CastingShort castingShort)
    {
        this.castingShort = castingShort;
    }

    public Trailer getTrailer ()
    {
        return trailer;
    }

    public void setTrailer (Trailer trailer)
    {
        this.trailer = trailer;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public Release getRelease ()
    {
        return release;
    }

    public void setRelease (Release release)
    {
        this.release = release;
    }

    public Genre[] getGenre ()
    {
        return genre;
    }

    public void setGenre (Genre[] genre)
    {
        this.genre = genre;
    }

    public Link[] getLink ()
    {
        return link;
    }

    public void setLink (Link[] link)
    {
        this.link = link;
    }

    public String getRuntime ()
    {
        return runtime;
    }

    public void setRuntime (String runtime)
    {
        this.runtime = runtime;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public Poster getPoster ()
    {
        return poster;
    }

    public void setPoster (Poster poster)
    {
        this.poster = poster;
    }

    public String getTrailerEmbed ()
    {
        return trailerEmbed;
    }

    public void setTrailerEmbed (String trailerEmbed)
    {
        this.trailerEmbed = trailerEmbed;
    }

    public Statistics getStatistics ()
    {
        return statistics;
    }

    public void setStatistics (Statistics statistics)
    {
        this.statistics = statistics;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [castingShort = "+castingShort+", trailer = "+trailer+", code = "+code+", release = "+release+", genre = "+genre+", link = "+link+", runtime = "+runtime+", title = "+title+", poster = "+poster+", trailerEmbed = "+trailerEmbed+", statistics = "+statistics+"]";
    }
}
