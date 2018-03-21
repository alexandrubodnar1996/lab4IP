// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Comanda.java

package com.ip.work;

import java.io.PrintStream;

public class Comanda
{

    public Comanda(int nrComanda, String stare)
    {
        this.nrComanda = nrComanda;
        this.stare = stare;
    }

    public void afiseazaStare()
    {
        System.out.println("stare");
    }

    public void updateStare()
    {
        System.out.println("schimba starea");
    }

    public void adaugaIstoric()
    {
        System.out.println("adauga la istoric comanda procesta");
    }

    private int nrComanda;
    private String stare;
}
