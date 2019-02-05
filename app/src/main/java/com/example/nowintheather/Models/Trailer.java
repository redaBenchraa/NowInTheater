package com.example.nowintheather.Models;

import java.io.Serializable;

public class Trailer  implements Serializable {
    private String code;

    private String href;

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
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
        return "ClassPojo [code = "+code+", href = "+href+"]";
    }
}
