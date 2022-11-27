package com.example.loging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Recuperaracion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperaracion);
    }

    public void regresar (View view){
        Intent anterior = new Intent(Recuperaracion.this,MainActivity.class);
        startActivity(anterior);
    }
}