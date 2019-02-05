package com.example.nowintheather.Models;

import java.io.Serializable;

public class MovieShowTime implements Serializable {
    private String preview;

    private String releaseWeek;

    private OnShow onShow;

    private Scr[] scr;

    private String display;

    private ScreenFormat screenFormat;

    private Version version;

    public String getPreview ()
    {
        return preview;
    }

    public void setPreview (String preview)
    {
        this.preview = preview;
    }

    public String getReleaseWeek ()
    {
        return releaseWeek;
    }

    public void setReleaseWeek (String releaseWeek)
    {
        this.releaseWeek = releaseWeek;
    }

    public OnShow getOnShow ()
    {
        return onShow;
    }

    public void setOnShow (OnShow onShow)
    {
        this.onShow = onShow;
    }

    public Scr[] getScr ()
    {
        return scr;
    }

    public void setScr (Scr[] scr)
    {
        this.scr = scr;
    }

    public String getDisplay ()
    {
        return display;
    }

    public void setDisplay (String display)
    {
        this.display = display;
    }

    public ScreenFormat getScreenFormat ()
    {
        return screenFormat;
    }

    public void setScreenFormat (ScreenFormat screenFormat)
    {
        this.screenFormat = screenFormat;
    }

    public Version getVersion ()
    {
        return version;
    }

    public void setVersion (Version version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [preview = "+preview+", releaseWeek = "+releaseWeek+", onShow = "+onShow+", scr = "+scr+", display = "+display+", screenFormat = "+screenFormat+", version = "+version+"]";
    }
}
