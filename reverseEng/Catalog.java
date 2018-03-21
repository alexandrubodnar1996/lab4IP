// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Catalog.java

package com.ip.work;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.ip.work:
//            Produs

public class Catalog
{

    public Catalog()
    {
        produse = new ArrayList();
    }

    public void removeItem(Produs p)
    {
        if(produse.contains(p))
            produse.remove(p);
    }

    public void addItem(Produs p)
    {
        produse.add(p);
    }

    private List produse;
}
