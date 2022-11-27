package com.example.loging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SALIDA extends AppCompatActivity {
    private Button SALIR1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salida);
    }
    public void SALIDA (View view){
        Intent anterior = new Intent(SALIDA.this,MainActivity.class);
        startActivity(anterior);
    }
}