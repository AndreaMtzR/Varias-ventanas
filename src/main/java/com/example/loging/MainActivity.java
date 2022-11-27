package com.example.loging;
//ANDREA MARTINEZ RUIZ 05/09/2022

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button INGRESAR,bRegistro;
    String nombre= "JUAN PEREZ" , login = "juan", pass= "123";
    private EditText log, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log= findViewById(R.id.usuario);
        password = findViewById((R.id.contraseña));
    }

    public void INGRESAR (View view){
        Intent saludo = new Intent(MainActivity.this,SALUDO.class);
        Intent fallo = new Intent(MainActivity.this, REGISTRO.class);
        String l=log.getText().toString();
        String p=password.getText().toString();
        if ((l.equals(login))&&(p.equals(pass)))
        {
            saludo.putExtra("nombre", nombre);
            startActivity(saludo);
        } else {
            startActivity(fallo);

        }

    }
    public void LIMPIAR(View view) {
        log.setText("");
        password.setText("");
    }
    public void registro (View view) {
        Intent siguiente = new Intent(MainActivity.this, Recuperaracion.class);
        startActivity(siguiente);
    }




}