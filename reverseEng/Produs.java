// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Produs.java

package com.ip.work;


public class Produs
{

    public Produs(String nume, String cod, int stoc)
    {
        this.nume = nume;
        this.cod = cod;
        this.stoc = stoc;
    }

    public String getNume()
    {
        return nume;
    }

    public void setNume(String nume)
    {
        this.nume = nume;
    }

    public String getCod()
    {
        return cod;
    }

    public void setCod(String cod)
    {
        this.cod = cod;
    }

    public int getStoc()
    {
        return stoc;
    }

    public void setStoc(int stoc)
    {
        this.stoc = stoc;
    }

    private String nume;
    private String cod;
    private int stoc;
}
