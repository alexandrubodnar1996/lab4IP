// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Cos.java

package com.ip.work;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.ip.work:
//            Produs

public class Cos
{

    public Cos(List produse)
    {
        this.produse = new ArrayList();
        this.produse = produse;
    }

    public void adaugaProdus(Produs p)
    {
        produse.add(p);
    }

    public String getDenumire()
    {
        return denumire;
    }

    public void setDenumire(String denumire)
    {
        this.denumire = denumire;
    }

    public int getCantitate()
    {
        return cantitate;
    }

    public void setCantitate(int cantitate)
    {
        this.cantitate = cantitate;
    }

    public List getProduse()
    {
        return produse;
    }

    public void setProduse(List produse)
    {
        this.produse = produse;
    }

    private String denumire;
    private int cantitate;
    private List produse;
}
