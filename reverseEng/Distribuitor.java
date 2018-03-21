// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Distribuitor.java

package com.ip.work;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.ip.work:
//            Comanda

public class Distribuitor
{

    public Distribuitor()
    {
        comenzi = new ArrayList();
    }

    public void preiaComanda(Comanda c)
    {
        comenzi.add(c);
        c.updateStare();
    }

    public void modificaStare(Comanda c)
    {
        c.updateStare();
    }

    private List comenzi;
}
