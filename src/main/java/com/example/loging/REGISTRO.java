package com.example.loging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class REGISTRO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }
    public void REGRESAR (View view) {
        Intent fallo = new Intent(REGISTRO.this,MainActivity.class);
        startActivity(fallo);
    }
    public void  SAL(View view){
        Intent fallo = new Intent(REGISTRO.this, SALIDA.class);
        startActivity(fallo);
    }
}