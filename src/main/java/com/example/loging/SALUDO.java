package com.example.loging;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SALUDO extends AppCompatActivity {

    private TextView saludoM;
            Bundle datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        saludoM = findViewById(R.id.saludoM);
        datos= getIntent().getExtras();
        saludoM.setText(datos.getString("nombre"));
    }
    public void SALIR (View view){
        finish();
    }
}