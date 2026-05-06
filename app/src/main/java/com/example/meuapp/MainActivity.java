package com.example.meuapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.listView);
        // Recuperar dados datasource
        PlanetaController pcontrole = new PlanetaController();

        ApapterPlaneta adaptador = new AdapterPlaneta(
                this,
                //XML com texto e img,
                pcontroler.listaPlaneta();
        )


        lv.setAdapter(adaptador);


    }
}