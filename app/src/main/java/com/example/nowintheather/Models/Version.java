package com.example.nowintheather.Models;

import java.io.Serializable;

public class Version  implements Serializable {
    private String original;

    private String code;

    private String name;

    private String lang;

    public String getOriginal ()
    {
        return original;
    }

    public void setOriginal (String original)
    {
        this.original = original;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getLang ()
    {
        return lang;
    }

    public void setLang (String lang)
    {
        this.lang = lang;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [original = "+original+", code = "+code+", name = "+name+", lang = "+lang+"]";
    }
}
