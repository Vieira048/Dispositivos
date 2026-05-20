package com.example.meuapp;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import kotlin.Suppress;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase sqLiteDatabase;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        sqLiteDatabase =openOrCreateDatabase("notas",MODE_PRIVATE, null);

        sqLiteDatabase.execSQL("CREATE TABLE notas(id INTEGER PRIMARY KEY AUTOINCREMENT, nota TEXT)");

        ContentValues contentValues=new ContentValues();
        contentValues.put("titulo","joão");
        contentValues.put("nota","7777777777777");
        sqLiteDatabase.insert("notas", null, contentValues);

        //Recuperar Dados de SQLITE
        Cursor c =sqLiteDatabase.rawQuery("SELECT id, id*10,  titulo, nota FROM notas", null);
        c.moveToFirst();
        while (!c.isAfterLast()) {
            @SuppressLint("Range") int id = c.getInt(c.getColumnIndex("id"));
            @SuppressLint("Range") String titulo = c.getString(c.getColumnIndex("titulo"));
            @SuppressLint("Range") nota = c.getString(c.getColumnIndex("nota"));

            Log.d("SELECT", Integer.toString(id) + "," + titulo + "," + nota);
            c.moveToNext();
        ArrayList<String> listaTitulos = new ArrayList<>();
        for (Nota nota :listaNotas){
            listaTitulos.add(nota.titulo);
        }
        }
        ArrayAdapter<String> adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,android.R.listaTitulo);
        lv.setAdapter(adapter);


    }
}