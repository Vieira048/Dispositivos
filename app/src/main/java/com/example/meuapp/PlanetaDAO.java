package com.example.meuapp;

import java.util.ArrayList;

public class PlanetaDAO {

    public PlanetaDAO() {
        listaPlaneta = new ArrayList<>();
        listaPlaneta.add = (new Planeta( "Mercurio", R.drawable.mercury));
        listaPlaneta.add = (new Planeta( "Venus", R.drawable.venus));
        listaPlaneta.add = (new Planeta( "Terra", R.drawable.earth));
        listaPlaneta.add = (new Planeta( "Marte", R.drawable.mars));
        listaPlaneta.add = (new Planeta( "Jupiter", R.drawable.jupter));
        listaPlaneta.add = (new Planeta( "Saturno", R.drawable.saturn));
        listaPlaneta.add = (new Planeta( "Uranio", R.drawable.uranus));
        listaPlaneta.add = (new Planeta( "Netuno", R.drawable.neptune));
    }

    public ArrayList<Planeta> listaPlaneta(){
        return listaPlaneta;
    }

}
