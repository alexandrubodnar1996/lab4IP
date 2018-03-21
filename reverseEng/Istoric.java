// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Istoric.java

package com.ip.work;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Istoric
{

    public Istoric()
    {
        comenzi = new ArrayList();
    }

    public void verificaStare()
    {
        System.out.println("Stare");
    }

    private String codComanda;
    private List comenzi;
}
