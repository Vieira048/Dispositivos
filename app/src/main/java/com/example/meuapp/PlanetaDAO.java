package com.example.meuapp;

import java.util.ArrayList;

public class PlanetaDAO {

    public PlanetaDAO() {
        listaPlaneta = new ArrayList<>();
        listaPlaneta.add = (new Planeta( "Mercurio", R.drawable.mercury, "3,285"));
        listaPlaneta.add = (new Planeta( "Venus", R.drawable.venus, "4,867"));
        listaPlaneta.add = (new Planeta( "Terra", R.drawable.earth, "5,972"));
        listaPlaneta.add = (new Planeta( "Marte", R.drawable.mars, "6,390"));
        listaPlaneta.add = (new Planeta( "Jupiter", R.drawable.jupter, "1,898"));
        listaPlaneta.add = (new Planeta( "Saturno", R.drawable.saturn, "5,683"));
        listaPlaneta.add = (new Planeta( "Uranio", R.drawable.uranus, "8,681"));
        listaPlaneta.add = (new Planeta( "Netuno", R.drawable.neptune, "1,024"));
    }

    public ArrayList<Planeta> listaPlaneta(){
        return listaPlaneta;
    }

}
