package com.example.nowintheather.Models;

import java.io.Serializable;

public class Poster  implements Serializable {
    private String path;

    private String href;

    public String getPath ()
    {
        return path;
    }

    public void setPath (String path)
    {
        this.path = path;
    }

    public String getHref ()
    {
        return href;
    }

    public void setHref (String href)
    {
        this.href = href;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [path = "+path+", href = "+href+"]";
    }
}
