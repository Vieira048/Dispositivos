package com.example.meuapp;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import kotlin.Suppress;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase sqLiteDatabase;

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
        @SuppressLint("Range") int id =c.getInt(c.getColumnIndex("id"));
        @SuppressLint("Range")String titulo=c.getString(c.getColumnIndex("titulo"));
        @SuppressLint("Range")nota=c.getString(c.getColumnIndex("nota"));

        Log.d("SELECT", Integer.toString(id)+","+ titulo + "," + nota);
        c.moveToNext();
    }
}