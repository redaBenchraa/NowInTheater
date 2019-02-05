package com.example.nowintheather.Models;

import java.io.Serializable;

public class ScreenFormat  implements Serializable {

    private String code;

    private String name;

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

    @Override
    public String toString()
    {
        return "ClassPojo [code = "+code+", name = "+name+"]";
    }
}
