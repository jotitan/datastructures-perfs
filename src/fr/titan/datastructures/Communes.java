package fr.titan.datastructures;

import java.util.ArrayList;
import java.util.Collection;

public class Communes {
    private Collection<Commune> list = new ArrayList<>();

    public void add(Commune commune){
        this.list.add(commune);
    }

    public boolean contains(String name){
        boolean contains = list.contains(new Commune(name,"","",""));

        return contains;
    }
}
