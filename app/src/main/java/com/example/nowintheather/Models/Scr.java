package com.example.nowintheather.Models;

import java.io.Serializable;

public class Scr  implements Serializable {
    private String d;

    private T[] t;

    public String getD ()
    {
        return d;
    }

    public void setD (String d)
    {
        this.d = d;
    }

    public T[] getT ()
    {
        return t;
    }

    public void setT (T[] t)
    {
        this.t = t;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [d = "+d+", t = "+t+"]";
    }
}
