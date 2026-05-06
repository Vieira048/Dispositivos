package com.example.meuapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class AdapterPlaneta extends ArrayList<Planeta> {
    Context lcontext;

    public AdapterPlaneta(@NonNull Context context, int resource, @NonNull list<Planeta> objects){
        super(context, resource, objects);
        lcontext=context;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        LayoutInflater.from(lcontext);
         return super.getView(position, convertView, parent);
    }

}
