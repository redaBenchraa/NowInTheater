package com.example.nowintheather.Models;

import java.io.Serializable;

public class T  implements Serializable {
    private String p;

    private String code;

    private String tk;

    private String name;

    public String getP ()
    {
        return p;
    }

    public void setP (String p)
    {
        this.p = p;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public String getTk ()
    {
        return tk;
    }

    public void setTk (String tk)
    {
        this.tk = tk;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [p = "+p+", code = "+code+", tk = "+tk+", name = "+name+"]";
    }
}
